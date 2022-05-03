package Step4;

import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon3052_1 {
    public static void main(String[] args) {
//        scanner사용
        Scanner sc = new Scanner(System.in);
//        HashSet? 중복되면 하나만 저장, 순서 개념이 x-> 정렬하고싶으면 리스트로 변환 후 정렬
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            hs.add(sc.nextInt()%42);
//            입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장

        }
        sc.close();
//        HashSet의 크기 = 저장되어있는 원소의 개수
        System.out.println(hs.size());
    }
}
