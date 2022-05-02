package Step1;

import java.util.Scanner;

public class Baekjoon10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int resultAdd = A+B;
        int resultMinus = A-B;
        int resultMul = A*B;
        double resultDiv = A/B;

        System.out.println(resultAdd);
        System.out.println(resultMinus);
        System.out.println(resultMul);
        System.out.println(resultDiv);


    }
}
