package lecture02;

public class Kadai22 {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gas = new GasStation();
        car.run();
        gas.refuel(car);
        car.run();
    }
}
