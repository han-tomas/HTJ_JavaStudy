package practice;

import java.util.Scanner;

/*
 * 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int num = scan.nextInt();
		if(num%3==0) 
		{
			System.out.println(num+"은(는) 3의 배수입니다.");
		}
		else
		{
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");
		}

	}

}
