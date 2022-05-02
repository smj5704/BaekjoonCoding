package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10818_3 {
    public static void main(String[] args) throws IOException {
//        배열을 사용하지 않고 입력받은 문자 즉시 비교 하는 방법 - bufferreader사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()){
            int value = Integer.parseInt(st.nextToken());
            if(value>max) {
                max = value;
            }
            if(value<min) {
                min = value;
            }
        }
        System.out.println(min + " " + max);
    }
}
