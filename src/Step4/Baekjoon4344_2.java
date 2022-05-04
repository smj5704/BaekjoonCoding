package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4344_2 {
//    BufferedReader방법
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] stuArr;

    StringTokenizer st;

    for(int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine()," ");
        int stuNum = Integer.parseInt(st.nextToken());
        stuArr = new int[stuNum];

        double scoreSum =0;

        for(int j = 0; j < stuNum; j++) {
//            학생수 만큼 점수 한줄에(StringTokenizer) 입력받기
            int score = Integer.parseInt(st.nextToken());
            stuArr[j] = score;
            scoreSum += score;
        }
        double average = (scoreSum/stuNum);
        double count = 0;

        for(int j = 0; j < stuNum; j++) {
            if(stuArr[j] > average){
                count++;
            }
        }
        System.out.printf("%.3f%%\n",(count/stuNum)*100);
    }

}
}
