package practice_반복문;

public class 문제5 {
/*
 * 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
 *  출력하는 프로그램을 작성하시오
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
		{
			for(int j=1; j<=6;j++)
			{
				int sum = i+j;
				if(sum==6)
					System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}

	}

}
