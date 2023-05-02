package com.sist.io;
import java.io.FileInputStream;
import java.io.FileReader;
/*
 *    FileInputStream : 단위 byte (1byte씩 읽어온다)
 *      => 한글 포함된 데이터는 읽을 수 있는데 한글이 깨진다.
 *         -------------- FileReader
 *         .zip, .ppt, .png ... => 업로드 / 다운로드
 *         -------------- 웨에서 자료실, 갤러리 게시판 만들기
 *      => 주요메소드
 *         read() => 1byte => 리턴형: int
 *         close() 닫기
 *      => 생성자
 *         new FileInputStream(File file)
 *         new FileInputStream(String path) => 파일 경로
 *               
 */
import java.util.*;
public class FileInputStream_1 {

	public static void main(String[] args) {
		try 
		{
			/*FileInputStream*/  /*FileInputStream*/  // 한글이 깨짐
			FileReader fis = new FileReader("C:\\javaDev\\javaStudy\\Chpater_입출력_1\\src\\com\\sist\\io\\InputOutputMain.java");
			int i = 0;//1 개의 문자를 읽어 온다 => 문자번호를 넘겨준다.
			// 문자번호를 받는 변수
			while ((i = fis.read()) != -1) { // 파일의 끝까지 한 바이트씩 읽어옴 // 문자 번호를 넘겨준다.
				                             // -1은 더이상 읽을 데이터가 없을때 까지 => EOF(End Of File) -1
				System.out.print((char) i); // 읽어온 바이트를 문자로 변환하여 출력
			}
			fis.close();
		}catch(Exception ex) {}
		
	}

}
