package basic.day2;

public class A08PreViewTest {
    public static void main(String[] args) {

        char start = 'A';
        
        //반복명령 white 맛보기 : while은 조건이 참인 ~ 하는 동안에
        while(start<='Z'){       // <=  작거나 같다.(비교)
            System.out.print(start++);

            while (start>'A') { 
                System.out.print(--start);
                
            }







        }


    }
}
