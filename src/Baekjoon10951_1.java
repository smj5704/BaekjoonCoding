import java.io.IOException;
import java.util.Scanner;

public class Baekjoon10951_1 {
    public static void main(String[] args) throws IOException {
//        두 정수는 공백으로 나뉜다
//        더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료한다
//        **EOF(End of Filf) ? 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 바복문을 종료하라
//        방법 1 : scanner
        Scanner sc = new Scanner(System.in);
//        scanner의 메소드 hasNextInt() : 입력받을 값이 있는가 없는가
//        숫자가 아닌 문자같은 값을 입력하면 반복문을 탈출함
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;
            System.out.println(result);
        }
        sc.close();
    }
}
