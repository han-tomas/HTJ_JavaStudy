// 성적계산 ==> A+(97이상) , A0 , A-
import java.util.Scanner;
public class 다중조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 정수 입력 :");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int avg=(kor+eng+math)/3; //학점 계산용
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 :%.2f\n ",(kor+eng+math)/3.0);
		
		//학점=> 학점, 옵션 (+,0,-)
		char grade = 'F';
		char option = '+';
		
		if(avg >= 90)
		{
			grade = 'A';
			if(avg>=97)
				option='+';
			else if(avg>=94)
				option = '0';
			else
				option = '-';
		}
		else if(avg >= 80)
		{
			grade = 'B';
			if(avg>=87)
				option='+';
			else if(avg>=84)
				option = '0';
			else
				option = '-';
		}
		else if(avg >= 70)
		{
			grade = 'C';
			if(avg>=77)
				option='+';
			else if(avg>=74)
				option = '0';
			else
				option = '-';
		}
		else if(avg >= 60)
		{
			grade = 'D';
			if(avg>=67)
				option='+';
			else if(avg>=64)
				option = '0';
			else
				option = '-';
		}
		else
		{
			grade = 'F';
			option = ' ';
					
		}
		System.out.println("학점 : "+grade+option);
		

	}

}
