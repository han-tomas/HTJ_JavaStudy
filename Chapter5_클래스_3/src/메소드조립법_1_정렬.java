import java.util.Arrays;

// 1. 달력 만들기
/*
 *    기능
 *     1. 년도 / 월 입력
 *     2. 1일자의 요일 ==> 세분화
 *     3. 달력 출력
 *     ---------------
 *     ===> 재사용할 수 있는 메소드 (윤년)
 *     
 */

// 2. 숫자 야구 게임
/*
 *    기능
 *     1. 난수 발생
 *     2. 사용자 입력
 *     3. 비교
 *     4. 힌트
 *     5. 종료여부 확인
 */


/*
 *     40 30 10 50 20
 *     i  j
 *     -- --
 *     30 40
 *     --    --
 *     10    30
 *     --       --
 *     10       50
 *     --          --
 *     10          20
 *     ---------------- for 1
 *     10 40 30 50 20
 *        i  j
 *        -- --
 *        30 40
 *        --    --
 *        30    50
 *        --       --
 *        20       30
 *    ----------------- for 2
 *     10 20 40 50 30
 *           i  j
 *           -- --
 *           40 50
 *           --    --
 *           30    40
 *    ----------------- for 3
 *     10 20 30 50 40
 *              i  j
 *              -- --
 *              40 50
 *    ----------------- for 4                     
 */
public class 메소드조립법_1_정렬 {
    static void sort(int[] arr,int n) // n=1 ASC , n=2 DESC
    {
    	 
    	for(int i=0; i<arr.length-1;i++)
       	{
       		for(int j=i+1;j<arr.length;j++)
       		{
       			boolean bCheck=false;
       			if(n==1)
       				bCheck=arr[i]>arr[j];
       			else
       				bCheck=arr[i]<arr[j];
       			
       			if(bCheck)
       			{
       				int temp = arr[i]; 
       				arr[i]=arr[j];
       				arr[j]=temp;
       			}
       		}
       	}
    	   	    	
    }
   
    static void rand(int[] arr)
    {
    	for(int i =0; i<arr.length;i++) 
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬전: "+Arrays.toString(arr));
		sort(arr,1);
		System.out.println("정렬후 (ASC): "+Arrays.toString(arr));
		sort(arr,2);
		System.out.println("정렬후 (DESC): "+Arrays.toString(arr));
		
	}

}
