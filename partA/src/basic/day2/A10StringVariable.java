package basic.day2;

public class A10StringVariable {
    public static void main(String[] args) {
    //String은 문자열 : 문자 (' ')의 집합
    String message = "Hello~ 안녕!! 하이하이";
    
    System.out.println(message);
    System.out.println("메세지 '" + message + " '의 길이 : " + message.length());

    message = "welcome~ java world!!!!";
    System.out.println("메세지 '" + message + " '의 길이 : " + message.length());
    // String 으로 선언된 변수는 '객체'입니다. 그래서 여러가지 메소드를 갖고 필요한 기능들을 제공해 줍니다.
    
    //char imo =   😊               //char은 2바이트 이모지는 4바이트.문자형으로 저장 안됨.
    String imo = "smail😊";         //이모지는 문자열로 저장해야 합니다.
    System.out.println(imo);

    // 자바 String의 중요한 메소드 7가지 조사해서 테스트 해보기
    // 1. 메소드 괄호안에 아무것도 없는 것.

    // 2. 메소드 괄호안에 정수 1개를 쓰는 것.

    // 3. 메소드 괄호안에 문자열 1개를 쓰는 것.

    // 4. 메소드 괄호안에 정수 2개를 쓰는 것.

    // 5. 메소드 괄호안에 문자열 2개를 쓰는 것.
    

    String length = "이것 저것";

    System.out.println("그냥 " + length);
    System.out.println(3 + length);
    System.out.println("저는 " + length + " 만지고 있습니다.");
    System.out.println();







    // String slice()
    // String substring()
    // String substr()
    // String replace()
    // String replaceAll()
    // String toUpperCase()









    
    
}
}