package practice;
import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 :");
		int a = scan.nextInt();
		System.out.println("a : "+a);
		
		System.out.print("두번째 숫자 입력 :");
		int b = scan.nextInt();
		System.out.println("b : "+b);
		
		System.out.print("세번째 숫자 입력 :");
		int c = scan.nextInt();
		System.out.println("c : "+c);
		
		System.out.println("a * b + c = "+(a*b+c));


	}

}
