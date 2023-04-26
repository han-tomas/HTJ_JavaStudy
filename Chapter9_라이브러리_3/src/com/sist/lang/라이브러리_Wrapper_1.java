package com.sist.lang;

import java.util.ArrayList;
import java.util.List;

/*
 *    Wrapper : 전체를 감싼다.
 *    ------- CSS(container)
 *    프로그램 개발 => 기본형 데이터형을 객체단위로 저장이 필요할때
 *    List<int> => X 오류
 *        ----- 클래스형
 *    List<Integer>
 *    => 기본형을 클래스화 해서 사용
 *       ----------- Wrapper
 *       기본형        클래스형  => 기본형에 기능을 추가해서 클래스화 시킨것 (Wrapper)
 *       int         Integer
 *       long        Long
 *       byte        Byte
 *       double      Double
 *       boolean     Boolean
 *       --------------------------------------------
 *        식당이름   평점(0.0)
 *        -----   ---
 *        String  double
 *        String score =(String)4.3 ==> 오류
 *        String score =(double)"4.3" ==> 오류
 *     
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		String s ="4.3";
		double d= Double.parseDouble(s); //Wrapper클래스
		// 사용처 => 문자열을 원하는 데이터형으로 변경할때 주로 사용.
		//      => 클라이언트에 배포 => 윈도우/ 브라우저/ 핸드폰
		//                        -------------------모든 데이터형 문자열 => 기본형 데이터로 변경
		/*
		 *  외워야 하는 것.
		 *  1) 클래스명 : 객체단위로 저장
		 *  2)문자열을 해당 데이터형으로 변환할 때 ==> parseXxxx ==> static
		 *                                       ----- Integer,Double...
		 *  3) 오토박싱/ 언박싱 
		 *     오토박싱
		 *     Integer i = new Integer(10);
		 *     => Integer i = 10;(오토박싱) =>클래스 안에 일반 데이터값 설정 // String s="";
		 *     int aa = i (언박싱)=> 기본형에 클래스 객체를 설정
		 *                                         
		 */
		Integer i = 100; //오토박싱 //int i =100;
		System.out.println("i = "+i);
		int aa = i; // 언박싱
		System.out.println("aa = "+aa);
		/*
		 *    void display(Integer i1, integer i2)
		 *    => display(10,20) 
		 */
//		List<Integer> list = new ArrayList<Integer>();
		/*
		 *    Wrapper 클래스의 목적
		 *    1. 문자열을 해당 데이터형으로 변환할때 사용 (기본형에 기능부여)
		 *       문자열 => 정수형 Integer.parseInt("10")
		 *       문자열 => 실수형 Double.parseDouble("4.5")
		 *       문자열 => 논리형 Boolena.parseBoolean("true")
		 *    2. 객체단위로 저장할 때가 있다.(***자료구조 => Collection)   
		 */
		

	}

}
