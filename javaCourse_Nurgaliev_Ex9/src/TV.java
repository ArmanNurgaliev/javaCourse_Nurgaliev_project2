import java.util.Objects;

public class TV extends Electronics implements Available, Cloneable {
    private int size;
    private int amount;

    public TV(double price, String model, int size) {
        super(price, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void buy() {
        System.out.println("You bought 1 TV " + this.getModel());
        this.amount++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return getModel().equals(tv.getModel()) && size == tv.size && getPrice() == tv.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), size, amount);
    }

    @Override
    public String toString() {
        return "TV{" +
                "model=" + getModel() +
                ", size=" + size +
                ", amount=" + amount +
                ", price=" + getPrice() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
