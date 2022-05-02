import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15552_2 {
    public static void main(String[] args) throws IOException {
//        빠른 입력/출력 : bufferreader/bufferwriter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
//            stromgTokenizer의 토큰 (분리되어있는 문자 반환)
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken())) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
