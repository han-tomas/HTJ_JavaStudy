// 임의의 정수 10개를 받아서 최댓값/ 최솟값 구하기
import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//초기화
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//1.일반 for
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr)); // 배열을 문자열로 출력 []
		
		//2. for-each => 배열, 컬렉션 => 데이터를 여러개 모아서 관리할때 사용
		/*
		 *    for(int a:arr)  
		 *        -----실제데이터
		 *    ==> 출력용으로 사용 => 웹(브라우저)
		 *    ==> Vue,React      
		 */
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		// 최댓값, 최솟값
		int max = arr[0];
		int min = arr[0];
		
		for(int a:arr)
		{
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}
