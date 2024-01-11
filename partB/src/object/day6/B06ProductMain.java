package object.day6;

public class B06ProductMain {
    public static void main(String[] args) {
        // product 객체를 4개 만들어보자!
        Product snack = new Product("새우깡",  12000, "농심", new String[3]); 
        Product drink = new Product("코카콜라",  2000, "코카콜라", new String[3]); 
        Product fruit = new Product("복숭아",  10000, "납작", new String[3]); 
        Product icecream = new Product("바밤바",  1000, "해태", new String[3]); 

        // 출력
        System.out.println(snack.getData());
        System.out.println(drink.getData());
        System.out.println(fruit.getData());
        System.out.println(icecream.getData());


        // 퀴즈 : snack의 etc 필드 배열요서 0번에 "10개 묶음" 문자열을 저장하세요.
        String[] temp = snack.getEtc();
        temp[0] = "10개 묶음";
        temp[1] = "1+1";
        System.out.println(snack.getData());
        // snack.setPrice(1000);     // set 메소드 없음 -> 오류
        // snack.price = 1000;      // private -> 오류
        int[] numbers = new int[3];     // 정수 3개를 저장합니다.
        Product[] mycarts = new Product[5];        
         //Product 객체 배열 - Product 객체의 참조값 저장 배열
        mycarts[0] = drink;
        mycarts[1] = icecream;
        // mycarts[2] = drink;
        mycarts[3] = fruit;
        mycarts[4] = snack;

        // 배열이므로 반복문으로 출력할 수 있다. - getData() 메소드 사용
        for (int i = 0; i < mycarts.length; i++) {
            if(mycarts[i] !=null)
            System.out.println(mycarts[i].getData());   
            // mycarts[i]가 null일 때에는 메모리 할당이 안 된 상태. 메소드 사용 불가            
            
        }


        // object.day6.Product@372f7a8d         - 372f7a8d 객체 참조값(식별값) -> 주소
        // object.day6.Product@2f92e0f4         - object.day6.Product 는 패키지이름 / 클래스이름
        // object.day6.Product@28a418fc
        // object.day6.Product@5305068a



    }
}
