import java.util.Scanner;

public class Baekjoon2884 {
//    알람시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if(hour <= 24 && hour >= 0 && minute >= 0 && minute <= 59){
            if(minute < 45) {
//                시간 1 감소
                hour--;
                minute = 60 - (45 - minute);
                if(hour < 0){
                    hour = 23;
                }
                System.out.println(hour);
                System.out.println(minute);
            }else {
                minute = minute - 45;
                System.out.println(hour);
                System.out.println(minute);
            }
        }
    }
}

