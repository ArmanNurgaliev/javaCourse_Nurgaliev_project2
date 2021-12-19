package person;

public class Client extends Person implements Printable, ClickHandler {
    private String bankName;

    public Client() {
    }

    public Client(String name, int age, String bankName) {
        super(name, age);
        this.bankName = bankName;
    }

    @Override
    public String show() {
        return "persons.Client " + super.getName() + " from " + bankName;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}

