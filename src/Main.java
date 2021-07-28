public class Main {
    public static void main(String[] args)
    {
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();

        if(car.cost(500) <= 500) {
            System.out.print("Xiaoming can drive a ");
            car.modeOfTranspo();
        }
        if(bus.cost(300) <= 500) {
            System.out.print("Xiaoming can ride a ");
            bus.modeOfTranspo();
        }
        if(train.cost(400) <= 500) {
            System.out.print("Xiaoming can ride a ");
            train.modeOfTranspo();
        }
        if(plane.cost(1000) <= 500) {
            System.out.print("Xiaoming can ride a ");
            plane.modeOfTranspo();
        }

    }
}
