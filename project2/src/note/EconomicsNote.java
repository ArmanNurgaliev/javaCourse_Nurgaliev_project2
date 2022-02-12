package note;

import user.User;

public class EconomicsNote extends Note implements Mutable, Showable {
    private double exchangeRate;

    public EconomicsNote(String name, String body, User author, double exchangeRate) {
        super(name, body, author, exchangeRate);
    }


    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    @Override
    public void show() {
        System.out.println(this.getName());
        System.out.println(this.getBody());
        System.out.println("Exchange rate of dollar: " + this.getExchangeRate());
        System.out.println("Author: " + this.getAuthor());
    }
}
