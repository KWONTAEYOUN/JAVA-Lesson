package object.day8_interface;

public class B16MyClassMain {
    public static void main(String[] args) {
        
        // 인터페이스는 객체 생성 못함.
        // 단, 익명 내부 타입으로 정의는 가능.
        // InterfaceA ifa = new InterfaceA() 
            
        // 구현클래스로 객체 생성
        MyClassA mya = new MyClassA();

        // 업 캐스팅
        InterfaceA ifa = new MyClassA();

        // 다운 캐스팅 가능합니다.
        MyClassA temp = (MyClassA)ifa;
        System.out.println("참조타입 변수와 상관없이 똑같이 실행됩니다.");
        mya.methodA();
        ifa.methodA();

        // 업 캐스팅과 다운 캐스팅 방식은 클래스 상속 방식과 동일.
        // ★업 캐스팅이 쓰이는 곳 -> 메소드 인자(자주), 리턴 타입(드물게)에 사용하면서 다형성 구현★
        
    }
}
