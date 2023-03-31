// 한개의 점수를 받아서 60이상이면 합격 아니면 불합
import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		// 입력 => 저장
		int num = scan.nextInt();
		
		// 요청 => 처리
		if(num<=100 && num>=0) 
		{
			if(num>=60) 
			{
				System.out.println(num+"점으로 합격입니다.");
			}
			else
			{
				System.out.println(num+"점으로 불합격입니다.");
			}
		}
		else
		{
			System.out.println("점수를 잘못 입력하였습니다.");
		}
		
		
		

	}

}
