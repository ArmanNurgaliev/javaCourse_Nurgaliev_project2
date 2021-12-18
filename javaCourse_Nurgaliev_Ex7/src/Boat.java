public class Boat extends Transport{

    public Boat() {}

    public Boat(double weight, String name, String type) {
        super(weight, type, name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is sailing forward");
    }
}
