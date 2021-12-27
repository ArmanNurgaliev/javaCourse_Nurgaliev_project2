import java.util.Objects;

public class Phone extends Electronics implements Available, Cloneable{
    private double memorySize;
    private int amount;

    public Phone(double price, String model, double memorySize) {
        super(price, model);
        this.memorySize = memorySize;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void buy() {
        System.out.println("You bought 1 Phone " + this.getModel());
        this.amount++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return getModel().equals(phone.getModel()) && Double.compare(phone.memorySize, memorySize) == 0 && getPrice() == phone.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), memorySize, amount, getPrice());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model=" + getModel() +
                ", memorySize=" + memorySize +
                ", amount=" + amount +
                ", price=" + getPrice() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return  (Phone) super.clone();

    }
}
