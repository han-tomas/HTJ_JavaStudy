package com.sist.main3;
/*
 *    인터페이스 간의 상속
 *    interface A
 *    interface B extends A
 *                -------
 *    
 *    interface A
 *    {
 *       void aaa();
 *    }
 *    interface B extends A
 *    {
 *       void bbb();
 *       //void aaa();
 *    }       
 *    
 *    class C implements B
 *    {
 *       public void aaa(){}
 *       public void bbb(){}
 *    }     
 */
interface A
{
	
}
interface B extends A // A>B
{
	
}
class C implements B // B>C => interface도 클래스와 동일 => 구분(클래스는 단일 상속, 인터페이스 다중 상속 가능)
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a = new C();
        B b = new C();
        C c = new C(); //다중 상속시에는 클래스로 객체 생성
        
        if(c instanceof A) // c 객체는 A에 포함 C<A => true
        	System.out.println("맞다");
        if(c instanceof B) // c 객체는 B에 포함 C<B => true
        	System.out.println("맞다2");
        if(b instanceof A) // b 객체는 A에 포함 B<A => true
        	System.out.println("맞다3");
        
        if(a instanceof C) // a 객체는 C에 포함 A==C => A a = new C();로 선언했기 때문에
        	System.out.println("맞다4");
        if(a instanceof B) // a 객체는 B에 포함 A<B => true
        	System.out.println("맞다5");
        
        
        String s="";
        StringBuffer sb = new StringBuffer();
        Object o = new Object();
        if(s instanceof Object)
        	System.out.println("OK");
        if(sb instanceof Object)
        	System.out.println("OK2");
        if(o instanceof String)
        	System.out.println("OK3");
        
        // instanceof는 객체 크기
        // 오른쪽 클래스가 크거나 같으면 => true
        
//        if(s instanceof StringBuffer)=> 오류 (상속, 포함 관계가 아닌경우는 크기를 잴 수 없다.)
        
	}

}
