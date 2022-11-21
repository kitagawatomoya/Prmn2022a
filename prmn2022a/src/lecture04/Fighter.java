package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }
    public void attack(Fighter enemy){
        System.out.println(this.name + " は " + enemy.getName() + " に " + this.power + " ダメージを与えた。");
        enemy.hitPoint = enemy.hitPoint - this.power;
    }
    public boolean isAlive(){
         return (this.hitPoint <= 0);
    }

    public int getHitPoint() {
         return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public String getName(){
         return name;
    }
}
