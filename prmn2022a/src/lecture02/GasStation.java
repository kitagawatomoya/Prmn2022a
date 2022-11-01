package lecture02;

public class GasStation {
    void refuel(Car car){
        car.fuel += 20;
        System.out.println("給油によりfuelが20増えました。");
    }
}
