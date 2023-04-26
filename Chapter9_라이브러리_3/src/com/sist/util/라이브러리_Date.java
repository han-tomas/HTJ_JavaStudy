package com.sist.util;
import java.text.SimpleDateFormat;
/*
 *    Date : java.util
 *      1) 시스템의 현재 시간/ 날짜를 읽어오는 클래스
 *         -----------------
 *      2) Date 클래스의 단점 => 기능이 빈약하다.
 *                           날짜만 저장하는 클래스 (오라클의 데이터형과 호환이 된다.)
 *                    보완 => Calendar
 *      3) Date => SimpleDataFormat => java.text
 *                 ---------------- 원하는 스타일로 날짜 변경
 *      4) 사용처 : 웹(등록일)                                   
 */
import java.util.*;
public class 라이브러리_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //월(MM)과 분(mm)은 문자가 충돌하기때문에 대소문자로 구분
		System.out.println(sdf.format(date));
		/*
		 *    년도 : yyyy(2023) , yyy(023)
		 *    월 : MM (01,02,...,12) , M(1,2,3,...,10,11,12)
		 *    일 : dd(01,02,03,...,31) , d(01,02,...,31) 
		 *    시간 : hh , h
		 *    분 : mm , m
		 *    초 : ss , s
		 *    
		 *    Date 호환, 날짜만 저장하는 기능을 가지고 있다 => DATE
		 */

	}

}
