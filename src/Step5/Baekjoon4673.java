package Step5;

public class Baekjoon4673 {
    //메인
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        //1부터 10000까지 검사할 때 d함수로 숫자를 넣어보며 return 되는 수는 해당 number를 생성자로 하는 수
        for(int i = 1; i < 10001; i++){
            int n = d(i);
            //10000이 넘는 수는 필요가 없음
            if(n < 10001) {
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10001; i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    //함수
    public static int d(int number){
        int sum = number;

        while(number != 0 ){
            //각자리수를 더해주기 위해 나머지 연산자와 나눗셈 연산자로 10단위씩 number를 줄여나감. -> 0이아닐때까지 반복
            //첫째자리수
            sum = sum + (number % 10);
            //첫째자리수 없애기
            number  =number/10;
        }
        return sum;
    }
}
