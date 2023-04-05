package practice;

public class 문제2 {
/*
 *    1에서 50까지의 합을 더하는 while문이다. 빈칸에 적절한 코드를 삽입하라.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i=1;
		while(true)
		{
			if(i>50)
			break;
			sum+=i;
			i++;
		}
		System.out.println(sum);
		i=0;
		for(i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				//i=1 j=1,2,3
				//i=2 j=1,2,3
				//i=3 j=1,2,3
				if(j==2)
					continue;//2차 for문만 제어
				System.out.print("   i= "+i+", j= "+j);
			}
			System.out.println();
		}

	}

}
