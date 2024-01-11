package object.day6;

import java.util.Scanner;

public class AddQuizMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] isRight = new boolean[3];
        System.out.println("-----덧셈 3문제 퀴즈를 시작하겠습니다.------");
        int count = 0;
        for (int i = 0; i < 3; i++) { 
            int start =11; int end =99;
            AddQuiz value = new AddQuiz();
            value.setData1((int) (Math.random() * (end-start+1)) + start);
            value.setData2((int) (Math.random() * (end-start+1)) + start);
            System.out.println((i + 1) + "번 " + value.getData1() + " + " + value.getData2() + " = ");
            System.out.print("답 입력하세요. >>> ");
            int userAnswer = sc.nextInt();
            value.setUserAnswer(userAnswer);
        }
        System.out.println("::::::: 채점 하고 있습니다. :::::::");
        System.out.println(String.format(" \t%s\t   %s\t%s\t %S", "문제", "제출한 답", "정답", "채점"));
            
            
        for (int i = 0; i < 3; i++) {
                AddQuiz value = new AddQuiz();
                value.setUserAnswer(value.getData1() + value.getData2());
                System.out.println(String.format("%s\t%s\t\t%s\t%s\t   %s", (i + 1)+"번", value.getData1() + " + " + value.getData2(),"?",value.getUserAnswer(), ""));
                isRight[i] = value.isRight();

            if (isRight[i]){
                System.out.println("O");
                    count++;
                } else {
                    System.out.println("X");}
                }
                
                System.out.println("~~~~~~~~정답 개수는 " + count +"개 입니다.~~~~~~~~~~");
                sc.close();
    
}
}    
