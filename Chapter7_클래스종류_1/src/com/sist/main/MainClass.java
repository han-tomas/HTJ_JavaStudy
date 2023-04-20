package com.sist.main;
/*
 *    1. 제어어
 *    --------
 *    1) static : 공통적인
 *    => Math: 모든 메소드는 static
 *    2) final : 마지막 => 변수(상수)/class(종단클래스 => 확장이 불가능, 상속할 수 없다.)
 *    => class final ClassName
 *       = System, String, Math, StringBuffer => 있는 그대로 사용
 *         java.lang
 *    3) abstract : 추상적인 => 공통점을 모아준다. => 프로그램에 맞게 구현 
 *    ---------------------------------------------------------------------
 *    = 클래스의 종류
 *      1) 추상 클래스
 *         형식)
 *             public abstract class ClassName
 *             {
 *                ------------------------------------
 *                 1. 변수 (멤버변수)
 *                ------------------------------------
 *                 2. 메소드 : 구현된 메소드
 *                ------------------------------------
 *                 3. 메소드 : 구현이 안된 메소드 (선언만)
 *                    => 자신이 메모리 할당이 불가능하다.
 *                    예) 
 *                       abstract class A
 *                       {
 *                       }
 *                       A a = new A(); => 오류
 *                       오류 해결 : 상속을 받는다 => 구현이 안된 메소드를 구현후에 사용
 *                                ==> 오버라이딩
 *                       class B extends A
 *                       {
 *                       }
 *                       
 *                       A a = new B(); => 묵시적 형변환 (자동 형변환)
 *                             ------- a가 가지고 있는 메소드는 B로 대체
 *                       B b = new B();
 *                ------------------------------------
 *                 4. 생성자
 *                ------------------------------------
 *             }   
 *      2) 인터페이스 : 추상 클래스의 단점을 보완
 *                   1. 단일 상속 => 다중 상속
 *                   2. 추상 클래스의 일종 (클래스 => 상위 클래스)
 *                   3. 구성요소
 *                   public interface InterfaceName
 *                   {
 *                      ------------------------------------
 *                       변수 설정
 *                         상수형 변수
 *                         int a; ==> 오류 발생
 *                         int a = 10;
 *                         => 컴파일시, 
 *                         public static final int a=10;
 *                         ------------------- 자동으로 추가된다.
 *                      ------------------------------------
 *                       메소드 => 구현이 안된 메소드
 *                         void display();
 *                         => 컴파일시,
 *                            public abstract void diplay();
 *                            --------------- 자동으로 추가된다.
 *                            문제점)
 *                                  interface A
 *                                  {
 *                     (public abstract) void display();
 *                                  }
 *                                  class B implements A
 *                                  {
 *                                     오버라이딩 => 조건에서 오류 발생
 *                                     void display()  ==> 오류 => 접근 지정어의 축소
 *                                     {
 *                                     }
 *                                     public void display() ==> 정상
 *                                     {
 *                                     }
 *                                     
 *                                  }
 *                                  *** 인터페이스의 모든 메소드와 변수는 public이다.
 *                                       => 오버라이딩 하려면 public 선언해야한다.
 *                                          ==> 다른 접근 지정어는 올 수 없다.
 *                            
 *                      ------------------------------------
 *                       메소드 => 구현된 메소드(JDK 1.8이상) =>  인터페이스에 선언된 메소드 추가시 관련된 모든 클래스가 오류 발생
 *                         default void methodName() 
 *                         ------- public이 자동 추가
 *                         {
 *                         }
 *                      ------------------------------------
 *                       메소드 => 구현된 메소드(JDK 1.8이상)
 *                         static void methodName()
 *                         ------ public이 자동 추가
 *                         {
 *                         }
 *                         public static void methodName() ==> 애초에 public을 붙여서 선언 가능
 *                         {
 *                         }
 *                      ------------------------------------
 *                      
 *                   }
 *                   *** 추상클래스, 인터페이스는 상속을 받는 경우
 *                       반드시 선언만 된 메소드를 구현해서 사용한다.
 *                   *** 추상클래스 : 입출력, 네트워크, 데이터베이스 연결
 *                   *** 인터페이스 : 윈도우 이벤트 처리
 *                                 버튼클릭, 마우스 클릭, 키보드 ...	    
 *      3) 내부클래스 (네트워크, 빅데이터)
 *         멤버클래스 : 쓰레드 => 데이터를 공유할 목적
 *         <내부클래스인 경우>
 *         class A => (server)
 *         {
 *            A,B,C,D,E =>  변수/메소드
 *            class B =>(통신)
 *            {
 *               A, B, C ...
 *            }
 *         }
 *         
 *         <내부클래스가 아닌 경우>
 *         class A
 *         {
 *            A
 *         }
 *         class B
 *         {  
 *            A a = new A();
 *            a.A              =>A라는 변수/메소드를 사용하는 법
 *         }
 *         
 *         
 *         익명의 클래스 : 상속이 없이 오버라이딩이 가능
 *         class A
 *         {
 *            B b = new B()
 *            {
 *               void display(){}
 *            } => 상속 없이 오버라이딩 하는 경우
 *         }
 *         class B
 *         {
 *            void display(){}
 *         } 
 */
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MainClass extends JFrame  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
