package Step6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Baekjoon11654 {
    public static void main(String[] args) {
        //아스키 코드 출력하기
        Scanner sc  = new Scanner(System.in);
        //입력은 문자로 받아서 charAt()을 통해 char(문자)로 변환
        //입력받은 문자를 int타입 변수에 저장함으로써 문자에 대응되는 아스키코드 출력
        int str = sc.next().charAt(0);

        System.out.println(str);
    }
}
