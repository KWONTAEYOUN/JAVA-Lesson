package collection.myapp;

import java.util.List;

public class JavaWordApp {
    public static void main(String[] args) {
        // 단어장을 시작하는 프로그램
        // 1) 단어장을 생성
        JavaWordBook myBook = new JavaWordBook();

        // 2) 단어 추가
        JavaWord neWord = new JavaWord("public", "공용어", 1);
        myBook.addWord(neWord);
        myBook.addWord(new JavaWord("private", "개인적인", 1));
        myBook.addWord(new JavaWord("protected", "보호하는", 1));
        myBook.addWord(new JavaWord("iterate", "반복하다", 3));
        myBook.addWord(new JavaWord("collection", "수집", 2));
        myBook.addWord(new JavaWord("application", "응용프로그램", 2));
        myBook.addWord(new JavaWord("binary", "2진수의", 3));
        // 메모장 출력
        myBook.wordAllPrint();
        // 3) 딘아 조회
        // -1 영어 단어 입력하면 찾아주기
        String findText = "";
        JavaWord result = myBook.searchWord(findText);
        System.out.println(findText + "조회결과 = " + result);
        
        // -2 List<JavaWord> searchWordByLevel1(int level) : 레벨로 조회하기
        List<JavaWord> list = myBook.searchWordByLevel1(1);
        myBook.wordListPrint(list);

        // 4) 단어 삭제


    }
}
