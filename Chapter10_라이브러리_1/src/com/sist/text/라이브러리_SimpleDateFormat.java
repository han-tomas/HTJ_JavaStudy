package com.sist.text;
/*
 *    java.text => 출력 형태를 만들어서 사용 (변경)
 *    ---------
 *     SimpleDateFormat : 날짜 변경
 *     DecimalFormat : 숫자변환
 *     ------------- 가격 출력 10000원  (X)
 *                           10,000원 (O)
 *     MessageFormat : 데이터베이스 => INSERT, UPDATE                      
 *     -------------
 *     String name="" , sex = "", addr = "",tel = "";
 *     int age = 10;
 *     
 *     
 *     String sql ="INSERT INTO member VALUES("
 *                 +"'"+name+"','"+sex+"','"+tel+"','"+addr+"','"+age+")";
 *     String sql = "INSERT INTO member VALUES('{1}','{2}','{3}','{4}','{5}')            
 */
import java.util.*;
import java.text.*;
//import java.sql.*;
public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		Date date = new Date(); //Date클래스는 util패키지와 sql패키지에도 같은이름으로 존재해 충돌이 일어마므로 주의할것.
		                        // 패키지명에 Date를 명시해주거나 클래스 앞에 패키지를 붙일것.
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
		/*
		 *             오라클
		 *   yyyy 년 => rrrr
		 *   MM 월   => mm 
		 *   dd 일   => dd
		 *   hh 시   => hh24
		 *   mm 분   => mi
		 *   ss 초   => ss
		 */

	}

}
