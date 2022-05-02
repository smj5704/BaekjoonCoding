package Step4;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10818_1 {
//    스캐너이용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
//        배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드
        Arrays.sort(arr);
//        오름차순이니까 index첫번째 값이 최댓값 마지막 값이 최소값
        System.out.print(arr[0] + " " + arr[n-1]);
    }

}
