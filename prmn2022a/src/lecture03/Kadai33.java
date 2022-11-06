package lecture03;

import java.util.Scanner;

public class Kadai33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1つ目の整数を入力してください:");
        String a = input.nextLine();
        System.out.print("2つ目の整数を入力してください:");
        String b = input.nextLine();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int sum = num1 + num2;
        System.out.println(a + "+" + b + "=" + sum);
    }
}
