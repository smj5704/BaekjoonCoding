import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10952_2 {
//    BufferedReader 사용
//    한번에 입력값을 받고 반복문을 탈출하여 입력이 끝난 후 출력이 시작된다 -> scanner보다 빠르다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st ;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 & B == 0) break;
            int result = A + B;
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
