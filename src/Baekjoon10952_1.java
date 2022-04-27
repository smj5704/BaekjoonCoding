import java.util.Scanner;

public class Baekjoon10952_1 {
//    scanner사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        무한반복
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
//           A 와 B가 0이면 스캐너 입력 중지 후 출력
            if(A == 0 && B == 0) break;
            int result = A+B;
            System.out.println(result);
        }
        sc.close();
    }
}
