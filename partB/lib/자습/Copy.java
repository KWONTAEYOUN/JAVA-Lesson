package object.자습;
import java.util.Arrays;
public class Copy {
    private String name;
    private int grade;
    private int[] num; 

// getter
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int[] getNum() {
        return num;
    }
// setter
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setNum(int[] num) {
        this.num = new int[num.length];
        for (int i = 0; i < num.length; i++) {
               this.num[i] = num[i];
        }
    }

    public int sum(){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }return sum;
    }
    public double average(){
        return sum()/num.length;
    }
    public void printData(){
        System.out.println(grade +" 학년 "+ name +"의 성적은 각각 " +Arrays.toString(num)+ "점 이며 점수의 총합은 "+ sum()+"점 이며 평균은 "+ average() +"점 입니다.");
    }
    
}
