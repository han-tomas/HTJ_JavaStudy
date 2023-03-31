// 중첩 조건문 => 3개의 정수를 받아서 총점 / 평군 / 학점 (A+,A0,A-)
// 97 A+ / 94 A0 / ~ A-
import java.util.Scanner;
public class 조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math, total;
		double avg;
		char score=' ', option=' ';
		
		//사용자의 입력값을 받는다
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 (국 영 수) : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		System.out.println("========================");
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		int temp = (int) avg;
		
		option ='-'; //default값 만들기
		if(temp>=90 && temp <=100) 
		{
			score = 'A';
			if(temp >= 97 && temp <=100)
				option='+';
			if(temp >= 94 && temp <97)
				option='0';
//			if(temp <94)
//				option='-'; ==>default값 이 있어서 표현하지 않아도 된다.
		}
		if(temp>=80 && temp <90) 
		{
			score = 'B';
			if(temp >= 87 && temp <90)
				option='+';
			if(temp >= 84 && temp <87)
				option='0';
		}
		if(temp>=70 && temp <80) 
		{
			score = 'C';
			if(temp >= 77 && temp <80)
				option='+';
			if(temp >= 74 && temp <77)
				option='0';
		}
		if(temp>=60 && temp <70) 
		{
			score = 'D';
			if(temp >= 67 && temp <70)
				option='+';
			if(temp >= 64 && temp <67)
				option='0';
		}
		if(temp<60) 
		{
			score = 'F';
			option = ' ';
		}
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n ",avg);
		System.out.println("학점 : "+score+option);
		

	}

}
