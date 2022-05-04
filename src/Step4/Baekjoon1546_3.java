package Step4;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1546_3 {
    public static void main(String[] args) throws IOException {
//        배열을 사용하지 않는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        max와 원소값으 비교한 뒤 큰 수가 max로 초기화해주는 방법
//        자동형변환을 위해 sum변수는 double로 선언
        int max = 0;
        double sum = 0.0;

        for(int i = 0; i < n; i++ ){
            int value = Integer.parseInt(st.nextToken());

            if(value > max) {
                max = value;
            }
            sum += value;
        }
        System.out.println(((sum / max) * 100.0) / n);
    }
}
