package lecture04;

import java.util.ArrayList;


public class ATM {

    private static ArrayList<Account> accountList;

    ATM(){
        accountList = new ArrayList<>();
        }

         void registerAccount(String name,String number){

             accountList.add(new Account(name,number));
             System.out.println(name+" さんのアカウントを口座番号:"+number+"で登録しました。");
         }
         boolean existsAccount(String name,String number){
              int flag = 0;
             for (Account account : accountList ) {
                 if (account.getName().equals(name) && account.getNumber().equals(number)){
                     flag = 1;
                 }
             }
              return flag == 1;
         }
         void deposit(String number,long money){
             for (Account account : accountList ) {
                 if(account.getNumber().equals(number)){
                     account.setBalance(account.getBalance()+money);
                     System.out.println("口座番号:"+number+"に"+money+"円入金しました。");
                 }
             }
    }
         long withdraw(String number,long money) {
             for (Account account : accountList) {
                 if (account.getNumber().equals(number)) {
                     if(account.getBalance() >= money){
                     account.setBalance(account.getBalance() - money);
                     System.out.println("口座番号:" + number + "から" + money + "円引き出しました。");
                     System.out.println("残高:" + account.getBalance() + "円です。");
                     return money;
                 }
                     else{
                         System.out.println("口座番号:" + number + "から" + money + "円引き出せませんでした。");
                         System.out.println("残高:" + account.getBalance() + "円です。");
                     }
                 }
             }
             return 0;
         }
    }

