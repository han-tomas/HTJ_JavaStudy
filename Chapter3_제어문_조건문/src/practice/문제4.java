package practice;
/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
 * 합계와 평균을 구해보자.
 */
//import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.print("세 개의 정수를 입력 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
		
		//랜덤입력
		int num1= (int)(Math.random()*100)+1;
		int num2= (int)(Math.random()*100)+1;
		int num3= (int)(Math.random()*100)+1;
		System.out.printf("num1 : %d / num2 : %d / num3 : %d \n",num1,num2,num3);
		int Max = 0;
		int Min = 0;
		int total = num1+num2+num3;
		double avg = total/3.0;
		//최대값 구하기
//		if(num1> num2 && num1> num3) 
//		{
//			Max=num1;
//		}
//		if(num2> num1 && num2> num3) 
//		{
//			Max=num2;
//		}
//		if(num3> num2 && num3> num1) 
//		{
//			Max=num3;
//		}
		Max = num1;
		if(Max<num2)
			Max = num2;
		if(Max<num3)
			Max = num3;
		
		//최소값 구하기
//		if(num1< num2 && num1< num3) 
//		{
//			Min=num1;
//		}
//		if(num2< num1 && num2< num3) 
//		{
//			Min=num2;
//		}
//		if(num3< num2 && num3< num1) 
//		{
//			Min=num3;
//		}
		Min = num1;
		if(Min>num2)
			Min = num2;
		if(Min>num3)
			Min = num3;
		
		//결과 출력
		System.out.println("==============================");
		
		System.out.println("최대값 : "+Max);
		System.out.println("최소값 : "+Min);
		
		System.out.println("==============================");
		
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f \n",avg);


	}

}
