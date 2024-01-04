package object.day5;

public class B03Scoremain {
    public static void main(String[] args) {
        Score momo = new Score();
        momo.setGrade(1);
        momo.setName("모모");
        int[] Array = {60,70,80};
        momo.setJumsues(Array);
        momo.printData();        
        momo.setJumsues(new int[3]);
        
        Score da = new Score();
        da.setGrade(1);
        da.setName("다현");
        int[] Array1 = {80,90,100};
        da.setJumsues(Array1);
        da.printData();
        da.setJumsues(new int[3]);
        
        
        Score na = new Score();
        na.setGrade(2);
        na.setName("나연");
        int[] Array2 = {70,90,100,100};
        na.setJumsues(Array2);
        na.printData();
        na.setJumsues(new int[4]);
        
        
        Score je = new Score();
        je.setGrade(2);
        je.setName("쯔위");
        int[] Array3 = {60,90,100,50};
        je.setJumsues(Array3);
        je.printData();
        je.setJumsues(new int[4]);










        // 학생 4명의 성적을 저장해보세요.
        // 1학년 2명 (모모, 다현) 3과목 2학년 2명(나연, 쯔위) 4과목
        //  점수는 마음대로

    
    }
}
