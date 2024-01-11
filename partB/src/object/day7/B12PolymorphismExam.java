package object.day7;
import object.day7B.Square;
//  다형성이 어떻게 구현되는 것인지 확인하기
//     ㄴ 자료구조 필요합니다. 배열을 사용해 봅시다.
public class B12PolymorphismExam {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];

        shapes[0] = new Diamond();
        shapes[0].setShapeName("◆◆◆◆◆");

        shapes[1] = new Triangle("▲▲▲▲▲", 120, 40, 45);
        shapes[2] = new Square();
        shapes[2].setShapeName("□□□□□");
        shapes[3] = new Diamond();
        shapes[3].setShapeName("◇◇◇◇◇");
        shapes[4] = new Square();
        shapes[4].setShapeName("■■■■■");

        // 여기까지 부모타입 배열에 자식 객체들을 생성해서 참조 시켜놓았습니다.

        // 다형성 : 자료구조에 저장된 객체가 하나의 타입 Shape이지만 실행되는 draw 동작은 모두 다릅니다.
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i+1) + " 번 도형입니다.");
            shapes[i].draw();
            // 부모탑입으로 참조되는 객체들이 재정의된 draw() 메소드를 실행합니다.
            // ★다형성은★ 메소드는 한 가지를 통일해서 실행하나 결과는 여러 형태로 보이는 것 입니다.
            //                  ㄴ 자식클래스가 ★메소드 오버라이드★를 할 수 있기 때문에 가능합니다.
        } 
        System.out.println("~~~~~ 자식객체의 실제 타입을 검사하는 instanceof 연산 ~~~~~");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\tshapes[i] instanceof Triangle ? " + (shapes[i] instanceof Triangle));
            System.out.println("\tshapes[i] instanceof Diamond ? " + (shapes[i] instanceof Diamond));
            System.out.println("\tshapes[i] instanceof Square ? " + (shapes[i] instanceof Square));
            
        }

        System.out.println("~~~~~ 삼각형 Triangle 객체는 넓이를 구해서 출력하기 ~~~~~");  
        // 4번 인덱스 도형을 새로운 Triangle 객체로 참조해서 아래 코드 실행하기.
        shapes[4] = new Triangle("▲▲▲▲▲", 45, 12, 68);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Triangle) {
                shapes[i].draw();
                // 반드시 실제 객체 Triangle일 때만 강제캐스팅 합니다. 그렇지 않으면 오류
                Triangle tempTriangle = (Triangle) shapes[i];
                System.out.println("i = " + i + " 는 삼각형입니다. 넓이 : " + shapes[i].calculateArea());
                tempTriangle.printAngle();

            }
        }
        
        // for문 반복할 떄 알아서 순서대로 1개씩 배열 요소를 가져오기. / 인덱스 i값을 사용하지 않습니다.
        System.out.println("~~~~~ shapes 배열에 저장된 객체 중 다이아몬드를 draw 하기 ~~~~~");  
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Diamond) {
                shapes[i].draw();                
            }
        }
        for(Shape temp : shapes){
            if(temp instanceof Diamond)  //  i 값을 필요로 하지 않는다면 옆에 공식으로 정의 가능
                temp.draw();
        }

        // Upcasting
        Shape sh = new Diamond();
        

        // Down Casting - sh의 실제 객체가 다운 캐스팅하려는 타입인지 검사 필수. instanceof 연산으로 검사하기.
        //    (아래 예시)  sh의 실제 객체가 아닌 것(Triangle, Square)을 Diamond로 캐스팅하면 오류.
        Diamond diamond = (Diamond)sh;

        // 자식객체의 인스턴스 메소드 iAmDiamond는 반드시 다운캐스팅을 해야 실행 가능
        diamond.iAmDiamod();



    }
}