package lecture01;

public class Kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int min = min(score);
        int max = max(score);
        double average = average(score);
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + "番 " + score[i] + "点 ");
            if(score[i] < 60){
                System.out.println("不可");
            }
            else if(score[i] < 70){
                System.out.println("可");
            }
            else if(score[i] < 80){
                System.out.println("良");
            }
            else if(score[i] < 90){
                System.out.println("優");
            }
            else{
                System.out.println("秀");
            }
        }
        System.out.println("最高点:" + max +"点");
        System.out.println("最低点:" + min +"点");
        System.out.println("平均点:" + average +"点");
    }
    static int min(int[] score){
       int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }
    static int max(int[] score){
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }
    static double average(int[] score){
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
                  sum = sum + score[i];
        }
        double average = sum/score.length;
        return average;
        }
}

