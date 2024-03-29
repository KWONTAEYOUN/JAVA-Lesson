package basic.day2;

public class A11StringMethod {
    public static void main(String[] args) {
    // 메소드는 메소드 이름 뒤에 괄호가 따라옵니다. 
    //그리고, 괄호안의 값들은 메소드 처리에 필요한 입력데이터 -> 메소드의 '인자'라고 합니다.
    // 메소드가 처리한 결과는 출력 데이터 -> 메소드의 '리턴(반환)값'이라고 합니다.

    // 자바 String의 중요한 메소드 7가지 조사해서 테스트 해보기.
    // 메소드 인자의 개수와 형식에 따라 분류 해보기.
    String message = "Hello, World~";
    // 1. 메소드 괄호안에 아무것도 없는 것 : length, isEmpty, toUppercase, toLowerCase
    System.out.println("message.length()" + message.length());
    System.out.println("message.toUpperCase()" + message.toUpperCase());
    System.out.println("message.isEmpty()" + message.isEmpty());
    // 2. 메소드 괄호안에 정수 1개를 쓰는 것 : charAt
    // 문자의 문자열은 0부터 순서대로 문자에게 번호를 매깁니다. -> index
    // 현재 message에서 마지막 인덱스는 얼마인가? -> lengh - 1
    System.out.println("message.charAt(0)" + message.charAt(0));
    System.out.println("message.charAt(3)" + message.charAt(3));
    System.out.println("message.charAt(4)" + message.charAt(4));
    // 3. 메소드 괄호안에 문자열 1개를 쓰는 것 : concat, equals, startsWitch, endWith
    System.out.println("message.concat(\"~짱짱\") :"  + message.concat("~짱짱"));
    //대소문자 구분하면서 hello로 시작하는지 검사하는 메소드
    System.out.println("message.startsWith(\"hello\") :" + message.startsWith("hello"));
    System.out.println("message.startsWith(\"Hello\") :" + message.startsWith("Hello"));
    System.out.println("message.endsWish(\"~\") :"  + message.endsWith("~"));
    //문자열 안에서 원하는 단어의 위치를 찾기.
    System.out.println("message.indexOf(\"World\") :" + message.indexOf("World"));
    System.out.println("message.indexOf(\"world\") :" + message.indexOf("world"));
    // 4. 메소드 괄호안에 정수 2개를 쓰는 것 : substring (문자열 부분 추출: 시작 인덱스 마지막 인덱스 값을 인자로 주기)
    System.out.println("message.substring(0, 4) :" + message.substring(0, 4)); //Hell
    System.out.println("message.substring(2, 4) :" + message.substring(2, 4)); //ll
    // 추출할 때 마지막 인덱스 4는 포함 안 함, 결국 추출하는 문자개수는 endIndex-beginIndex 공식이 성립합니다.
    message = "hello";
    System.out.println("message.equals(\"Hello\")" + message.equals("Hello"));
    System.out.println("message.equals(\"hello\")" + message.equals("hello"));
    // 5. 메소드 괄호안에 문자열 2개를 쓰는 것 : replace
    System.out.println(message.replace("ll", "****"));

    // 질문 공유
    // 1) 메소드의 리턴타입에 따라 결과를 저장할 변수를 일치하는 형식으로 선언하기.
    message.toUpperCase().substring(0, 0);
    // 2) 문자열 리턴값으로 또 메소드 실행할 수 있음.
    System.out.println("message.toUpperCase().substring(2, 4) :" + message.toUpperCase().substring(2, 4));
    int len = message.length();
    
    // 리턴값 형식을 기준으로 정리하기
    // boolean : startsWitch, endWith, equals, isEmpty, isBlank
    // String : charAt, concat, substring, replace, toUpperCase
    // int : length, indexOf
    // char : charAt

















    }
}
