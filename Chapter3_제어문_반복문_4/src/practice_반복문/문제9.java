package practice_반복문;

public class 문제9 {
/*
 *  0~12까지 2의 배수, 3의 배수의 합을 구하여라.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
			{
				sum1+=i;
			}
			if(i%3==0)
			{
				sum2+=i;
			}
		}
		System.out.println("2의 배수의 합 : "+sum1);
		System.out.println("3의 배수의 합 : "+sum2);
		System.out.println("2의 배수와 3의 배수의 합 : "+(sum1+sum2) );

	}

}
