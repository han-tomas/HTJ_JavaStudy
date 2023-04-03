package practice;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				sum+=i;
			else
				sum-=i;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10까지의 합: "+sum);

	}

}
