package com.sist.exception;

/*
 *    에러 => 컴파일(javac) / 실행시(java)
 *           ----------    ---------
 *           Check         UnCheck → 생략
 *             ↓
 *           자바문법(반드시 예외처리)  
 *    에러
 *    ---
 *      = 수정이 불가능한 에러(심각한 오류) => 메모리 부족, 윈도우 덤프
 *        Error
 *      = 수정이 가능한 에러(가벼운 오류) :  소스상에서 수정이 가능
 *        => 파일읽기 (파일명이 틀리다.), 배열 인덱스를 벗어난 경우
 *        => 웹 연결 (URL주소가 틀리다)    
 *        => Exception (예외처리)   
 *      
 *    에러가 발생
 *    --------
 *      1. 프로그래머의 실수
 *         => 초기화값이 없는 상태에서 비교
 *         => 배열 인덱스 오류
 *         => 무한 루프
 *         => 파일명 오류 ...
 *      
 *      2. 사용자 입력 오류
 *         => 계산기 나누기 0입력
 *         => 정수입력에 문자열 입력 ...
 *         ----------------------- 웹에서 유효성 검사
 *     
 *    예외처리 : 견고한 프로그램을 만들기 위해 사용        
 *            ----------- 비정상 종료를 방지하고 정상상태 유지
 *                        사전에 에러를 방지 
 *      1. 예외처리 방식
 *         = 고려할 점 : if => 예외처리
 *         = 예외처리 : 복잡한 에러, if로 해결이 불가능
 *         = 웹 : 404(파일이 없는 경우), 500(소스오류), 415(한글변환), 400(값을 잘못 받는 경우), 403(접속거부) ...
 *      
 *      2. 예외처리 종류
 *         = 예외 발생시 => 복구
 *           try ~ catch
 *           형식) 
 *               try
 *               {
 *                  정상 수행하는 문장
 *                  int a = 10;
 *                  int b= 0;
 *                  double d= a/(double)b; => 0으로 나누게 될 시 오류발생 ==> catch로 이동
 *                  System.out.println(d); ==> 수행 X
 *               }catch(NumberFormatException e)
 *               {
 *               }catch(ArrayIndexOutOfBoundsException e)
 *               {
 *               }catch(나누기 ...)
 *               {
 *               }catch(Exception e)
 *               {
 *                  예외발생시 처리하는 영역
 *               }
 *               
 *               -----
 *               -----
 *               -----
 *               사용자로부터 문자열을 받아서 정수 변경후에
 *                        ------------------ 
 *               배열에 저장
 *               --------
 *               나누기를 한 후에 출력
 *               ----
 *         = 예외발생시 => 회피
 *           throws
 *         = 예외발생 => 테스트
 *           throw
 *         = 사용자 정의 예외
 *           => 지원하지 않는 예외가 존재      
 *         
 *         예외처리의 계층 구조   
 *                Object
 *                  |
 *               Throwable
 *                  |
 *     ----------------------------------------
 *     |                                      |
 *    Error                               Exception
 *                                            |
 *                      -------------------------------------------
 *                      |                                         |
 *                CheckException(존재X)                   UnCheckException(존재X)
 *                      | 반드시 예외처리                              | 필요시에만 사용
 *                 IOException(입출력)                       RuntimeException
 *                 => 메모리 입출력, 파일 입출력, 네트워크 입출력             |
 *                    java.io => 클래스가 동일               NumberFormatException
 *                                                        문자열 => 정수형으로 변경
 *                 SQLException (오라클 연동)                 윈도우/웹 => 주소란
 *                    java.sql => 네트워크 통신               
 *                    자바응용프로그램 <==========> 오라클       NullPointerException
 *                        (C)                  (S)        => 객체 초기화가 안된상태
 *                       Client               Server      => 참조할 주소가 없는 경우(선언만 한 경우 A a)
 *                       웹에 출력하는 모든 데이터 => 오라클       
 *                    자바 ===================> 오라클       ArrayIndexOfOutBoundsException
 *                         자바언어전송(X)                    => 배열범위 초과시 발생
 *                         오라클이 인식하는 언어전송(SQL)        
 *                         SELECT * FROM 테이블명             ArithmeticException
 *                                                          => 0으로 나눌경우
 *                 ClassNotFoundException 
 *                 => 클래스명이 틀린경우                       ClassCastException
 *                    Class.forName("패키지.클래스명")         => class형변환이 잘못 되었을 경우
 *                 ...
 *                 ...                                    IllegalArgumentException
 *                 MalformedURLException                  => 부적절한 인자 전달
 *                   => URL 주소가 틀린경우
 *                   => Jsoup                             StringIndexOutOfBoundsException
 *                 InterruptedException                   => 문자열관련
 *                   => 쓰레드 충돌   
 *      
 *      263page
 *      -------
 *      예외의미 => 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시 
 *               처리를 어떻게 할지     
 *               ------------
 *               프로그램 에러시에 비정상적으로 종료되는 것을 방지하고
 *               정상적으로 종료가 가능하게 만드는 과정(예외처리)
 *      ㅇ         
 *                                                    
 */ 
class AAAAA
{
	public void display() {
		System.out.println("A:display() Call");
	}
}
class BBBBB
{
	
}
class CCCCC extends BBBBB
{
	public void display(int a, int b, int c)
	{
		System.out.println("1");
	}
	public void display(int a, char b, byte c)
	{
		System.out.println("2");
	}
	public void display(char a, char b, int c)
	{
		System.out.println("3");
	}
}
public class 예외처리_1 {
    static String s;
	static AAAAA a; 
	public static void main(String[] args) {

		String page= " 1";
		System.out.println(Integer.parseInt(page)); // 해당 문자열에 공백으로 인한 NumberFormatException 발생
		
		a.display(); // new로 메모리할당을 안했기 때문에 NullPointerException 발생
		
		if(s.equals("Hello"))  // 초기화가 안되어있으므로 주소값 null => NullPointerException 발생
			System.out.println("OK");
		
		int[] arr = new int[2];
		arr[2] =10; // 배열범위 초과 ArrayIndexOfOutBoundsException 발생
				
		System.out.println(10/0); // 0으로 나눠서 ArithmeticException 발생

		CCCCC cc = (CCCCC)new BBBBB(); //class형변환이 잘못 되었기 때문에 ClassCastException
		
		CCCCC cc1 = new CCCCC();
		cc1.display('A', 10, 'B'); //public void display(char a, int b, char c)형태가 없어 IllegalArgumentException 발생
		System.out.printf("%d %c %s\n",10,20,30); //%c는 char형인데 20은 int이기 때문에 IllegalArgumentException 발생
		
		String ss = "Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"), ss.lastIndexOf("J"))); // 문자열에서 K를 찾을수 없으므로 StringIndexOutOfBoundsException 발생
		
//		==============================================================

		int a=10;
		int b=0; // 사용자로부터 값을 받았을때
		// 처리
		if(b!=0) // 정상수행 ==> try
		{
		   int c = a / b;
		   System.out.println("c= " + c);
		}
		else // 예외처리 ==> catch
		{
			System.out.println("0으로 나눌 수 없다.");
		}
		//1. 정상적으로 종료가 되도록 만든다.
		//2. 우선적 => if문으로 처리가 가능한지 => 자바에 제공하는 예외처리를 이용한다.
		//3. if문은 주로 ==> 검색용도 , 사용자 입력 제한 ...
	}

}
