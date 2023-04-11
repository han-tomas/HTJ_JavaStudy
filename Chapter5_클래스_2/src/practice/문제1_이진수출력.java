package practice;

import java.util.Scanner;

public class 문제1_이진수출력 {
	static void binary(int num)
	{
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
	static void process() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력 : ");
		int input = scan.nextInt();
		binary(input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
