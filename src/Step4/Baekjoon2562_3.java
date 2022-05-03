package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2562_3 {
    public static void main(String[] args) throws IOException {
        //배열을 쓰지 않는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int index = 0;
        for(int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value > max) {
                max = value;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);


    }
}
