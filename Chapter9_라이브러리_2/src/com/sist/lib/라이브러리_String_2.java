package com.sist.lib;
import java.io.*;
public class 라이브러리_String_2 {

	public static void main(String[] args) {
		try
		{
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0; // 문자 읽기 => int로 읽는다.
//			String data ="";
			StringBuffer data = new StringBuffer(); //StringBuffer는 한 메모리 공간에 데이터를 계속 추가 
			                                        //=> 메모리 공간을 계속 만들 필요가 없어 속도가 빠르다
			while((i=fr.read())!=-1) //-1 (EDF) file의 끝
			{
//				data+=(char)i;
				data.append((char)i);
			}
			long end = System.currentTimeMillis();
			
			fr.close();
			System.out.println(data);
			System.out.println("걸린시간 : "+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace(); //에러메세지 학인 ,위치도 확인
			// ex.getMessage()
		}

	}

}
