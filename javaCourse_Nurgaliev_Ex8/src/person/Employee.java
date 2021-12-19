package person;

public class Employee extends Person implements Printable, ClickHandler {
    private String bankName;

    public Employee() {
    }

    public Employee(String name, int age, String bankName) {
        super(name, age);
        this.bankName = bankName;
    }

    @Override
    public String show() {
        return "persons.Employee " + super.getName() + " from " + bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
