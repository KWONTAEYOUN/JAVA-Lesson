package collection.day11;

import java.util.ArrayList;
import java.util.List;

import collection.day11.JavaWordApp_V2;

public class JavaWordApp_V2 {
    // private : 현재 클래스에서만 사용할 목적으로 접을 제한!
    private List<JavaWord> words = new ArrayList<>();

    // 프로그램 실행을 시작하는 메소드
    private void start() {
        initialize();
        // 단어 등록, 목록, 검색, 삭제 기능을 메뉴로 구현!!
        System.out.println("단어장 프로그램을 시작합니다 ~~~" + "~".repeat(30));
        while (true) {
            System.out.println("\t <메뉴를 선택하세요.>");
            System.out.println("\t 1. 단어 등록");
            System.out.println("\t 2. 단어 목록 출력");
            System.out.println("\t 3. 단어 검색");
            System.out.println("\t 4. 단어 삭제");
            System.out.println("\t 5. 단어 프로그램 종료");
            System.out.println("선택 > > > "); // 메소드에 입력기능이 있을 때는 Scanner 관리가 불편
            int select = Integer.parseInt(System.console().readLine()); // 키보드 입력 문자열 -> 정수
            // System.console() : 시스템의 콘솔(표준입출력장치) 객체를 리턴, readLine 입력메소드 실행

            switch (select) {
                case 1:
                    addWord(); // 단어 등록 메소드 실행!
                    break;
                case 2:
                    listWord();
                    break;
                case 3:
                    searchWordBy();
                    break;
                case 4:
                    removeWord();
                    break;
                case 5:
                    listWord();
                    System.out.println("프로그램을 종료합니다. ~~~");
                    System.exit(0);
                     // main 실행을 종료
                    break;

                default:
                    System.out.println("잘못된 선택값 입니다.");
                    break;
            } // swith end
        } // while end
    } // start end

