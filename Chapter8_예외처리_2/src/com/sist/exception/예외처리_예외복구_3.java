package com.sist.exception;
/*
 *    문자열로 2개의 정수 받아서 => 정수로 변환한 후에 : NumberFormatException
 *                           배열에 저장 : ArrayIndexOutOfBoundsException
 *                           나누기 한 값을 구한다. : ArithmeticException
 */
import java.util.*;
public class 예외처리_예외복구_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		String num1= scan.next();
		System.out.print("두번째 정수 입력 : ");
		String num2= scan.next();
		
		int[] arr = new int[2];
		// 다중 catch문 => 예상되는 에러가 많은 경우 사용
		// catch절은 한개만 수행한다. => 다중 조건문
		try
		{
			// 문자열을 정수로 변환
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			
			// 배열에 첨부
			arr[0]=n1;
			arr[1]=n2;
			
			// 나누기
			System.out.println(arr[0]/(double)arr[1]);
		}catch(NumberFormatException ex)
		{
			System.out.println("정수 변환 에러 발생!!");
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("배열 범위를 초과한 에러 발생!!");
		}catch(ArithmeticException ex)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료!!"); // 출력 => 정상종료	
	}

}
