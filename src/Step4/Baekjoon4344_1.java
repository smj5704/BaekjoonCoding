package Step4;

import java.util.Scanner;

public class Baekjoon4344_1 {
    public static void main(String[] args) {
//        Scanner사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        빈배열선언
        int[] stuArr;

        for(int i = 0; i < n; i++) {
//            각 케이스 마다 점수를 받을 학생 수 입력받기
            int stuNum = sc.nextInt();
//            배열 선언
            stuArr = new int[stuNum];
//            각 케이스 마다 받은 점수들의 합 - 평균을 구하기 위함
            double socreSum = 0;
//            점수를 입력받을 학생 수 만큼 loop돌려서 성적 입력
            for(int j = 0; j < stuNum;j++){
//                각 케이스 수 만큼 점수 입력받기
                int score = sc.nextInt();
//                stuArr배열에 입력받은 점수 넣기
                stuArr[j] = score;
//                stuArr배열에 들어가는 점수 합
                socreSum += score;
            }
//            각 케이스마다 입력받은 점수 평균
            double average = (socreSum / stuNum);
//            평균점수를 넘는 학생들의 수
            double count = 0;
//            평균점수를 넘는 학생들의 비율 찾기
            for(int j = 0; j < stuNum; j++) {
//                해당 배열 내 점수 데이터 중 평균보다 크면 count
                if(stuArr[j] > average) {
                    count++;
                }
            }
//            printf를 사용한 소수점 셋째짜리까지 출력
            System.out.printf("%.3f%%\n",(count/stuNum)*100);

        }
        sc.close();
    }
}
