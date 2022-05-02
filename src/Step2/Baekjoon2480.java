package Step2;

import java.util.Scanner;

public class Baekjoon2480 {
    //        주사위 세개
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
//        굴린 주사위 값 배열
        int[] scoreArray = { A , B , C };
//        주사위 수 중 최댓값
        int max = 0;
//        상금
        int present = 0;

        if(A > 0 && B > 0 && C > 0 && A <= 6 &&  B <= 6 && C <= 6 ){
            if(A == B && B == C && C == A) {
                present = 10000 + A * 1000;
            }else if(A == B || A == C){
                present = 1000 + A * 100;
            }else if(B == C) {
                present = 1000 + B * 100 ;
            }else {
                for(int i : scoreArray) max = Math.max(i, max);
                present = max * 100;
            }
            System.out.println(present);
        }else {
            System.out.println("again");
        }
    }
}
