package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lists = new ArrayList<>();
        System.out.println("何行分入力しますか?");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            String b = input.nextLine();
            System.out.print(i+1 + "行目:");
            lists.add(input.nextLine());
        }
        System.out.println("入力した文字列:");
        for(String list : lists){
            System.out.println(list);
        }
    }
}
