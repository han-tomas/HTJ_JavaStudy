package practice;

import java.util.Arrays;
import java.util.Scanner;
/*
 *    method => 140page
 *    1) 메소드 형식
 *       --------
 *         웹 => 화면 변경
 *         ------------ 메뉴 클릭, 버튼 클릭, 이미지 클릭 ...
 *         검색, 글쓰기, 수정, 회원가입, 회원탈퇴...
 *         사용자의 동작과 관련
 *         리턴형 메소드명(매개변수...) => 선언부
 *         {
 *            구현부 
 *         }
 *       = 리턴타입 (리턴형)
 *         처리후 결과값 한개만 전송이 가능하다.
 *         *** 여러개인 경우 : 배열, 클래스
 *         *** 한개인 경우 : 일반 기본형, String
 *         1) 결과값이 있는 경우
 *            리턴형 메소드명 (매개변수...)
 *            ---- 일치 ==> 리턴형이 클 수 있다.
 *            {
 *            return 값;
 *                   --- 일치
 *            }
 *         예)
 *            int method()
 *            {
 *               return 10.5; ==> 오류 발생
 *            }
 *            
 *            int method()
 *            {
 *               return (int)10.5; 
 *            }
 *            ==> int a = method(); ==> a=10
 *            
 *            double method()
 *            {
 *               return 10;
 *            }
 *            ==> double d= method(); // 결과값을 받아서 처리
 *            예) 오라클에서 데이터를 읽기
 *               -----------------
 *               => 브라우저로 보낸다.
 *            
 *            int[] method()
 *            {
 *               int[] arr={1,2,3,4,5};
 *               return arr; // 배열 주소만 넘겨준다.
 *            }
 *            ==> int[] arr = method();
 *            
 *            
 *         2) 결과값이 없는 경우
 *            void method()
 *            ----
 *            {
 *               return; // 메소드 정리
 *            }
 *            void method1()
 *            {
 *               (return생략) => but 컴파일러가 자동으로 return 추가
 *            }                            => import 자동추가
 *            ==> method()                    import java.lang.*;                           
 *                                                  System
 *       = 메소드명 => 식별자와 동일                       String
 *                  길이에 제한이 없다.=> 의미를 부여         Math  
 *       
 *       = 매개변수 : 사용자 요청값
 */
public class 문제_1 {
	
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력 : ");
		int num = scan.nextInt();
		int[] binary = new int[16];
		int index = 15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		for(int i=0; i<binary.length;i++)
		{
			if(i%4==0&&i!=0)
			System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		process();

	}

}
