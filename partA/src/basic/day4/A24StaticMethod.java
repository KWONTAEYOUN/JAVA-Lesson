package basic.day4;

public class A24StaticMethod {
    // 프로그램을 실행시키는 main이 static이므로 여기서 같이 사용할 수 있는 다른 static 메소드 연습하기
    // 메소드를 만드는 목적은 특정 처리 기능을 main에서 따로 분리하기
    // 한 번 만들어진 메소드는 여러 번 필요할 떄 실행할 수 있습니다.(재사용)
    // 메소드는 클래스의 구성요소
    public static void main(String[] args) {
        argumentTest();
        argumentTest(999);
        argumentTest(100, 333);         // 100, 333은 실매개변수
        // 메소드가 실행될 떄 실매개변수 값이 형식매개변수로 전달, 저장됩니다.
        // argumentTest("100", 333);        형식에 맞는 메소드 없음.
        int a=100, b=999;
        argumentTest(a, b);

        int result = resultIntTest();
        System.out.println("resultIntTest() result " + result);        //리턴값 있는 메소드이므로 결과를 변수에 저장할 수 있다.
        System.out.println("resultIntTest() 리턴값 : " + resultIntTest());
        // result = resultBooleanTest();    메소드 리턴형식과 변수형식이 불일치하므로 오류
        System.out.println("add(34, 56, 23) = " + add(34, 56, 23));
        System.out.println("add(34, 78, 23) = " + add(34, 78, 23));
        System.out.println("add(22, 56, 98) = " + add(22, 56, 98));
        System.out.println("add(22, 56, 23) = " + add(22, 56, 23));

        boolean yes = resultBooleanTest();
        System.out.println(("resultIntTest() yes " + yes));
        System.out.println("resultIntTest() 리턴값 : " + resultBooleanTest());

        String lass = resultStringTest();
        System.out.println("resultStringTest() lass " + lass);
        System.out.println("resultStringTest() 리턴값 : " + resultStringTest());
        
        char A = resultCharTest();
        System.out.println("resultCharTest() A " + A);
        System.out.println("resultCharTest() 리턴값 : " + resultCharTest());

        
    }
        
//  1) ~ 4)는 리턴이 없습니다. 인자로 선언된 () 안의 변수는 메소드의 지역변수 입니다.
// 1) 인자값 없는 메소드
public static void argumentTest(){
    System.out.println("인자값 없는 메소드입니다.");
}
// 2) 인자가 1개 있는 메소드
public static void argumentTest(int i){     // 인자로 사용된 변수 i는 argumentTest 메소드에서만 사용합니다.
    System.out.println("인자가 1개 정수" + i + "입니다.");
}

// 3) 인자가 2개 있는 메소드
public static void argumentTest(int i, int j){      // i, j는 형식매개변수
    System.out.println("인자가 2개 정수 i = " + i + " j=" +j);
    System.out.println("i+j" +(i+j));
}

// 4) 리턴값이 int 정수인 메소드
public static int resultIntTest(){
    return 999;
}
// 5) 리턴값이 boolean 정수인 메소드
public static boolean resultBooleanTest(){
    return false;
}

// 6) 리턴값이 String 정수인 메소드
public static String resultStringTest(){
    return "Hello";
}
// // 7) 리턴값이 char 정수인 메소드
public static char resultCharTest(){
    return 'A';
}  

// 인자와 리턴값을 갖는 메소드
public static int add(int a, int b, int c){
    return a+b+c;
}
public static double add(double a, double b, double c){
    return a+b+c;
}





}
