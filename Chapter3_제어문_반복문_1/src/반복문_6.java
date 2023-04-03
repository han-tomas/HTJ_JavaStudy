// updown 게임
/*
 *    컴퓨터 난수 발생 (!~100 사이의 난수)
 *    => 사용자 입력
 *    => 입력시에 힌트 
 *    => for문 횟수?
 *       => 무한 루프 : for(;;) = while(true)
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100)+1;
		int count =0;
		Scanner scan = new Scanner(System.in);
		
		for(;;) // 무한루프는 while문을 주로 사용한다.
		{
			System.out.print("1~100까지 사이의 정수 입력: ");
			int user = scan.nextInt();
			
			if(user>=1 && user<=100)
			{
				count++;
				// 힌트
				if(com>user)
				{
					System.out.printf("입력한 수보다 큰 값을 입력하세요(UP)(%d번째 시도)\n",count);
				}
				else if(com<user)
				{
					System.out.printf("입력한 수보다 작은 값을 입력하세요(DOWN)(%d번째 시도)\n",count);
				}
				else if(com==user)
				{
					System.out.println("Correct!");
					System.out.println("정답은 "+com+" 이였습니다!!");
					System.out.println(count+"번째만에 맞추셨습니다.");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
