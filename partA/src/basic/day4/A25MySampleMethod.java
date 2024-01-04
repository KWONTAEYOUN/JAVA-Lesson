package basic.day4;

//25 소스파일은 구글드라이브에 올려주세요.
public class A25MySampleMethod {
    // A22번 1) ~ 5) 을 각각 메소드로 정의하기 - 메소드안에서 출력문 만들지 않습니다.
    // 1) sum1Ton   2) multiply1ToN   3) sumMToN    4) multiplyNTiN    5) multiplyNof2
    // 6) 구구단 '출력'하는 메소드. 리턴은 void. printGuguDan
    public static void main(String[] args) {
    
        System.out.println(sum1Ton(10));
        System.out.println(multiplyMToN(8));
        System.out.println(sumMToN(10, 9));
        System.out.println(multiplyNTiN(9, 8));
        System.out.println(multiplyNof2(9));

        printGuguDan();


    
    } // 1) 1부터 정수 n까지 더하기
    public static long sum1Ton(long n){
        long sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        } return sum;
    }

     // 2) 1부터 정수 n까지 곱하기
    public static long multiplyMToN(long n){
        
        long longResult=1;
        for(int i=1; i<=n;i++){
           longResult *= i;
           
        } return longResult;
    }// 3) 시작값 정수 m부터 마지막값 n까지 더하기
    public static long sumMToN(long n, long m){
        long sum = 0;
        for(long i=m; i<=n;i++){
            sum += i;

        } return sum;
        
    }// 4) 시작값 정수 m부터 마지막값 n까지 곱하기
    public static long multiplyNTiN(int n, int m){
        long longResult = 1;
        for(int i=m; i<=n;i++){
            longResult*=i;
        
    }   return longResult;

    }// 5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
    public static long multiplyNof2(long n){
        long longResult = 1;
        for(int i=1;i<=n;i++){
            longResult*=2;

        } return longResult;
    }
    public static void printGuguDan(){

        for(int i=2;i<=9;i++){
            System.out.println("지금 구구단 " + i + "단을 출력합니다.");
            for(int j=1;j<=9;j++){
                System.out.println(String.format("%3d  X %3d = %3d", i,j,i*j));
                
    }   
        }

    }





}



    





