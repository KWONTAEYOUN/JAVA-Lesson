package io.day12;

import java.io.FileOutputStream;
import java.io.IOException;

// 표준 입출력 테스트
// 키보드 입력 : new Scanner(System.in) 또는 System.consol().readLine()
public class D04KeyInputFileOut {
    public static void main(String[] args) {
 
        int b;
        System.out.println("입력하세요. ↓ ");
        FileOutputStream fos = null;
        // 표준 입출력은 모든 글자가 2바이트
        try {
            fos = new FileOutputStream("note.txt");
            // 인자로 파일명을 전달합니다.
            int count = 0;
            while((b = System.in.read()) != -1){    // -1(입력끝)dms ctrl + z
            // System.out.println(b);   // 문자 인코딩 안 하고 정수값 출력
            // System.in.read()로 입력받은 정수 값을 문자로 인코딩하는 메소드
            // System.out.write(b);       // 표준 출력        
            fos.write(b);       // 파일 출력 스트림으로 데이터 보내기
            count++;
            }
            System.out.println("총 입력 바이트 수 : " + count);
        } catch (IOException e) {
            System.out.println("예외 : " + e.getMessage());

        }finally{
            // 입출력 자원해제는 여기서 하세요. 예외 발생 상관없이 처리 할 명령어
            try {fos.close();
            } catch (IOException e) {}
        }

    }

}
// File Input -> 화면(표준) 풀력
// File Input -> File Output    (이미지 1-파일복사)
// 바이트 기반 스트림은 문자 형식의 파일이 아닐 때
// 문자 기반 스트림 : 문자 단위 입출력