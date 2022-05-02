package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10951_2 {
    //    BufferedReader방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        출력은 StringBuilder로 출력
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
//            nextToken()은 문자열을 반환하기 때문에 int형으로 변환시켜줘야한다
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(0<A && 0<B && B<10){
               sb.append(A+B).append("\n");
            }
        }
        System.out.println(sb);
    }
}
