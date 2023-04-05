package practice;
import java.util.Arrays;
import java.util.Scanner;
public class 문제6 {
/*
 *  양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 
 *  출력하는 프로그램을 작성하라
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 출력 (3의 배수)
		for(int i : arr)
		{
			if(i%3==0)
				System.out.print(i+" ");
		}
//		int count =0;
//		while(true)
//		{
//			System.out.print("양의 정수 10개를 입력하시오 : ");
//			int num = scan.nextInt();
//			if(num<=0)
//			{
//				System.out.println("양의 정수가 아닙니다.");
//				System.out.println("다시 입력하십시오.");
//				continue;
//			}
//			else
//			{
//				arr[count]=num;
//				
//				if(arr[count]%3==0) // 3의 배수만 출력하고 나머지는 0으로 바꾸기
//				{
//					arr[count]=num;
//				}
//				else
//				{
//					arr[count]=0;
//				}
//					
//				count++;
//				if(count==10)
//					break;
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		

	}

}
