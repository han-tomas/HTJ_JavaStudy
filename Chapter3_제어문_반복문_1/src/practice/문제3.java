package practice;

import java.util.Scanner;

public class 문제3 {
/*
 * Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		if(num==0)
		{
			System.out.println("a=0");
		}else
		{
			if(num>0)
				System.out.println("a="+num);
			else
				System.out.println("a="+(-num));
		}
//		System.out.println(Math.abs(num)); ==> 절대값 출력

	}

}
