import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon2588_2 {
    //    나눗셈 연산을 이용한 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        입력받을 두 수
        int inputNum1 = sc.nextInt();
        int inputNum2 = sc.nextInt();
//        ArrayList : 크기가 가변적으로 변하는 선형리스트
//        ArrayList선언
//        잘못된 타입으로 캐스팅(형변환)을 할 수도 있으니 타입을 명시해서 선언해야한다
//        정수형 객체들만 add되어질 수 있고 다른 타입의 개게는 사용이 불가하게 만듦
        ArrayList<Integer> secondNumArray = new ArrayList<>();

        while(inputNum2 > 0) {
//            입력받은 두번째 수를 10으로 나눠서 arraylist에 담기
            secondNumArray.add(inputNum2%10);
//            다음 루프를 돌 때 입력받은 두번째 수를 10으로 나눈 수로 저장하여 루프 돌리기
            inputNum2 /= 10;
//            ex) 12345 % 10 = 1234...5(마지막 자리수 = 나눗셈 후 나머지)
//                1234를 inputNum2로 저장 후 같은결과 반복
        }
//        .size() : 입력받은 두번째 수의 각 자리수로 나누어 만든 arraylist의 데이터 개수 구하는 함수
        int n = secondNumArray.size();
        for (int i = n-1; i>-1;i--){
            int result = inputNum1 ;
            System.out.println(result);
        }
        System.out.println(secondNumArray.size());
    }
}
