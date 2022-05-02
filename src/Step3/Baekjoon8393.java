package Step3;

import java.util.Scanner;

public class Baekjoon8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
//        합계 초기화
        int sum = 0;

        if(n>=1 && n<= 10000){
            for(int i = 0;i <= n;i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
