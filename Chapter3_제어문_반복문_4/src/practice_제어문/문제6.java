package practice_제어문;

public class 문제6 {
/*
 *  10~99까지 정수중에 같은 자리의 정수를 출력하시오
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<=99;i++)
		{
//			int a=i/10;
//			int b=i%10;
//			if(a==b)
//				System.out.print(i+" ");
			if(i%11==0)
				System.out.print(i+" ");
		}

	}

}
