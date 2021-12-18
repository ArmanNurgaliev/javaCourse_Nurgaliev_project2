public class Transport {
    public double weight;
    protected String type;
    private String name;

    public Transport() {

    }

    public Transport(double weight, String type, String name) {
        this.weight = weight;
        this.type = type;
        this.name = name;
    }

    public void move() {
        System.out.println(this.name + " is moving forward");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}