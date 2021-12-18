public class Main {
    public static void main(String[] args) {
        Transport car = new Car(1.5, "bmw", "passenger car", 4.4, 2017);
        Transport boat = new Boat(3.5,"Hallberg", "sailboat");

        Transport transports[] = {car, boat};

        for (Transport t: transports)
            t.move();
    }
}
