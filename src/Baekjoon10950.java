import java.util.Scanner;

public class Baekjoon10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];

//        T번 루프 돌아감
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
//            더한값을 배열에 넣음
            arr[i] = A+B;
        }
        sc.close();

        for(int k : arr) {
            System.out.println(k);
        }
    }
}
