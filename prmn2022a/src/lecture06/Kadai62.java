package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Kadai62 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random rand = new Random();
        integers.add(new Integer(rand.nextInt(6)+1));
        integers.add(new Integer(rand.nextInt(6)+1));
        integers.add(new Integer(rand.nextInt(6)+1));
        integers.add(new Integer(rand.nextInt(6)+1));
        integers.add(new Integer(rand.nextInt(6)+1));

        Scanner input = new Scanner(System.in);
        System.out.println("さいころを5つ振りました.");
        System.out.println("何番目のさいころの値を確認しますか？");

        try {
            int index = input.nextInt();
            System.out.println(integers.get(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します.");
        }

    }
}
