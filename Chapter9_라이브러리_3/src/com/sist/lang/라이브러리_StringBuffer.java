package com.sist.lang;
/*
 *    StringBuffer
 *    ------------
 *    1. String은 고정형 => 변경이 되면 새로운 메모리를 생성
 *                       원본은 그대로 유지 (변하지 않는 문자열 저장)
 *       예)
 *          String s ="Hello Java";
 *          String ss = s.substring(0,5)
 *          => s값을 변경해서 저장하려면
 *             s=s.substring(0,5)
 *          => 변경시에 리턴형이 String                   
 *    2. String을 보완 => 가변형 ==> StringBuffer(비동기) /StringBuilder(동기)
 *       *** 프로그램에서의 동기(한개씩 수행) / 비동기(동시에 여러개 일 수행)
 *                     ---             ----
 *       네트워크 : 클라이언트(요청)/ 서버(응답)
 *               => 오라클 → 자바(요청)/오라클서버(응답)
 *               => 웹(클라이언트 / 서버)
 *                              --- JSP/Spring
 *    3. 데이터가 많은 경우 => 문자열 결합 (append)
 *    4. 문자열 처리할 때 사용하는 클래스
 *    5. 처리 속도가 빠르다(최적화)
 *    6. 주요 메소드
 *       length() : 문자갯수
 *       toString() : 객체를 문자열로 변환
 *                    ---------
 *                    (String)=>형변환, String.valueOf
 *       delete() : 삭제
 *    ***append() : 문자열 결합                                   
 *                                                  
 */
// append() => 문자열 결합
import java.io.*;
import java.net.*;
// => 클래스가 CheckedException을 가지고 있다. 
public class 라이브러리_StringBuffer {

	public static void main(String[] args) {
		try
		{
			StringBuffer sb = new StringBuffer();
			//Buffer => 임시 기억장소
			URL url =new URL("https://www.10000recipe.com/recipe/list.html");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			//서버에 연결
			if(conn!=null)//연결됐다면
			{
				//Document doc = Jsoup.connet().get()
				while(true)// 한줄씩 읽어온다.
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
					String msg=br.readLine();
					if(msg==null) 
						break;
					sb.append(msg+"\n");
				}
				conn.disconnect(); // 서버 연결 해제
				
			}
			System.out.println(sb.toString());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