    private void initialize() {
        // words 리스트 요소를 몇 개만 저장해서 초기화
        words.add(new JavaWord("public", "공용의", 1));
        words.add(new JavaWord("public", "공동의", 1));
        words.add(new JavaWord("public", "공용의", 1));
        words.add(new JavaWord("private", "사적인", 1));
        words.add(new JavaWord("iterator", "반복자", 3));
        words.add(new JavaWord("application", "응용프로그램", 2));
    }
    // 단어 삭제 : 단어장에 동일한 단어가 2번 이상 잇는 경우입니다.
    //            삭제하기 전에 if문으로 사용자 확인을 받읍시다.
    private void removeWord() {
        System.out.println("\t :: 단어를 삭제합니다. ::");          
        System.out.println("삭제할 단어를 영어로 입력해주세요! > > >");
        String find = System.console().readLine();
        boolean isFind = false;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).getEnglish().equals(find)){
                isFind = true;
                System.out.println(" 단어를 찾았습니다." + words.get(i));
                System.out.println("삭제하려면 엔터, 취소는 n을 입력하세요.");
                if(System.console().readLine().equals("n"))
                        continue;
                else{ 
                    words.remove(i); System.out.println("단어 삭제 완료 !!!");
                    // 단어 삭제 후 다음 인덱스는 
                    i -- ;
             }
            }  // if end
        } // for end
        if(!isFind)
        System.out.println("삭제할 단어는 단어장에 없습니다.");              
    }
    // 새로운 검색 메소드 정의
    // 1) 단어 검색 : 첫 번째로 일치하는 결과만 리턴
    //    메소드 인자를 입력 데이터로 하여 메소드의 코드가 실행되고 결과는 출력으로 리턴
    private JavaWord searchFirstWord(String english){
        for (JavaWord word : words) {
            if(word.getEnglish().equals(english)){
                return word;        // 인자로 전달된 english 와 같은 word 리턴
            }
        }
        return null;      
        // 찾는 english 단어가 없으면 for문이 리스트 모두 반복하고 종료. null 리턴
    }
    // 2) 단어 검색 : 검색하는 단어와 일치하는 결과를 모두 리턴(단어가 2번 이상 중복 저장될 때)
    private List<JavaWord> searchAllWord(String english){
        List<JavaWord> list = new ArrayList<>();    // 검색 결과 저장할 리스트
        for (JavaWord word : words) {
            if (word.getEnglish().equals(english)) {
                list.add(word);         // 일치하는 단어를 만날 때마다 저장
            }
        }
        return list;
    }
    // searchWord
    private void searchWordBy(){
        System.out.println("\t:: 단어 검색합니다.(단어 조회는 1, 레벨 조회는 2) :: ");
        String find = null;
        List<JavaWord> list = null;     // 조회되는 결과를 리턴받아 참조 할 변수입니다.
        switch (System.console().readLine()) {        // 키보드 입력을 변수에 저장하지 않고 직접 switch에 작성
            case "1":
                System.out.println("검색한 단어를 영문으로 입력하세요 _");
                find = System.console().readLine();
                list = searchAllWord(find);
                break;
            case "2":
                System.out.println("검색할 레벨을 입력하세요._");
                int level = Integer.parseInt(System.console().readLine());
                    list = searchAllWordsBy(level);
                break;
            default:
            System.out.println("1, 2만 입력하세요.");
                break;
        }
        System.out.println("\t:: 검색 결과 입니다. ::");
        if(list.size()==0) System.out.println("찾는 단어가 단어장에 없습니다.");
        else printWordList(list);
    }
    
    private List<JavaWord> searchAllWordsBy(int level){
        List<JavaWord> list = new ArrayList<>();    // 검색 결과 저장할 리스트
        for (JavaWord word : words) {
            if(word.getLevel()==level){
                list.add(word);     // 일치하는 단어를 만날 때 마다 저장
            }
        }
        return list;
    }
    

    private void searchWord() {
        System.out.println("\t :: 단어를 검색합니다. ::");
        System.out.println("검색할 단어를 영어로 입력해주세요! > > >");
        String find = System.console().readLine();
        
        // 1) 단어 1개만 리턴하는 경우
        // JavaWord word = searchFirstWord(find);
        // if(word != null)
        //     System.out.println("검색 결과 : \t" + word.getEnglish() + "\t=  " + word.getKorean() + "\t레벨 " + word.getLevel());
        // else    
        //     System.out.println("찾는 단어가 단어장에 없습니다."); // 1), 2)
     
        // 2) 단어 여러 개 리턴할 때
        List<JavaWord> results = searchAllWord(find);
        if(results.size() == 0)
            System.out.println("찾는 단어가 단어장에 없습니다. ");
        else
            printWordList(results);     // 출력할 리스트 result를 메소드에 전달
            // System.out.println("results : " + results);
        
    }
    private void printWordList(List<JavaWord> list){
        for (JavaWord word : list) {
            System.out.println(String.format("%20s %20s %20s", word.getEnglish(), word.getKorean(), word.getLevel()));
        }
    }


    private void listWord() {
        System.out.println("\t :: 단어 목록을 출력합니다. ::");
        // TO DO : 리스트 words에 저장된 요소(항목)들을 모두 출력해보기!
        System.out.println(String.format("%20s %20s %20s", "ENGLISH", "KOREAN", "LEVEL"));
       printWordList(words);        // 출력할 리스트 words를 메소드에 전달
    }

    private void addWord() {
        System.out.println("\t :: 단어 등록합니다. ::");
        System.out.println("영어 단어 입력하세요. __ ");
        String english = System.console().readLine();
        System.out.println("한글 의미 입력하세요. __ ");
        String korean = System.console().readLine();
        System.out.println("단어 레벨 입력하세요. (1: 초급 2: 중급 3: 고급) __ ");
        int level = Integer.parseInt(System.console().readLine());

        words.add(new JavaWord(english, korean, level));
    }

    public static void main(String[] args) {
        // 프로그램 실행하는 객체 생성하고
        // (메소드로 기능을 분리할 때 main이 호출할 static을 없애기 위함.)
        // start 메소드 프로그램 실행 내용을 코딩

        JavaWordApp_V2 app = new JavaWordApp_V2();
        app.start();

    }
}
