import java.util.Scanner;
//문자열로 변환해서 구하는 방법
//3자리로 고정시키지 않는다.
public class Baekjoon2588_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        입력받을 두 수
        int inputNum1 = sc.nextInt();
        int inputNum2 = sc.nextInt();
//        int를 string으로 변환
        String secondNumString = Integer.toString(inputNum2);
//        입력받은 두번째 수의 문자열을 정수형배열로 만듦. new 연산자
        int[] secondNumArray = new int[secondNumString.length()];
//        입력받은 정수 자리수 갯수
        int numLength = secondNumString.length();
//        입력받은 두번째 숫자의 자리수 개수만큼 반복 문 돌려서 배열에 넣기
        for (int i = 0; i<numLength; i++){
//            char -> 한글자만 담을 수 있는 자료형. scanner로는 char로 받지 못함.
//            charAt() : string으로 받아 저장된 문자열 중 하나만 저장해주는 함수.단, 아스키코드로 출력되다.(0의 아스키코드 : 48)
//            1->49, 2->50,,따라서 0을 빼주면 일반 정수형으로 출력된다.
            secondNumArray[i] = secondNumString.charAt(i)-'0';
        }
        sc.close();
//        첫번째로 입력받은 수와 두번째로 입력받은 정수의 각 자리수를 곱함, 단 거꾸로
        for (int j = numLength-1; j>-1; j--){
             int result = inputNum1 * secondNumArray[j];
             System.out.println(result);
        }
//        최종 곱셈 결과
        System.out.println(inputNum1*inputNum2);


    }
}
