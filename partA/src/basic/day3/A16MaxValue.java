package basic.day3;

public class A16MaxValue { // 최소값 최대값 찾기.
    public static void main(String[] args) {
        
        int n1 = 52, n2 = 17, n3 = 29;
        int min;
        int max;
        //1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if (n1<n2) {min=n1;
                    max=n2;
        }else{min=n2;
              max=n1;
        }
        //2) 조건식이 참일 때만 실행하는 명령어가 있습니다.
        // 앞으로 참 또는 거짓일 때 실행하는 명령문이 1개라면 { } 생략하고 할 수 있습니다.
        if (max<n3) max=n3;
        if (min>n3) min=n3;
            
        

        System.out.println("n1=" + n1 + ",n2=" + n2 + ",n3" + n3);
        System.out.println("최대값 = " + max);
        System.out.println("최소값 = " + min);

        










    }
    

}