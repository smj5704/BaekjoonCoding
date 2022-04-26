import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        for(int i = 1; i<= n; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            bw.write("CASE #"+i+":"+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bf.close();

        bw.flush();
        bw.close();
    }
}
