import java.util.Arrays;
import java.util.Scanner;
public class 메소드조립법_3_숫자야구 {
/*
 *    1. 난수발생
 *    2. 사용자입력
 *    ----------
 *    3. 비교
 *    4. 힌트
 *    ----------
 *    5. 종료여부
 */

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못 입력하였습니다. 세자리 정수를 입력하세요.");
				continue;
			}
			else
			{
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				
				if(user[0]==0 || user[1]==0 || user[2]==0 )
				{
					System.out.println("0을 포함할 수 없습니다.");
					continue;
				}
				if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2] )
				{
					System.out.println("중복된 수를 포함하고있습니다.");
					continue;
				}
				// 비교
				int s=0; 
				int b=0;
				for(int i=0;i<com.length;i++)
				{
					for(int j=0;j<user.length;j++)
					{
						if(com[i]==user[j])
						{
							if(i==j)
								s++;
							else
								b++;
						}
					}
				}
				// 힌트
//				System.out.printf("Input :%d  Result: %dS-%dB\n",input,s,b);
				System.out.println("===============");
				System.out.print("s: ");
			    for(int i=0; i<s;i++)
					System.out.print("●");
			    System.out.print("\nb: ");
			    for(int i=0; i<b;i++)
			    	System.out.print("◎");
			    System.out.println();
			    System.out.println("===============");
			    if(s==3)
			    break;
			    
			}
		}
		System.out.println("   Victory!!    ");
	

	}

}
