package Step2;

import java.util.Scanner;

public class Baekjoon2753 {
    //    윤년문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
//        윤년? 4의 배수이고 100의 배수가 아니거나 400의 배수
        if(year%4 == 0) {
            if(year%100 != 0 || year%400 == 0) {
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }else {
            System.out.println("0");
        }
}
}
