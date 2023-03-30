package practice;
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int a = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = scan.nextInt();
		
		System.out.println("두 정수의 뺄셈 : "+(a-b));
		System.out.println("두 정수의 곱셈 : "+(a*b));

	}

}
