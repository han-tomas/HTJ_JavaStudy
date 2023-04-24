package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

// 예외 떠맡기기, 예외 회피 ...
// => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다 알려만 주는것 => 예외선언
// => 메소드 호출시에 반드시 직접처리를 할것인지, 선언할것인지 선택
// => RuntimeException => 생략이 가능 (예외처리를 안해도 된다.)
/*
 *    상위 클래스를 이용해서 전체를 처리가 가능하다.
 *          Throwable (Exception/Error)
 *               |
 *       ------------------------------
 *       |                            |
 *      Error                     Exception       
 *                      Check         |           UnCheck
 *                      --------------------------------
 *                      |                              |
 *                   IOException                RuntimeException
 *                   SQLException                      |
 *                   ...                        NumberFormantException, Arra...
 *                   ...
 *                                  
 *      Void method() throws RuntimeException
 *      void method() throws Exception => 무조건 예외처리를 해주어야 한다. CheckedException
 *      void method() throws NumberFormatException, ClassCastException...
 *      void method() throws IOException => 무조건 예외처리를 해주어야 한다. CheckedException
 *      void method() throws SQLException => 무조건 예외처리를 해주어야 한다. CheckedException     
 *      => throws 뒤에는 주로 Checked     
 */ 
public class 예외처리_예외회피_1 {
	public static void method() throws Exception
	{
		// 예외처리 대상
	}
	public static void method1() throws Exception // 간접 처리 (JVM이 처리)
	{
		method();
	}
	public static void method2()
	{
		try
		{
			method();
		}catch(Throwable e) // 같거나 큰거로
		{
			
		}
	}
	public static void method3() throws IOException, SQLException,ClassNotFoundException
	{
		
	}
	public static void method4() throws IOException, SQLException,ClassNotFoundException
	{
		method3();
	}
	public static void method5() throws Exception
	{
		method3();
	}
	public static void method6() throws Throwable
	{
		method3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
