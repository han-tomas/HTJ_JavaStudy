// do~while => 후조건 ==> 무조건 1번 수행 가능하다.
/*
 *    1. 초기화
 *    2. 게임
 *    3. 형식)
 *            초기값 (1)
 *            do
 *            {
 *               반복 실행문장 (2)
 *               증가식(3)
 *            }while(조건식); => 증가된 변수로 조건 검색
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
			
		}while(i<=10);
		System.out.println("\n=================================");
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int time =1;
		int dan = scan.nextInt();
		do
		{
			System.out.printf("%2d X %-2d = %02d\n",dan,time,dan*time);
			time ++;
		}while(time<=9);
		
		System.out.println("============ for ================");
		for(i=10;i<10;i++)
		{
			System.out.println("i="+i);
		}
		
		System.out.println("=========== while ===============");
		i=10;
		while(i<10)
		{
			System.out.println("i="+i);
			i++;
		}
		
		System.out.println("========= do~while ==============");
		i=10;
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<10);
		

	}

}
