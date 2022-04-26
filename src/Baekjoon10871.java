import java.util.Scanner;

public class Baekjoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
//        N개만큼 배열 스캐너로 입력받기
        int arr[] = new int[N];
        for(int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

//        배열개수만큼 루프가 돌아감.
//        배열안에 수 중 x보다 작은 값 출력
        for(int i = 0; i < N; i++){
            if(arr[i] < X) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
