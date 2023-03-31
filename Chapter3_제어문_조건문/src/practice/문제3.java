package practice;
/*
 * 1학년부터 4학년까지 중간고사 시험을 보았다. 
 * 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
 * 이를 판단하는 프로그램을 작성해보자.
 * 점수가 0미만 100초과이면 경고문구 출력!
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학년 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("학년 입력 : ");
		int grade = scan.nextInt();
		//점수 입력
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		// 합격 불합격 여부
//		if((score<=100 && score>=0) && (grade <=4 && grade >=1))
//		{
//			if(grade==4 && score>=70)
//			{
//				System.out.println("합격입니다.");
//			}
//			else if(grade <4 && score>=60) 
//			{
//				System.out.println("합격입니다.");
//			}
//			else
//			{
//				System.out.println("불합격입니다.");
//			}	
//		}
//		else
//		{
//			System.out.println("정보를 잘못 입력하였습니다.");
//		}
		if( score> 100 || score < 0)
		{
			System.out.println("정보를 잘못 입력하였습니다");
		}
		else
		{
			if(grade>4 || grade <1)
			{
				System.out.println("정보를 잘못 입력하였습니다");
			}
			else 
			{
				if(grade==4)
				{
					if(score>=70)
					{
						System.out.println("합격");
					}
					else
					{
						System.out.println("불합격");
					}
				}
				else
				{
					if(score>=60)
					{
						System.out.println("합격");
					}
					else
					{
						System.out.println("불합격");
					}
				}
			}
		}

	}

}
