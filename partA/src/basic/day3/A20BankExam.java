package basic.day3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A20BankExam {
    public static void main(String[] args) {
        
        int menu = 0;
        int money =0;
        int balance=0;
        boolean run=true;
        Scanner sc = new Scanner(System.in);
        // 세자리마다 컴마 찍기 : 아직 배운 진도가 아니지만 일단 사용하기
        DecimalFormat df = new DecimalFormat("#,### 원");
        while (run) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1: 예금 | 2: 출금 | 3: 잔액 | 4: 종료");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print(" 메뉴 선택 >>> ");
        menu = sc.nextInt();

        switch (menu) {
            case 1: System.out.println(" 예금액 > ");
            money = sc.nextInt();
            balance += money;
            System.out.println("고객님의 잔액은 "+ df.format(balance) + " 입니다.");
                
                break;
            case 2:System.err.println(" 출금액 > ");
            money = sc.nextInt();
            balance -= money;
            if(money<=balance);
            else
                System.out.println("고객님의 잔액이 출금액보다 부족합니다.");
            System.out.println("고객님의 잔액은 " + df.format(balance) + " 입니다.");
            break;
            case 3:
            money = balance;
             System.out.println("현재 잔고 : " + df.format(balance));
                
                break;
            case 4:System.out.println("\n 프로그램을 종료합니다.");
                run = false;
                break;
            
            default:System.out.println("잘못된 선택입니다.");
                break;
        
        }

        }
    }
}
