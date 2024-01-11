package object.day7;

// Shape 와 Triangle 을 객체 생성하고 메소드 테스트 해보기.
public class B09ShapeMain {
    public static void main(String[] args) {
        Shape my = new Shape("정삼각형", 9, 9);
        Triangle you = new Triangle("삼각형", 20, 10, 30);
        System.out.println("정사각형의 너비 = " + my.getWidth());
        System.out.println("정사각형의 높이 = " + my.getHeight());
        
        System.out.println("~~~~~~~~~~~~ 재정의 메소드 실행 확인 ~~~~~~~~~~~");
        System.out.println(my.getShapeName()+"의 넓이는 = " + my.calculateArea());
        System.out.println(you.getShapeName()+"의 넓이는 = " + you.calculateArea());
        
        System.out.println("~~~~~~~~~~~~ 부모 클래스가 정의한 메소드 실행 확인 ~~~~~~~~~~~");
        my.print();
        you.print();
        you.printAngle();
        // getWidth, getHeight는 부모클래스 Shape에서 정의했음. 자식이 실행가능.
        System.out.println("삼각형 너비 : " + you.getWidth());
        System.out.println("삼각형 높이 : " + you.getHeight());
        
        System.out.println("~~~~~~~~~~~~ 자식 클래스에서 정의한 메소드 실행 확인 ~~~~~~~~~~~");
        System.out.println("삼각형 각도 : " + you.getAngle());
        
        // my.getAngle();      // 부모가 자식객체의 메소드 실행 못 함.   
        
        // 상속에서의 변수 참조 타입 - 자식클래스 타입, 부모클래스 타입.
        // 1) 자식 객체를 부모 타입으로 참조하기 ★★★★★
        Shape temShape = new Triangle("삼각형2", 30, 40, 100);
        System.out.println("~~~~~~~~~~~~ 재정의 메소드 실행 확인 ~~~~~~~~~~~");
        System.out.println("부모타입 참조이나 객체의 실체는 Triangle 이므로 너비는 재정의 메소드 실행");
        System.out.println(my.getShapeName()+"의 넓이는 = " + temShape.calculateArea());

        System.out.println("Triangle 자식 객체를 부모타입 Shpae으로 참조할 때에는 아래 메소드는 오류");
        System.out.println("★getAngle은 부모 타입에는 없는 메소드 입니다.★");
        System.out.println("~~~~~~~~~~~~ 자식 클래스에서 정의한 메소드 실행 확인 ~~~~~~~~~~~");
        // System.out.println("삼각형 각도 : " + temShape.getAngle());  // 오류
        
        // 2) 부모 객체를 자식 타입으로 참조하기는 불가능
        // Triangle tempTriangle = new Shape("정사각형", 30, 30);  // 오류
        // 부모 객체를 자식 타입으로 참조하기 위해 강제 캐스팅.
        Triangle tempTriangle = (Triangle) new Shape("정사각형", 30, 30);
        System.out.println("~~~~~~~~~~~~ 재정의 메소드 실행 확인 ~~~~~~~~~~~");
        System.out.println(you.getShapeName()+"의 넓이는 = " + tempTriangle.calculateArea());
        // 강제 캐스팅은 했으나 Triangle에 필요한 인스턴스 필드가 안 만들어져 오류
        
        
        
        
        


    }
}
