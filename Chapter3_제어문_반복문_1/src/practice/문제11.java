package practice;
import java.util.Scanner;
public class 문제11 {
/*
 * 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.printf("1~%d까지의 합 : %d\n",num,sum);

	}

}
