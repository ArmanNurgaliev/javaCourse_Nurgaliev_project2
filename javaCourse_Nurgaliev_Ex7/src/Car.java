public class Car extends Transport{
    private double engineCapacity;
    private int releaseDate;
    public double wheelsDiameter;

    public Car() {}

    public Car(double weight, String name, String type, double engineCapacity, int releaseDate, double wheelsDiameter) {
        super(weight, type, name);
        this.engineCapacity = engineCapacity;
        this.releaseDate = releaseDate;
        this.wheelsDiameter = wheelsDiameter;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is driving forward");
    }

    public void printInfo() {
        System.out.println("Car " + getName() + " with engine capacity " +
                engineCapacity + "L, release date " +
                releaseDate + " year and wheels diameter " +
                wheelsDiameter + "inch");
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }


}
