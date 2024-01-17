package io.day13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class D09StringSplit {
    // 전역변수 : 모든 메소드에서 사용할 수 있습니다.
    private static String filePath = "score.txt";
    public static void main(String[] args) {
        List<Score> list = makeList();
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i + ", score object = " + list.get(i));
        }
        for (Score temp : list) {
            System.out.println(temp);       // list.get(i)를 반복자로 실행해서 temp에 저장
        }
    }
    
    public static Score makeScore(String line){
        String[] temp = line.split(",");
                Score stu = new Score(temp[0].trim(),
                    Integer.parseInt(temp[1].trim()),
                    Integer.parseInt(temp[2].trim()),
                    Integer.parseInt(temp[3].trim()));
                    // 공백이 앞 뒤에 있으면 parseInt 오류, 공백제거 trim 메소드 실행
        return stu;
    }
    // 1) score.txt에서 모든 데이터를 읽어오고 2) Score 객체로 변환하여 3) 리스트에 담고 4) 리턴
    public static List<Score> makeList() { 
        List<Score> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            // BufferReader 로 1줄씩 읽기
            String line;
            while ((line =br.readLine())!=null) {
                list.add(makeScore(line));
            }
            }catch(IOException e){
                System.out.println("파일 입력 오류 : " + e.getMessage());
            }
            
            return list;
}

        // BufferReader 클래스는 파일에서 1줄 씩 읽어올 수 있습니다.
        //              1줄 읽고 -> Score 객체 만들기 -> 4개 객체(변수명 모두 stu로 참조하고 출력하기)
        public static void split_test2(){
        
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            // BufferReader 로 1줄씩 읽기
            String line;
            while ((line =br.readLine())!=null) {
                // String[] temp = line.split(",");
                // Score stu = new Score(temp[0],
                //     Integer.parseInt(temp[1]),
                //     Integer.parseInt(temp[2]),
                //     Integer.parseInt(temp[3]));
                Score stu = makeScore(line);
        
                System.out.println(String.format("count = %d, score object = %s", count,stu));
                count++;
            }

        }catch(IOException e) { 
            System.out.println("파일 입력 오류 : " + e.getMessage());
        }
        System.out.println("score 객체 : " + count + " 개 생성완료!");
    }



        public static void split_test1(){
        String stu = "김모모,66,77,88";

        // split 메소드는 지정된 구분자(구분기호)를 이용해서 문자열을 분리하고
        //       배열에 저장해서 리턴한다.

        String[] temp = stu.split(",");
        System.out.println("1. split 실행한 결과 문자열 배열은? ");
        // System.out.println(Arrays.toString(temp));
        for (String t : temp) {
            System.out.println("배열 요소 = " + t);

            System.out.println("2. 분리된 결과로 Score 객체를 만들면 ?");
        // temp[0]  은 이름, temp[1] ~ temp[3] 까지는 점수 문자열 -> 정수로 변환
        
        // Score str = new Score(temp[0],
        // Integer.parseInt(temp[1]),
        // Integer.parseInt(temp[2]),
        // Integer.parseInt(temp[3]));
        
        // System.out.println();
        }
    }
        
        
        
        
        
}
        
        


