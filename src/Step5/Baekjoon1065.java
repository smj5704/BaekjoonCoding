package Step5;

import java.util.Scanner;

public class Baekjoon1065 {
    public static void main(String[] args) {
        //등차수열 : 연속하는 두 항의 차이가 모두 일정한 수열
        //ex) 1111, 12345, 1357,,
        //an = a1 + (n-1)*d
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(arithmetic_sequence(n));
        sc.close();

    }

    public  static int arithmetic_sequence(int num) {
        //한수 카운팅
        int cnt = 0;

        //1~99는 모두 등차수열이다.
        //100보다 작은 수는 모두 카운팅
        if(num < 100) {
            return num;
        }
        //100보다 큰수 비교. 100까지는 모두 카운팅되어서 99개로 시작 (초기화)
        else {
            cnt = 99;

            for(int i = 100; i <= num; i++){
                //백의자리수
                int hund = i / 100;
                //십의자리수
                int ten = (i / 10)%10;
                //일의자리수
                int one = i % 10;

                //각자리수의 차이가 같다면 -> 등차수열
                if((hund - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
