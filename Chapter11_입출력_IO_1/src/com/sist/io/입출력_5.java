package com.sist.io;
import java.io.*;
import java.net.*;
/*
 *         URLConnection =>openConnection()
 *              |
 *    -------------------------
 *    |                       |
 *   HttpURLConnection       HttpsURLConnection
 */
public class 입출력_5 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); //openConnection()은 리턴형이 URLConnection이므로, 
		                                                                  // HttpURLConnection으로 형변환이 필요하다.
		// 연결이 되었다면
		if(conn != null)
		{
			// 브라우저는 1byte씩 전송
			// 1byte를 2byte로 변환이 필요
			// ==> InputStreamReader
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			/*
			 *  한글이 깨질경우
			 *  BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			 */
			while(true)
			{
				String data = in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
	}

}
