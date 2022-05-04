package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1546_2 {
//    BufferedReader방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double arr[] = new double[n];
//        BufferedReader는 공백까지 한 줄로 한번에 받기 때문에 문자열 분리가 필요함. -> StringTokenizer사용
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
//            String -> double
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.print(sum / arr.length);

    }
}
