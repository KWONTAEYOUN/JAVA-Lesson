package object.day6;

import java.util.Arrays;
import java.util.Scanner;

public class B04CartMain {
    public static void main(String[] args) {
        Cart momos_cart = new Cart();

        // 모모의 장바구니 - 상품이름, 가격
        String[] productNames = {"매운새우깡", "칠성사이다", "제주감귤","갈아만든배","삼립호빵","이클립스"};
        int[] prices = {3000, 2500, 9900, 12000, 9800, 6000, 1500};

        // 장바구니 값을 저장합니다.
        momos_cart.setUseid("momo");
        momos_cart.setProductNames(productNames);
        momos_cart.setPrices(prices);


        Scanner sc = new Scanner(System.in);

        System.out.println(momos_cart.getUserid() + "님의 장바구니 입니다.");
        System.out.println(String.format("%s\t %s\t\t %s", "번호", "상품명", "가격"));

        for (int i = 0; i < momos_cart.getProductNames().length; i++) {
            System.out.println(String.format("%d\t %s\t %d",i, productNames[i], prices[i]));
        }

        System.out.println("구매할 상품 번호를 선택학세요. 선택 종료는 -1 입니다.");
        int sel=0;
        int[] select = new int[6];      // 상품 선택 개수는 최대 6개
        int k=0;        //select 배열 인덱스
        while (sel!= -1 && k < select.length) {
            System.out.println("상품번호 입력>>> ");
            sel = sc.nextInt();
            // sel의 선택범위는 productNames 인덱스 범위값만
            if(sel < -1 || sel > select.length-1) {
                System.out.println("------ 상품 준비중입니다. ------");
                continue;       // 아래 있는 명령어 실행하지 않고 다시 반복문 시작으로 돌아가기
            }
            select[k++] = sel;      // 대입 후에 ++     
        }
        if(k == select.length)
            System.out.println("장바구니 가득채우셨군요 ~^^ 땡큐~");
        System.out.println("선택하신 상품은 " + Arrays.toString(select));
        
        // System.out.println(momos_cart.getUserid() + "님이 선택하신 상품 합계 : " + momos_cart.total_Money(select));
        // momos_cart.setTotal_Money(2000000);     // setter 메소드가 여기서는 필요없습니다.
        // total_Money 메소드가 대신 값을 계산해서 저장할 것입니다.
        
        momos_cart.total_Money(select);
        System.out.println(momos_cart.getUserid() + "님이 선택하신 상품 합계 : " + momos_cart.getTotal_Money());

        // 필요에 따라서는 기존의 setter 메소드는 사용하지 않고 
                        //             추가적인 비지니스로직을 구현하는 메소드를 만듭니다.  --> total_Money() 메소드

        

    }
}
