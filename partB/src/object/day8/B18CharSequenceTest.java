package object.day8;

// CharSequence 는 자바에서 만든 인터페이스 입니다.
// 어떻게 동작하는 지 예시를 보겠습니다.
public class B18CharSequenceTest {
    public static void main(String[] args) {
        CharSequence csstr = new String("Hello Java");
        CharSequence cssd = new StringBuilder("Hi 자바");

        String temp = "자바 Hello~ Hi Java";
        System.out.println("charsequnce 타입을 인자로 하는 메소드 확인");
        System.out.println("contains : temp 객체에 cssstr 문자열이 포함되어 있는가?");
        System.err.println(temp.contains(csstr));   // false
        System.err.println(temp.contains(cssd));    //fales
        System.out.println(temp.contains("Hello~"));    //true

        System.out.println("결론 : 메소드인자가 인터페이스 타입일 때에는");
        System.out.println("여러가지 구현 클래스가 인자로 전달될 수 있습니다.");

 


    }
}
