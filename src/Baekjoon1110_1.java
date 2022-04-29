import java.util.Scanner;

public class Baekjoon1110_1 {
    public static void main(String[] args) {
//        scanner방법
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        //        10보다 작은수를 입력하였을 때 0붙혀서 두자리수 만들기
        if(A < 10 ) A = A * 10;
        int copy = A;
        //            반복문 돌아간 횟수
        int count = 0;

//        10의 자리수를 구하기 -> / 10 을하면 몫을 가지고올수 있다
//        1의 자리수 구하기 -> % 10 을 하면 나머지가 일이자리수이다
        while(true) {
            int num1 = A / 10;
            int num2 = A % 10;

            //원래 숫자의 일의자리수가 십의자리수가 되고, 각자리수를 더한 값이 일의자리수가 된다.
            A = (num2 * 10) + ((num1 + num2)%10);

            count++;
//            반복문 시행 후 처음 입력값이 계산값과 같아지면 반복문 탈출
            if(copy == A) {
                break;
            }
        }
        System.out.println(count);

    }
}
