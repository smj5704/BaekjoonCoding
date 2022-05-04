package Step4;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546_1 {
    public static void main(String[] args) {
//        Scanner방법
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        //평균을 위한 합
        double sum = 0;
        //최고점을 가지고오기 위한 정렬
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            //최고점 x 실 점수
            sum += ((arr[i] / arr[arr.length-1])*100);
        }
        System.out.println(sum / arr.length);
    }
}
