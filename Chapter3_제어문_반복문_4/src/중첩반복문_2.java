/*        
 *      ===> 정렬
 *      ===> 빈도구하기
 *      ===> 등수구하기
 *      ===> 마름모 / 나비 / 모래시계
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
/*
 *     ★
 *     ★★
 *     ★★★
 *     ★★★★
 *     
 *       i    j
 *      줄수   별표
 *       1    1
 *       2    2
 *       3    3  
 *       4    4    ==> i=j ==> j<=i
 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *     ★★★★
 *     ★★★
 *     ★★
 *     ★
 *     
 *      i    j   ==> i+j=5 ===> j=5-i
 *     줄수   별표
 *      1    4
 *      2    3 
 *      3    2
 *      4    1   ==> 역순이면 + 		
 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *      A
 *      BC
 *      DEF
 *      GHIJ 		
 */
		char c ='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *      A
 *      AB
 *      ABC
 *      ABCD		
 */
		for(int i=1;i<=4;i++)
		{
			char ch ='A';
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch++);
			}
			System.out.println();
		}
		
		System.out.println("=====");
		
/*
 *      #234
 *      1#34
 *      12#4
 *      123# 		
 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				   System.out.print('#');
				else
				   System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *      #234
 *      1#34
 *      12#4
 *      123# 	 		
 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
				   System.out.print('#');
				   continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *         ★
 *        ★★
 *       ★★★
 *      ★★★★
 *      ---------------
 *         i   k   j      i/k      i/j
 *        줄수 공백  별표     k=4-i    i=j
 *         1   3   1
 *         2   2   2
 *         3   1   3 
 *         4   0   4 		
 */
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("=====");
		
/*
 *      ★★★★
 *       ★★★
 *        ★★
 *         ★
 *      ---------------
 *         i   k   j      i/k      i/j
 *        줄수 공백  별표     k=i-1    j=5-i
 *         1   0   4
 *         2   1   3
 *         3   2   2 
 *         4   3   1  
 */
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("=====");
/*
 *         ★
 *        ★★★
 *       ★★★★★
 *      ★★★★★★★ 
 */
		
		
		
	}

}
