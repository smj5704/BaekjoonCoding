package Step6;

import java.util.Scanner;

public class Baekjoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int result[] = new int[26];
        int tmp[] = new int[S.length()];

        for(int i = 0; i < result.length; i++) {
            tmp[i] = S.charAt(i)-'a';

        }
        for(int i = 0; i<S.length(); i++ ){
            tmp[i] = S.charAt(i) - 'a';
        }
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < S.length(); j++){
                if(tmp[i] == j && result[j]==-1){
                    result[j] = i;
                }
            }
        }
        for(int i = 0; i < result.length;i++){
            System.out.printf("%d", result[i]);
        }
    }
}
