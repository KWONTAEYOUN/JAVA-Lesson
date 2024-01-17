package io.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 입력 스트림으로 이미지 파일 읽어옵니다.
//  --> 파일 출력 스트림으로 파일 내용을 출력(파일 복사)
public class D06FileCopyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\KakaoTalk_20240115_163020483.jpg");
            fos = new FileOutputStream("KakaoTalk_20240115_163020483.jpg");
            int count = 0;
            int b;
            while((b = fis.read()) != -1){      // 1바이트 씩 복사하기(파일fis에서 파일fos로)
                fos.write(b);
                count++;
            }
            System.out.println("count : " + count);
        } catch (IOException e) {
            System.out.println("파일 입출력 예외 : " + e.getMessage());
        }finally{
            try {fis.close(); fos.close();}
             catch (IOException e)  {
            }
        }
    }
}
