package practice;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"  ");
			}
			if(i%6==0)
			{
				System.out.println();
			}
		}
		System.out.println("===================");
		// 강사님 풀이
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%2d\t",i);
				if(i%3==0)
					System.out.println();
			}
			
		}

	}

}
