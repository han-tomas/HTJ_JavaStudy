package practice;
import java.util.Scanner;
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int a = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = scan.nextInt();
		
		System.out.println("첫번째 수를 둘째 수로 나눈 나머지 : "+(a%b));

	}

}
