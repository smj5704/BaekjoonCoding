package Step4;

import java.util.Scanner;

public class Baekjoon2577_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;
        String resultStr = Integer.toString(result);



        for(int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < resultStr.length(); j++) {
//                반드시 charAt() 을 쓸 경우  - '0' 또는 -48 을 연산해야 한다. (아니면 아스키코드에 대응하는 문자가 나온다.)
                if((resultStr.charAt(j)-'0') == i) {
                    count++;
                }
            }
            System.out.println(i + " : " +count);
        }
    }
}
