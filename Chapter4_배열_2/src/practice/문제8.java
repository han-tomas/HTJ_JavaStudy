package practice;
import java.util.Arrays;
import java.util.Scanner;
public class 문제8 {
/*
 * 
 */
	public static void main(String[] args) {

		// 5개의 정수를 입력받은 후 차례로 출력하는 프로그램
		Scanner scan =new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("5개의 정수를 입력하시오 : ");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= scan.nextInt();
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		// 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아
		// 입력받은 문자를 이어서 출력하는 프로그램
		char[] arrch = {'A','B','C','D','E','F','G','H','I','J'};
		for(char c :arrch)
		{
			System.out.print(c);
		}
		
		System.out.println();
		/*
		 *  정수 10개를 입력받은 후 세번째, 다섯번째와 마지막으로 입력받은
		 *  정수를 차례로 출력하는 프로그램
		 */
		int[] arr1 = new int[10];
		System.out.print("10개의 정수를 입력하시오 : ");
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]= scan.nextInt();
		}
		System.out.printf("%d %d %d\n",arr1[2],arr1[4],arr1[arr1.length-1]);
		
	
		/*
		 * 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		 */
		int[] arr2 = new int[10];
		System.out.print("10개의 정수를 입력하시오 : ");
		for(int i =0;i<arr2.length;i++)
		{
			arr2[i]= scan.nextInt();
		}
		int max = arr2[0];
//		for(int i =0;i<arr2.length;i++)
//		{
//			if(max<arr2[i])
//				max=arr2[i];
//		}
		for(int i:arr2)
		{
			if(max<i)
				max=i;
		}
		System.out.println("가장 큰 값 : "+max);
	}

}
