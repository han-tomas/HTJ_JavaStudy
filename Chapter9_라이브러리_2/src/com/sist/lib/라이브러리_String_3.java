package com.sist.lib;

import java.util.Scanner;

// String 메소드 (문자열을 제어하는 기능)
/*
 *    String은 문자열 배열
 *    ------ 문자마다 인덱스번호를 가지고 있다.(0부터 시작)
 *    String s="Hello Java"
 *              0123456789 ==> 오라클은 1번부터 시작
 *                 			   자바      => ==   !=    substring(0,3) => 012
 *              			   오라클     => =    <>    substr(1,5)
 *              			   자바스크립트 => ===  !==
 *    주요기능(310page)
 *    1) 문자열에서 문자 한개 추출 => charAt(int index) //return형은 char          
 *              
 */
public class 라이브러리_String_3 {

	public static void main(String[] args) {
		
		/*String s1="Hello ";
		System.out.println(s1.hashCode());
		s1=s1+"Java";
		System.out.println(s1.hashCode());*/ // 문자열을 결합하면서 메모리 주소가 달라짐을 확인.
		
		String msg ="Hello Java";
		
		/*for(int i=0;i<msg.length();i++)
		{
			System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
		}*/
		
		
		//코딩 테스트 => msg를 거꾸로 출력하는 프로그램 작성
		/*for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		}*/
		
		//알파벳 문자열을 입력 받아서 대문자, 소문자 갯수를 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 문자열 입력 : ");
		String s = scan.nextLine();
		int big=0;
		int small=0;
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c>='A' && c<='Z')
				big++;
			else if(c>='a' && c<='z')
				small++;
			/*if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				big++;
			}
			else if((s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				small++;
			}*/
			
		}
		System.out.println("대문자 갯수 : "+big+", 소문자 갯수 : "+small);

	}

}
