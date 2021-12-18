public class Main {
    public static void main(String[] args) {
        Transport car = new Car(1.5, "bmw", "passenger car", 4.4, 2017, 18);
        Transport boat = new Boat(3.5,"Hallberg", "sailboat", 11, 7.5, "B");

        Car car1 = new Car(2.2, "Toyota", "passenger car", 3.2, 2015, 17.5);
        Boat boat1 = new Boat(7.5,"Bavaria", "sailboat", 17, 10.5, "A");

        Transport[] transports = {car, boat};

        for (Transport t: transports)
            t.move();

        boat1.setPassengerCapacity(22);

        car1.printInfo();
        boat1.printInfo();
    }
}
