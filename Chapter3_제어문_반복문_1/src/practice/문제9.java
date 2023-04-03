package practice;

public class 문제9 {
/*
 *  5,10,15,20,25,30,35,40,45,50을 
 *  출력하는 프로그램을 만들어라 (for 사용)
 *  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 방법 1
		for(int i = 5;i<50;i+=5)
		{
			System.out.print(i+",");
		}
		System.out.println("50");
		// 방법 2
		for (int i = 5;i<50;i++)
		{
			if(i%5==0)
				System.out.print(i+",");
		}
		System.out.println("50");

	}

}
