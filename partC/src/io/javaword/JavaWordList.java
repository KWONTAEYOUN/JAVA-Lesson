package io.javaword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import collection.day11.JavaWord;

/**
 * JavaWordApp_V3 : 아래의 JavaWordList 를 이용해서 똑같이 메뉴가 동작하도록 
 *                  변경할 수 있습니다.
 * 이 단어장 프로그램이 다른 환경 (예를 들면, 웹 브라우저)에서 동작할 떄
 * 단어는 1개, 단어장은 단어 여러 개를 갖고 이를 대상하는 메소드를 명시하고
 * 그리고 단어장도 객체로 생성될 수 있게 한다.
 * 최후 정리 : 자바 단어장 클래스에 적용될 인터페이스 생성.
 */
public class JavaWordList implements WordList{
    //private : 현재 클래스에서만 사용할 목적으로 접근 제한합니다.
    private List<JavaWord> words;
    private String filePath = "단어장.txt";
    
    public JavaWordList(String filePath) {
        System.out.println("최대 단어 저장 개수 : " + WordList.MAX_LENGTH);
        words = new ArrayList<>();
        this.filePath = filePath;
    }



    // 새로운 단어등록, 기존단어 삭제 등의 변경사항을 파일에 저장하기
    public void fileSave(){
        File file = new File(filePath);
        try {PrintWriter pw = new PrintWriter(file);
            for (JavaWord word : words) {
                pw.println(word);
            }
                
        } catch (IOException e) {
            System.out.println("파일 출력 예외 발생 : " + e.getMessage());
        }
    }




    //words 리스트 요소를 몇개만 저장해서 초기화(테스트용)
    public void fileLoad() {
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine())!=null){
                if(line.trim().length()==0) continue;   // 빈 줄은 skip
                String[] temp = line.split(",");
                if(temp.length !=3) continue;       // 배열크기는 반드시 3 
                words.add(new JavaWord(temp[0].trim(),
                                       temp[1].trim(),
                    Integer.parseInt(temp[2].trim())));
            }
        }catch (IOException e) {
            System.out.println("파일 입력 오류 : " + e.getMessage());
        }

    }

    // 지정된 인덱스 i 의 JavaWord 객체 리턴
    @Override
    public JavaWord getWord(int i) {
       return words.get(i);
    }


    //단어장 전체 리스트 리턴
    @Override
    public List<JavaWord> list() {     //getWords 에서 이름 변경
        return words;
    }

    //단어 추가
    @Override
    public void add(JavaWord word) {
        if (words.size() == 5) {
            throw new IllegalArgumentException("단어장이 꽉 찼습니다. 단어장을 새로 만들어 주세요");
            
        }
        words.add(word);
    }

    //전달받은 영어 단어의 인덱스를 배열로 리턴합니다.-조회 및 삭제 기능에 사용할 새로운 메소드
    // words 리스트의 인덱스 위치 position부터 단어 english를 찾기/
    @Override
    public int indexOfWord(String english,int position){
        for(int i=position;i<words.size();i++){
            if(words.get(i).getEnglish().equals(english))
                return i;       //찾으면 인덱스 리턴
        }   
        return -1;
    }

    //단어를 인덱스로 삭제
    @Override
    public JavaWord remove(int index) {
        if(index < 0 || index > words.size())
            // throw new Exception
            throw new IllegalArgumentException("삭제할 인덱스 범위가 잘못된 값 입니다. ");
            // 새로운 Exception 객체를 생성하면 개발자가 만든 예외가 발생합니다.
            // 발생시킬 익셉션 종류는 IllegalArgumentException와 같은 이름으로 많이 사용합니다.
            // 예를 들면 웹개발 할 때는 모든 예외를 한 번에 처리하기 위해 이런 방법을 사용합니다.

        JavaWord word = words.remove(index);    // index 삭제할 위치. 삭제한 데이터를 리턴
        return word;
    }

    //단어 1개 조회(여러개 일때는 처음 1개)
    public JavaWord searchFirstByEnglish(String english) {
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
                return word;        //인자로 전달된 english 와 같은 word 리턴(메소드 종료)
            }
        }
        return null;            
    }
    
    //단어 목록 조회
    @Override
    public List<JavaWord> searchAllByEnglish(String english){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getEnglish().equals(english)) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }
    
    public List<JavaWord> searchAllByLevel(int level){
        List<JavaWord> list = new ArrayList<>();    //검색 결과 저장할 리스트
        for(JavaWord word : words) {
            if(word.getLevel()==level ) {
               list.add(word);          //일치하는 하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }
    // 인스턴스 메소드 : 인스턴스 필드 words를 사용하여 동작.
    @Override
    public void print(){
        for(JavaWord word : words) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }
   
    // 출력 메소드 
    // static 메소드 : 인스턴스 필드를 사용하지 않고 메소드 인자를 받아 동작.
    public static void print(List<JavaWord> list){
        for(JavaWord word : list) {
            System.out.println(String.format("%-20s %-30s %-20s",
                                    word.getEnglish(),word.getKorean(),word.getLevel()));
        }
    }

   
   

}