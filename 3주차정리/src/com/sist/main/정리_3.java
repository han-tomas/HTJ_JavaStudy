package com.sist.main;
/*
 *    객체 => 114 page
 *    클래스 => 115 page
 *    인스턴스 => 117 page
 *    클래스 구성요소 => 122 page
 *    객체 생성 => 123 page
 *    -----------------------
 *    패키지 => 132 page
 *    메소드 => 140 ~150 page
 *    생성자 => 166 page
 *    멤버 변수의 초기화 => 168 page
 *    생성자 오버로딩 => 171 page
 *    생성자 => this() 173 page this : 클래스 자신의 객체명 (static)
 *    
 *    class A
 *    {
 *    }
 *    
 *    A a = new A();
 *    => JVM  => 메모리 생성
 *    
 */
public class 정리_3 {

	정리_3()
	{
		System.out.println("this= "+this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		정리_3 a = new 정리_3();
		System.out.println("a = "+a);
	}

}
