// 1~100까지의 합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1; i<=100; i++)
		{
			sum=sum+i; //sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		System.out.println("======최종결과값======");
		System.out.println("1~100까지의 합 : "+sum);
		
		//짝수 합 구하기
		int even = 0;
		for(int i=2;i<=100;i+=2) // 2,4,6,8...
		{
			even += i;
			
		}
		System.out.println("짝수 합 : "+even);
		
		//홀수 합 구하기
		int odd = 0;
		for(int i=1;i<=100;i+=2) //1,3,5,7...
		{
			odd += i;
			
		}
		System.out.println("홀수 합 : "+even);

	}

}
