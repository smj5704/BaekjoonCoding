package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958_2 {
    public static void main(String[] args) throws IOException {
//        BufferReadered방식_println()로 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String strArrOX[] = new String[n];

        for(int i = 0; i < n ; i++) {
            strArrOX[i] = br.readLine();
        }
        br.close();

        for(int i = 0; i < strArrOX.length; i++) {
            int continueOX = 0;
            int resultSum = 0;
            for(int j = 0; j < strArrOX[i].length(); j++) {
                if(strArrOX[i].charAt(j) == 'O') {
                    continueOX++;
                }else {
                    continueOX = 0;
                }
                resultSum += continueOX;
            }
            System.out.println(resultSum);
        }

    }
}
