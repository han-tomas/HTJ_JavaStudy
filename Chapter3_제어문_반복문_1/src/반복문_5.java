// 사용자의 입력을 받아서 (구구단) => 3
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하시오 : ");
		int dan = scan.nextInt();
		System.out.printf("=======%d단=======\n",dan);
		for(int i=1;i<=9;i++) 
		{
			System.out.printf("%d X %d =%d\n",dan,i,dan*i);
		}

	}

}
