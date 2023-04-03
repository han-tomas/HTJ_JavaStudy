package practice;

public class 문제10 {
/*
 *  B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    char ch = ' ';
		for(int i = 65;i<=78;i++)
		{
			if(i%2==0)
			{
				ch =(char)(i);
				System.out.print(ch+"       ");
			}
				
			   
		}
		
		System.out.println();
		
		// 강사님 풀이
		for(char c ='B';c<='N';c+=2)
		{
			System.out.print(c+"\t");// \t는 일정간격 뛰기
		}

	}

}
