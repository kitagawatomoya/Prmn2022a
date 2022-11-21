package lecture04;

public class Kadai42 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        if(atm.existsAccount("藤井智子","12345") == true){
            System.out.println("名前:藤井智子 口座番号:12345 は存在します。");
        }
        else {
            System.out.println("名前:藤井智子 口座番号:12345 は存在しません。");
        }
        atm.registerAccount("藤井智子","12345");
        if(atm.existsAccount("藤井智子","12345") == true){
            System.out.println("名前:藤井智子 口座番号:12345 は存在します。");
        }
        else {
            System.out.println("名前:藤井智子 口座番号:12345 は存在しません。");
        }
        atm.deposit("12345",1000);
        atm.withdraw("12345",2000);
        atm.withdraw("12345",500);
    }
}
