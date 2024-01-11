package object.my;

public class Test {
    public Test(){
        System.out.println("지금부터 5문제를 시작하겠습니다.");
    }
    protected String testName;  // 문제 이름
    protected int width;		// 도형의 크기 중 너비
    protected int height;		// 도형의 크기 중 높이
    protected int inp;           // 입력값

    public Test(String testName, int width, int height){
        this.testName = testName;
        this.height = height;
        this.width = width;
    }
    public String gettestName() {
        return testName;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getInp() {
        return inp;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int calculateArea(){
        return this.width*this.height;
   }
}
