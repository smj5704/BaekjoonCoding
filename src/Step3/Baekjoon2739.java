package Step3;

import java.util.Scanner;

public class Baekjoon2739 {
    public static void main(String[] args) {
        //구구단
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result ;
        if(n >= 1 && n <= 9){
            for(int i = 1; i < 10; i ++){
                result = n * i;
                System.out.print(n + " * " + i + " = " );
                System.out.println(result);
            }
        }

    }
}
