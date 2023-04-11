package practice;

import java.util.Scanner;

public class 문제3_윤년 {
	static String yearCheck(int year)
	{
		String result="";
		if((year%4==0 && year%100!=0)||(year%400==0))
			result= year+"는(은) 윤년입니다.";		
		else
			result= year+"는(은) 윤년이 아닙니다.";
		return result;
	}
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int input = scan.nextInt();
		
		String s = yearCheck(input);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
