package object.day5;

import java.util.Arrays;

// 학생들의 성적을 객체로 만들어 줄 클래스 입니다.
public class Score {
    // 인스턴스 필드
    private String name;        // 학생 이름
    private int grade;          // 학년
    private int[] jumsues;      // 점수들이 저장될 배열
                                // 배열의 크기는 학년마다 다를 수 있음.
    // 인스턴스 메소드 : 인스턴스 필드를 사용하는 처리를 합니다.
    //getter
    public String getName(){
        return name;
    }   
    public int getGrade(){
        return grade;
    }
    public int[] getJumsues(){
        return jumsues;
    }

    //setter
    public void setName(String n1){
        name = n1;
    }
    public void setGrade(int g1){
        grade = g1;
    }
    public void setJumsues(int[] j1){
        jumsues = new int[j1.length];
        for (int i = 0; i < j1.length; i++) {
                jumsues[i] = j1[i];
        }
    } 

    // 점수의 합계를 리턴하는 sum() 메소드
    public int sum(){
        int sum=0;
        for(int i = 0;i<jumsues.length;i++){
                sum += jumsues[i]; 
        }return sum;
    }
    // 점수의 평균 double 리턴하는 average() 메소드
    public double average(){
     return sum()/jumsues.length;}  


    // 모든 인스턴스 필드값을 확인 출력 하는 printScore() 메소드
    public void printData(){
        System.out.println(grade+"학년 "+name+"의 성적의 합은"+sum()+" 점이고 평균은"+average()+"입니다."+ Arrays.toString(jumsues));
        System.out.println("과목 개수 : " + jumsues.length);
        System.out.println();
    }











    
}
