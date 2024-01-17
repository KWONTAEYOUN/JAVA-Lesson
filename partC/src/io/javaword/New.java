package io.javaword;

import java.io.IOException;
public class New {
    public static void main(String[] args) {
        
        int b;
        System.out.println("입력하세요. ↓ ");
        try {
            int count = 0;
            while((b = System.in.read())!=10){
                System.out.write(b);
                count++;
            }
            System.out.println("총 입력 바이트 수 : " + count);
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }




    }
}
