package com.sist.io;
// 파일 읽기
// FileInputStream(1byte) / FileReader(2byte)
// 한글이 포함 ==> 반드시 2byte씩 읽어야 => 한글깨짐 방지가 가능하다.
import java.io.*;

public class 입출력_2 {

	public static void main(String[] args) {
		FileReader fr = null;
		try
		{
			fr= new FileReader("c:\\javaDev\\movie.txt");
            // BufferedReader
			BufferedReader in = new BufferedReader(fr);
			int i = 0; // 한글자씩 읽기 => read()
			// int read() => 글자의 ASC코드를 읽어온다 (정수)
			// A => read() => 65
			// int read(byte[],int,int) => 읽은 "바이트 수"
			long start = System.currentTimeMillis();
			
			
			/*while((i=in.read())!=-1)
			{
				// -1 => 읽을 데이터가 없는 경우 => 전체 데이터 읽은 경우
				// EOF
				System.out.print((char)i);
			}*/
			while(true)
			{
				String data = in.readLine(); //BufferedReader는 한글자가 아닌 한줄씩 읽을 수 있는 메소드 readLine()가 있다.
				                             // ==> 데이터 읽는 속도가 훨씬 빨라진다.
				if(data==null) break;
				
				System.out.println(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end-start));
					
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
	}

}
