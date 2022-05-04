package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958_3 {
    public static void main(String[] args) throws IOException {
        //    BufferReadered_StringBuilder로 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String strArrOX[] = new String[n];

        for(int i = 0; i < n; i++) {
            strArrOX[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            int continueCnt = 0;
            int resultSum = 0;
            for(int j = 0; j < strArrOX[i].length(); j++) {
                if(strArrOX[i].charAt(j) == 'O'){
                    continueCnt++;
                }else {
                    continueCnt = 0;
                }
                resultSum += continueCnt;
            }
            sb.append(resultSum).append('\n');
        }
        System.out.println(sb);
    }

}
