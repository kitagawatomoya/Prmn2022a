package lecture02;

import java.sql.SQLOutput;

public class Human {
    String name;
    int age;

    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    void print(){
        if(this.age <= 18){
            System.out.print("生徒:");
        }
        else if(this.age <= 22){
            System.out.print("学生:");
        }
        else{
        }
        System.out.println(this.name + " " + this.age + "歳です。");
    }
}
