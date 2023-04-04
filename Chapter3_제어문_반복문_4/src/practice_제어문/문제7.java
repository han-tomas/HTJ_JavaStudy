package practice_제어문;
import java.util.Scanner;
public class 문제7 {
/*
 *  정수 입력을 받아서 60이상 합격 =>불합격  if~else
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("점수 입력 : ");
			int score = scan.nextInt();
			if(score>100 ||score<0)
			{
				System.out.println("점수를 잘못 입력하셨습니다.");
				continue;
			}
			if(score>=60)
				System.out.println("합격");
			
			else
				System.out.println("불합격");
			
			break;
		}
		

	}

}
