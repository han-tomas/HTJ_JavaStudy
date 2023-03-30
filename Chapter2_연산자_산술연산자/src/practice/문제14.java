package practice;
/*
 * 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
 * (랜덤으로 해보자)
 */
import java.util.Scanner;
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 숫자 입력 : ");
//		int a = scan.nextInt();
//		System.out.print("두번째 숫자 입력 : ");
//		int b = scan.nextInt();
//		
//		System.out.println("첫번째 수를 둘째 수로 나눈 나머지 : "+(a%b));
		int a,b;
		a=(int)(Math.random()*100)+1;
		b=(int)(Math.random()*100)+1;
		System.out.printf("a=%d,b=%d,a%%b=%d",a,b,a%b); //연산자 %를 출력하기위해 %%

	}

}
