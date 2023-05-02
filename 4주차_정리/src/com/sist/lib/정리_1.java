package com.sist.lib;
/*
 *    8장 => 예외처리
 *           => 목적 : 사전에 에러를 방지하는 프로그램을 제작
 *                    비정상 종료를 방지하고 정상 상태 유지
 *           => 예외처리의 방법
 *              ------ 수정이 가능한 에러  
 *              1) 상속도 => 예외처리 방법에 순서 존재
 *                         Object
 *                           |
 *                       Throwable (Spreing => AOP)
 *                           |       
 *              -------------------------------
 *              |                             |
 *            Error                      Exception (예외처리의 최상위 클래스)
 *                      CheckedException      |       UnCheckedException
 *                      컴파일시에 예외처리여부 확인 |       예외처리여부를 미확인
 *                      => 예외처리를 반드시 한다. |        => 필요시에만 작업
 *                                            |        => 자주 오류나는 부분은 예외하는 것이 좋다.
 *                                            |        => NumverFormatException 
 *                                            |           (사용자 입력)
 *                                            |        ***  에러 : 사용자 입력 / 프로그램 실수
 *                                            |        => NullPointerException   
 *                      ------------------------------------------------
 *                      |                                              |
 *                  IOException : file명 / 디렉토리명               실행시 에러(인터프리터)
 *                  ClassNotFoundException                       RuntimeException
 *                  => Class.forName("패키지명.클래스명")                  |
 *                  => 웹 (MVC)                                  NullPointerException
 *                  InterruptedException (쓰레드)                  ex) String s;
 *                  MalformedURLException (ip,web:네트워크)            s.replace;
 *                  SQLException(문법 => 오라클)                   NumverFormatException
 *                                                               ex) Integer.parseInt(" 10");
 *                                                               web
 *                                                               ---
 *                                                               에디터 전송
 *                                                               웹주소/파일명?no= 10 =>공백이 있으면 안된다.
 *                                                              ArrayIndexoutOfBoundException
 *                                                              ClassCastException
 *              2) 예외처리의 종류
 *              ***= 예외 복구 (프로그래머가 주로 사용)
 *                   try
 *                   {
 *                      정상적으로 수행하는 소스 코딩
 *                      => 에러발생시 catch로 이동
 *                         -------------------
 *                         에러 밑에 있는 문장은 수행하지 않는다.
 *                   }catch(예외처리 클래스)
 *                   { 
 *                      try 수행시 에러가 발생할 때 처리되는 문장
 *                      여러개 사용할 수 있다
 *                      => 순서가 존재 (상속도)
 *                      => 상속을 내리는 클래스가 처리하는 예외가 많다.
 *                   }
 *                   finally
 *                   {
 *                      생략이 가능
 *                      try,catch 수행 상관없이 무조건 수행
 *                      => File닫기
 *                      => 오라클 연결 해제
 *                      => 서버 연결 해제
 *                   }
 *                   
 *              ***= 예외 회피 : 예외 떠넘기기 (라이브러리)
 *                   => 사용법
 *                      메소드 선언 뒤에 예상되는 에러를 선언
 *                      => 메소드 호출시에 처리할 수 있게 만든다.
 *                         ==> 사용하는 프로그래머가 처리해서 사용
 *                         ==> 1) 선언
 *                             2) try~catch
 *                                public void method() throws 예외처리클래스,예외처리 클래스, ...
 *                                                            ---------------------------- 순서가 없다
 *                                                            method호출시에 예상되는 에러 체크
 *                         ==> 메소드 호출
 *                             public void method() throws 예외처리클래스,예외처리 클래스, ...   
 *                             {
 *                               
 *                             }
 *                             public void display() 
 *                             {
 *                                try
 *                                {
 *                                   method();
 *                                }
 *                                catch(예외클래스){}
 *                                catch(예외클래스){}
 *                             } 
 *                                              
 *                            선언된 예외 클래스가 많은 경우
 *                            => 1) catch()를 여러개 사용
 *                            => 2) 전체를 포함 클래스로 통합
 *                                  ------------------- Exception /Throwable                
 *                 = 예외 임의 발생 : throw (테스트용으로 사용) => 배포
 *                 = 사용자 정의 예외처리 : 거의 사용 빈도가 없다.
 *                   class MyException extends Exception
 *                   => if문을 더 많이 사용
 *                ---------------------------------------------- 자바의 문법(8장)
 *                => 프로그램에서 제어가 안되는 경우가 많다.   
 *                   => 다른 프로그램과 연동
 *                      브라우저, 오라클 ...
 *                   => 파일읽기 / 쓰기
 *                   => 프로그램 안에 다른 프로그램을 동시 동작
 *                   => 자료 구조(메모리 관리)
 *                   ----------------------> 직접 만들어서 제공(라이브러리)
 *                   ----------------------> 사용자 정의 클래스 + 라이브러리 => 조립
 *                   
 *    9장/10장 => 라이브러리
 *    ------------------
 *    java.lang : 자바 프로그램의 기본 라이브러리 (가장 많이 사용)
 *                => import를 생략
 *      => Object
 *         => Object clone() : 복제(prototype : Spring)
 *            새로운 메모리 생성
 *         => equals() : 객체 비교 (오버라이딩을 하기 전까지는 메모리 주소를 비교)
 *                                ------- 값을 비교 : String
 *         => toString() : 객체를 문자열화 (디폴트는 메모리주소 리턴)
 *         => finalize() : 소멸자(객체 메모리 해제 => 자동 호출)                          
 *      => String
 *      => StringBuffer
 *      => Wrapper
 *      => System
 *      => Math            
 *    java.util
 *    java.text
 *    java.io
 *    java.net
 *    java.sql
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
