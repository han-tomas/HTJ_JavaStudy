package com.sist.io;
// BufferedReader /BufferedWriter
import java.io.*;
public class 입출력_4 {
	public static void main(String[] args) throws Exception {
		// 기반 스트림 생성
		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt");// 자동으로 지정된 파일을 생성, 이미 존재하는 경우에는 덮어쓴다.//create
		// 추가기능 FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt",true); // 이미존재하는 파일 밑에 붙여출력한다.//append
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");
		
		
		//필터 스트림 생성
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		while(true)
		{
			String data = br.readLine();
			if(data==null) break;
			bw.write(data+"\n");
		}
		System.out.println("파일 읽기/쓰기 완료!");
		in.close();
		out.close();

	}

}
