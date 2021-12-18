public class Boat extends Transport{
    private int passengerCapacity;
    private double sailLength;
    public String boatClass;

    public Boat() {}

    public Boat(double weight, String name, String type, int passengerCapacity, double sailLength, String boatClass) {
        super(weight, type, name);
        this.passengerCapacity = passengerCapacity;
        this.sailLength = sailLength;
        this.boatClass = boatClass;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is sailing forward");
    }

    public void printInfo() {
        System.out.println("Boat " + getName() + " with class " + getClass() + " has a passenger capacity = " + getPassengerCapacity());
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getSailLength() {
        return sailLength;
    }

    public void setSailLength(double sailLength) {
        this.sailLength = sailLength;
    }

}
