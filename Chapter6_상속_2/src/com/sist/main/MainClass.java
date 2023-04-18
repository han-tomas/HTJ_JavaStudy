package com.sist.main;
/*
 *    스프링 => 1) 가급적이면 상속없이 독립적인 클래스 (POJO) ==> 한 클래스에 문제가 생겨도 다른 클래스에 영향을 주지 않는다.
 *            2) new를 사용하지 않는다.
 *            ----------------------------------- 
 *    상속(is-a) => 재사용 
 *    단점 : 실행속도가 늦다.(사용빈도 극히 드물다) => 방안: 포함 클래스 (has-a)
 *          상속    /    포함
 *         ----        ---- => 제공한 그대로 사용
 *                             ------------ 오버라이딩이 가능 (익명의 클래스)
 *         => 기능(메소드) 수정 하거나 변수를 추가해서 사용 
 *    => 상속을 받는 경우
 *       class A
 *       {
 *          int a;
 *          int b;
 *          static int c;
 *       }
 *       class B extends A
 *       {
 *          int d;
 *          int e;
 *          // int a,b;
 *       }     
 *       
 *       B b = new B(); => A 객체가 먼저 생성 후, B 객체가 생성된다
 *       
 *       기존의 클래스를 재사용, 수정, 추가 가능
 *       ---------------
 *            |
 *           소스 코딩량을 줄일 수 있다. => 스프링(AOP)
 *           코드를 공통적으로 사용하기 때문에 관리가 편하다.  
 *           class A
 *           {
 *              public void display(){} => 하나 바꾸면 다 바뀐다.
 *           }
 *           class B extends A
 *           {
 *           }
 *           class C extends A
 *           {
 *           } 
 */
class Super
{
	int a,b;
	static int c;
	
	public Super() // 생성자 호출되면 메모리가 할당
	{
		System.out.println("Super 클래스 메모리 할당");
	}
}
class Sub extends Super
{
	int d,e;
	public Sub()
	{
		System.out.println("Sub 클래스 메모리 할당");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Sub sub = new Sub(); //상속한 클래스 먼저 메모리가 할당되고, 상속받은 클래스 메모리 할당
	}

}
