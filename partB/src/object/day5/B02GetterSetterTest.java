package object.day5;

public class B02GetterSetterTest {
    public static void main(String[] args) {
        MyClass2 momo = new MyClass2();

        System.out.println("MyClass2의 field1 값 (초기) : " + momo.getField2());
        momo.setFiled2(999);
        System.out.println("MyClass2의 field1 값 (변경 후) : " + momo.getField2());

        System.out.println("지금까지의 momo 객체 값들은 ....");
        momo.printData();

        int test = 1212;
        momo.setFiled2(test);
        System.out.println("MyClass2의 field1 값 (변경 후) : " + momo.getField2());

        momo.printData();

        System.out.println("~~~~~field3는 double배열 타입입니다.");
        double[] dArray = momo.getField3();
        System.out.println("field3 : " + dArray);
        System.out.println("field3 : " + momo.getField3());

        double[] tempArray = {1.2, 3.44, 67.12};
        momo.setFiled3(new double[5]);
        System.out.println("변경된 field3 확인합니다. ");
        momo.printData();
        System.out.println("변경된 field3 확인합니다.");
        momo.setFiled3(tempArray);
        momo.printData();
        
        // setField3를 변수로 전달했을 때 
        tempArray[3] = 3.1415;      // 변경된 값이 momo 객체에도 반영되는지 확인해보세요.
        System.out.println("변경된 field3 확인합니다.");
        momo.printData();
    }    
}
