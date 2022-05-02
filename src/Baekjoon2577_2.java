import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2577_2 {
    public static void main(String[] args) throws IOException {
        //BufferedReader방법으로 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        0~9가 몇 번 사용되었는지 출력할 배열
        int arr[] = new int[10];
        //bufferedreader로 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int result = A * B * C;
        String resultStr = String.valueOf(result);

        for(int i = 0; i < resultStr.length(); i++){
//            만들어 놓은 빈 배열에 차례대로 하나씩 넣기
            arr[(resultStr.charAt(i)-48)]++;
        }

        for(int v : arr) {
            System.out.println(v);
        }
    }
}
