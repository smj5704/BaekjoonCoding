package Step2;

import java.util.Scanner;

public class Baekjoon2525 {
//    오븐시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        현재 시
        int A = sc.nextInt();
//        현재 분
        int B = sc.nextInt();
//        요리에 필요한 시간(분)
        int C = sc.nextInt();
        sc.close();

        int plusHour = (B+C)/60;

        if(A <= 24 && A >= 0 && B >= 0 && B <= 59 && C > 0 && C <= 1000) {
                A = A + plusHour;
                B = (B+C) - (60*plusHour);
                if (A > 23){
                    A = plusHour - 1;
                }
                System.out.println(A + " " + B);
        }
    }
}
