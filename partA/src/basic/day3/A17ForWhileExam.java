package basic.day3;

public class A17ForWhileExam {
    public static void main(String[] args) {
    // 반목문 for가 활용되는 예시
    String message = "Hello, World~ Hoi";

    System.out.println("1.문자열 길이 만큼 문자 1개를 추출하는 반복문 실행하기");
    // for(int i=0; i<message.length(); i++) {     // i=0 초기화; i=문자열길이 조건식; 반복할 때마다 i++ , 주의할 점: i는 for안에서만 사용합니다.
    //    char temp = message.charAt(i);
    //    System.out.println("i="+ i + "문자=" + temp + (temp=='o'));
    // }
//  위의 for문을 while문으로 바꾸어서 실행해보세요.
    int k = 0;
    while (k<message.length() ) {
        char temp = message.charAt(k);
        System.out.println("k="+ k++ + " 문자=" + temp);
    }
    
    
    System.out.println("\n문자열 길이 만큼 반복문 실행하면서 if 조건문으로 문자열 검사하기");
    System.out.println("\t문자열에서 알파벳 o 의 갯수 구해보기");
    
    int count = 0;
        for(int i=0; i<message.length(); i++) {     
            char temp = message.charAt(i);
            System.out.println("i="+ i + "문자=" + temp + (temp=='o')); 
            if (temp == 'o')count++; {
                System.out.println("o의 개수: " + count);
            }
        
        }
    }
}