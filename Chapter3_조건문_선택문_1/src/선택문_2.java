// 성적 계산
/*
 *  case 3 : case 4 : case 5: ==> if (month>=3 && month<=5)
 *      System.out.println("봄")
 *      break;
 */
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 정수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor+eng+math)/3;
		
		//case는 중복 할 수 없다.
		//학점 출력
		char score ='A';
		switch(avg/10)
		{
		case 10: //100   
//			score = 'A';
//			break;
			
		case 9: // 99~90
			score ='A';
			break;      
			// ==> 100~90
			
		case 8: // 89~80
			score ='B';
			break;
			
		case 7: // 79~70
			score ='C';
			break;
			
		case 6: // 69~60
			score ='D';
			break;
			
		default:
		    score='F';
			
		}
		System.out.println("학점 : "+score);

	}

}
