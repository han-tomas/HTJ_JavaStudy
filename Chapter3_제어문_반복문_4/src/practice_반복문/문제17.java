package practice_반복문;

public class 문제17 {
/*
 * A A A A A  
 * B B B B B   
 * C C C C C
 * D D D D D
 * E E E E E             
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i =1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(c +" ");
			}
			System.out.println();
			c++;
		}

	}

}
