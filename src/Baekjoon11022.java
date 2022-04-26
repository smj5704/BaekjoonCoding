import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        for(int i = 1; i<=n;i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("CASE #" + i + ": " + A + " + " + B + " = " + (A+B) + "\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
