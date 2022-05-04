package Step4;

import java.util.Scanner;

public class Baekjoon8958_1 {
    public static void main(String[] args) {
//        scanner방식
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strOX[] = new String[n];

        for(int i = 0; i < n; i++) {
            strOX[i] = sc.next();
        }
        sc.close();
        int OXCount = strOX.length;
        for(int i = 0; i < OXCount; i++) {
//            결과값이 연속되는 횟수
            int countinueCnt = 0;
//            결과 점수 합
            int resultSum = 0;
            for(int j = 0; j < strOX[i].length(); j++){
//                o이면 1점씩 더해줌
                if(strOX[i].charAt(j) == 'O'){
                    countinueCnt++;
                }else {
//                    한번 틀리면 점수1씩더해지기 리셋
                    countinueCnt = 0;
                }
//                결과값 원소(strOX)갯수 만큼 루프돌려 점수를 합산하여 더하기
                resultSum += countinueCnt;
            }
            System.out.println(resultSum);
        }
    }
}
