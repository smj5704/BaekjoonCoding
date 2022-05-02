package Step4;

import java.util.Scanner;

public class Baekjoon2562_1 {
    //스캐너 방법으로 풀기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int count = 0;
        int max = 0;
        int index = 0;

        for(int i = 0; i<n; i++) {
            
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int value : arr) {
            count++;
//            배열의 원소를 하나씩 value에 저장한 뒤 final_value와 value값을 비교하여
//            value 가 final_value보다 크면 count값과 value값을 각각 저장한다
            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
