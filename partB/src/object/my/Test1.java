package object.my;

public class Test1 extends Test{
    protected String msg;
    protected String input;
    
    public Test1(String testName, int width, int height){
        super(testName, width, height);

    }
    public Test1(String testName, String msg){
        super.testName = testName;
        this.msg = msg;

    }
    public String getInput() {
        return input;
    }

    @Override
    public int calculateArea() {
        return super.calculateArea()/2;
    }    


}
