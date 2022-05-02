package Step1;

import java.util.Scanner;

public class Baekjoon18108 {
        //불기년도 -> 서기년도 문제
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        불기년도 = 서기년도 + 544
            int BudYear = sc.nextInt();
            int ADYear = BudYear - 543;
            sc.close();
            System.out.println(ADYear);

        }
    }


