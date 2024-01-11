package object.my;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        //  1번 문제
        Scanner sc = new Scanner(System.in);
        Test test = new Test( " 인 사각형의 넓이를 구하시오!", 8, 8);
        System.out.println("높이 :" + test.height + " 너비 :" + test.width + test.testName);
        System.out.println("\n정답을 적어주세요 >>>");
        int inp = sc.nextInt();
        if (inp == test.calculateArea()) {
            System.out.println("정답입니다.!!!");
        }
        else{
            System.out.println("오답입니다");
        }

        // 2번
        Scanner sc2 = new Scanner(System.in);
        Test1 test1 = new Test1("인 삼각형의 넓이를 구하시오", 10, 20);
        System.out.println("높이:" +test1.height+ "너비:"+test1.width+ test1.testName);
        System.out.println("\n정답을 적어주세요 >>>");
        int inp1 = sc2.nextInt();
        if (inp1 == test1.calculateArea()) {
            System.out.println("정답입니다!");            
        }
        else{
            System.out.println("오답입니다.");
        }

        // 3번
        Scanner sc3= new Scanner(System.in);
        Test1 test2 = new Test1("다음 특징에 맞는 접근 한정자를 입력하시오", "어디에서나 사용 가능한 접근 한정자는 무엇일까??.");
        System.out.println(test2.testName + "\n" + test2.msg);
        System.out.println("\n정답을 적어주세요 >>>");
        String input = sc3.nextLine();
        if (input == "public") {
            System.out.println("정답입니다.");
        }
        else{
            System.out.println("오답입니다.");
        }


        Test test3 = new Test1("다음 설명에 맞는 클래스의 이름을 적으시오!!!", "클래스의 상속에서 상위 클래스의 메소드나 필드값을 가져와 사용하는 클래스는 ?");
        


        
        
        
    }
}
