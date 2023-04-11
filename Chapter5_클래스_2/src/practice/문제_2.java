package practice;

import java.util.Arrays;

public class 문제_2 {

	static void process()
	{
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전:\n"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		System.out.println("오름차순 정렬:");		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		System.out.println("내림차순 정렬:");
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
