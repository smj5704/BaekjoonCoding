package Step5;

public class Baekjoon15596 {
    long sum(int[] a){
//        a : 합을 구해야 하는 정수 n개가 저장되어있는 배열
        long sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
//        return되는 타입은 long이어야 한다
        return sum;
    }
}
