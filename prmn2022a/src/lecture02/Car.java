package lecture02;

public class Car {
    int fuel;
    Tire[] tires = new Tire[4];
    Engine engine;

    Car(Tire[] tires,Engine engine){
        this.tires = tires;
        this.engine = engine;
        this.fuel = 0;
    }
    void run(){
        if(this.fuel > 0){
            System.out.println("燃料を1消費して走りました。");
        }
        else{
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    void startEngine(){
        engine.start();
    }
}
