public class Car extends Transport{
    private double engineCapacity;
    private int releaseDate;

    public Car() {}

    public Car(double weight, String name, String type, double engineCapacity, int releaseDate) {
        super(weight, type, name);
        this.engineCapacity = engineCapacity;
        this.releaseDate = releaseDate;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is driving forward");
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
