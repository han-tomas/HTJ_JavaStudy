package com.sist.util;

import java.util.StringTokenizer;

// 네트워크
/*
 *    String s = "red|green|blue|black|yellow";
 *    => split, StringTokenizer
 *    => StringTokenizer st = new StringTokenizer(s,"|"); // \\을 줄 필요 없다.
 *       ------------------------------------------------------------------
 *       String [] colors = s.split("\\|");
 *         => 원형 : split (String regex)  // regex : 정규식
 *       
 *       StringTokenizer st = new StringTokenizer(s,"|");
 *       
 *       커서 이동
 *       ----------------
 *  커서 ->  before  First
 *       ----------------
 *          red => nextToken()
 *       ----------------
 *          green => nextToken() 
 *       ----------------
 *          blue    => nextToken() 
 *       ----------------
 *          black     => nextToken() 
 *       ----------------
 *          yellow     => nextToken() 
 *       ----------------
 *         after  Last   => nextToken()  => false(읽기 종료)
 *       ----------------
 *       *** 갯수가 초과되면 에러
 */

public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		String s = "red|green|blue|black|yellow";
		StringTokenizer st   = new StringTokenizer(s,"|");
		/*System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());*/ // 갯수가 초과할경우 오류 발생
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
