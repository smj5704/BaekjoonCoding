import java.util.Scanner;

public class Baekjoon10430 {
    //나머지 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,divResult;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();

        divResult = (A+B)%C;
        System.out.println(divResult);

        divResult = ((A%C)+(B%C))%C;
        System.out.println(divResult);

        divResult = (A*B)%C;
        System.out.println(divResult);

        divResult = ((A%C)*(B%C))%C;
        System.out.println(divResult);
    }
}
