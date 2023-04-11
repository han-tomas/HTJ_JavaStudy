// 달력
// 1. 년도, 월

import java.util.Scanner;
public class 메소드조립법_2_달력 {
    //입력
	static int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+" 입력 : ");
		return scan.nextInt();
	}
	
	
	static void process()
	{
		int year = input("년도");
		int month = input("월");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.printf("                  %d년도 %d월  달력입니다                    \n",year,month);
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		int week = getWeek(year,month);
//		System.out.println("week= "+week);
		print(month,week);
	}
	// 처리 (요일 구하기)
	static int getWeek(int year,int month)
	{
		// 전년도까지의 총 날수
		int total =0;
		total = (year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
				
		// 전달까지의 총 날수
		int [] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastDay[1]=29;
		}
					
		else
		{
			lastDay[1]=28;
		}
					
				
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
				
		// +1 ==>매월 1일자
		total++;
//		---------------------------------- %7 => 요일
				
		// 요일 구하기
		int week = total%7;
		return week;
	}
	
	
	static void print(int month,int week)
	{
		int [] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print("|"+strWeek[i]+"\t");
		}
		System.out.println("\n--------------------------------------------------------");
		for(int i=1; i<=lastDay[month-1];i++)
		{
			if(i==1) // 맨처음 1번
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
				
			}
			System.out.printf("|%2d\t",i);
			week++;// 요일 계산
			if(week>6)//6=토 , 0=일
			{
				week=0;
				System.out.println("\n--------------------------------------------------------");
			}
				
		}
	}
	public static void main(String[] args) {
		process();
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
//		--------------------------------- 사용자 입력 ==> 메소드
		
		// 전년도까지의 총 날수
		int total =0;
		total = (year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		// 전달까지의 총 날수
		int [] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastDay[1]=29;
		}
			
		else
		{
			lastDay[1]=28;
		}
			
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		// +1 ==>매월 1일자
		total++;
//		---------------------------------- %7 => 요일
		
		// 요일 구하기
		int week = total%7; //0~6
		
//		---------------------------------------------------------- 처리과정
		
		// 달력 출력
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.printf("■■■■■■■■■■■■■■■ %d년도 %d월 달력입니다. ■■■■■■■■■■■■■■■ \n",year,month);
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1; i<=lastDay[month-1];i++)
		{
			if(i==1) // 맨처음 1번
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
				
			}
			System.out.printf("%2d\t",i);
			week++;// 요일 계산
			if(week>6)//6=토 , 0=일
			{
				week=0;
				System.out.println("\n");
			}
				
		}*/

	}

}
