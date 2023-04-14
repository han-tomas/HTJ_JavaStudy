package com.sist.main;
/*
 *    초기화
 *    1. 디폴트 값
 *       int => 0, String => null, boolean => false ...
 *       class A
 *       {
 *           int a; ==>0
 *       }
 *    2. 명시적 초기화 : 직접 값을 설정
 *       class A
 *       {
 *          int a = 10;
 *       }
 *       
 *    3. 생성자 초기화
 *       class A
 *       {
 *           int a;
 *           A(){
 *              a=100;  ==> 생성자를 이용해서 구현
 *           }
 *       }
 *    4. 초기화 블록
 *       class A
 *       {
 *           int a;
 *           //a=1000; ==> 오류 발생
 *           {
 *              a=1000; ==> 초기화 블록을 이용하여 구현  
 *           }
 *       }
 *       디폴트 =>     명시적    => 초기블록    => 생성자
 *       int a;   int a =10;   { a=100;}    A(){a=1000;} ==> 최종적으로 생성자에 있는 값
 *                ==> 명시적으로 선언하는게 제일 효율적 
 *                    블럭과 생산자에서는 연산처리 , 제어문 , 파일읽기...
 */
//class Student{
//	
//	int hakbun=10000;
//	
//	String name;
//	{
//		hakbun=100; // 연산처리, 제어문, 파일읽
//	}
//	Student(){
//		hakbun=1000;
//	}
//
//	
//}
class Student{
	int hakbun;
	String name;
	Student()
	{
		System.out.println("Student() Call");
		hakbun=1;
		name="홍길동";
	}
	Student(int h, String n)
	{
		hakbun=h;
		name=n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); // Student() ==> 생성자
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		System.out.println("------------------");
		new Student();
		System.out.println("------------------");
		
		// 생성자 호출시에는 반드시 new를 붙여야 한다.
		Student s1 = new Student();
		System.out.println(s1.hakbun); // 매개 변수가 없는 생성자는 데이터를 하나밖에 표현하지 못한다.
		System.out.println(s1.name);
		
		System.out.println("------------------");
		
		Student s2 = new Student(2,"심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3 = new Student(3,"박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);

	}

}
