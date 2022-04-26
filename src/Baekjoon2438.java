import java.util.Scanner;

public class Baekjoon2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//            줄바꿈
            System.out.println("");
        }
    }
}
