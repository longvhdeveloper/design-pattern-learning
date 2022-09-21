public class Main {
    public static void main(String[] args) {
        // subclass is can replace for superclass without break
        Vehicle car = new Car();
        car.getCubicCapacity();

        Vehicle bus = new Bus();
        bus.getSpeed();
    }
}
