import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1110_2 {
    public static void main(String[] args) throws IOException {
//        bufferedreader방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int count = 0;
        //        10보다 작은수를 입력하였을 때 0붙혀서 두자리수 만들기
        if(A < 10 ) A = A * 10;
        int copy = A;

        while (true) {
            int num1 = A / 10;
            int num2 = A % 10;

            //원래 숫자의 일의자리수가 십의자리수가 되고, 각자리수를 더한 값이 일의자리수가 된다.
            A = (num2 * 10) + ((num1 + num2)%10);

            count++;
            if(copy == A) {
                break;
            }
        }
        System.out.println(count);

    }
}
