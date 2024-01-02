package basic.day3;

public class A15MinValue { // 가장 작은 값 - 최소값 찾기
    public static void main(String[] args) {
        
        int n1 = 12, n2 = 15, n3 = 9;
        int min;
        //1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if (n1<n2) {min=n1;
            
        }else{min=n2;
        
        }
        if (min>n3) {min=n3;
        //2) 조건식이 참일 때만 실행하는 명령어가 있습니다.
        }
        System.out.println("n1=" + n1 + ",n2=" + n2 + ",n3" + n3);
        System.out.println("최소값 = " + min);

        n1=99; n2=88; n3=77;
        System.out.println("::조건 상향연산으로 다시 구현해보기::");
        //조건 삼향연산을 대입문에 활용해 봅니다.
    
        min=(n1<n2? n1:n2);
        min=(min>n3? n3:min);


        System.out.println("n1=" + n1 + ",n2=" + n2 + ",n3" + n3);
        System.out.println("최소값 = " + min);










    }
    

}