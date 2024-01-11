package object.자습;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Menu ta = new Menu();

        String[] menu = {"김치찌개", "된장찌개", "제육볶음", "공기밥\t", "계란찜\t", "쌈밥\t", "콜라\t"};
        int[] prices = {8000, 8500, 9000, 1000, 2000, 7500, 1500};

        ta.setName("-----------한식당");
        ta.setMenu(menu);
        ta.setPrices(prices);

        Scanner sc = new Scanner(System.in);

        System.out.println(ta.getName()+" 메뉴판 ------------");
        System.out.println(String.format("%s\t %s\t\t%s", "번호", "메뉴명", "가격"));
        
        for (int i = 0; i < ta.getMenu().length; i++) {
            System.out.println(String.format("%d\t %s\t%d", i, menu[i],prices[i]));
       }
       System.out.println("------주문할 메뉴를 선택하세요------- (-1 = 식당 나가기)");
       int pel = 0;
       int[] select = new int[8];
       int a = 0;
       while (pel!= -1 && a < select.length-1) {
        System.out.println("--------매뉴 번호 입력-----");
        pel = sc.nextInt();

        if (pel < -1 || pel > select.length-1) {
            System.out.println("----------재료 소진입니다.---------");
            continue;
        }
        
       }







    }
}
