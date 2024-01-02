package basic.day2;

public class A09HangulCharTest {
//  1. 문자 '나' 부터 ' 냿' 까지 while문으로 출력하기.   ->  변수 char start =  '나';
//  2. 모두 몇 개의 문자가 있는지 개수 구하기. int codeNa. codeNet;

    public static void main(String[] args) {
        char start = '나';
        char end = '낟';
        int codeNa = start;
        int codeNet = end;

        while (start <= end) {
            System.out.print(start++);
        }
        System.out.println(start); // 여기서 start = '넀' 이기 때문에 ▼에 플러스 1 해줘야 한다.
        System.out.println("start ~ end 사이의 문자 개수 = " + (codeNet-codeNa + 1));




    }  
}