package lecture04;

public class Kadai41 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100,20,"Fighter1");
        Fighter fighter2 = new Fighter(80,15,"Fighter2");

        while (true){
            fighter1.attack(fighter2);
            fighter2.setHitPoint(fighter2.getHitPoint());
            System.out.println(fighter2.getName() + " の残り　hitPoint :" + fighter2.getHitPoint());
            if (fighter2.isAlive()){
                System.out.println(fighter2.getName() + " は倒れた。");
                return;
            }
            fighter2.attack(fighter1);
            fighter1.setHitPoint(fighter1.getHitPoint());
            System.out.println(fighter1.getName() + " の残り　hitPoint :" + fighter1.getHitPoint());
            if (fighter1.isAlive()){
                System.out.println(fighter1.getName() + " は倒れた。");
                return;
            }
        }
    }
}
