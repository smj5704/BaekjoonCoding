package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3052_3 {
    public static void main(String[] args) throws IOException {
        //boolean배열 생성(default 값 : false)
        //나머지가 나올 수 있는 경우의 수 -> 0~41
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine())%42] = true;
        }
        int count = 0;
        //boolean타입의 배열의 값 하나하나 - value
        //true의 원소 개수를 세어준다.
        for (boolean value : arr) {
            //만약 value가 true라면 ?
            if(value) {
                count++;
            }
        }
        System.out.println(count);
    }
}
