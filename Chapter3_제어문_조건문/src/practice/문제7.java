package practice;
/*
 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성 
 * ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 나머지는 F)
 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 과목 점수 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		// 총점 과 평균
		int total = kor + eng + math;
		double avg = total/3.0;
		
		int score = (int)avg;
		char temp = ' ';
		
		if(score > 100 || score <0)
		{
			System.out.println("점수를 잘못 입력하였습니다.");
		}
		else
		{
			if(score>=90)
			{
				temp = 'A';
			}
			if(score<90 && score>=80)
			{
				temp = 'B';
			}
			if(score<80 && score>=70)
			{
				temp = 'C';
			}
			if(score<70 && score>=60)
			{
				temp = 'D';
			}
			if(score<60)
			{
				temp = 'F';
			}
			System.out.println("학점 : "+temp);
			
		}
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f \n",avg);
		
		

	}

}
