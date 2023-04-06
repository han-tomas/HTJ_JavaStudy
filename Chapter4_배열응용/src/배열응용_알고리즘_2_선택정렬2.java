import java.util.Arrays;

// 선택정렬 => 문자
/*
 *    B C A E D => ASC(ABCDE)/ DESC(EDCBA)
 *    i=0
 *    - -
 *    B C
 *    -   -
 *    A   B
 *    -     -
 *    A     E
 *    -       -
 *    A       D -------1round
 *    ----------
 *    A C B E D
 *      i=1
 *      - - 
 *      B C
 *      -   -  
 *      B   E  
 *      -     -
 *      B     D -------2round
 *    -----------
 *    A B C E D
 *        i=2
 *        - -
 *        C E
 *        -   -
 *        C   D -------3round
 *    -----------
 *    A B C E D      
 *          i=3
 *          - -
 *          D E -------4round (종료)
 *    -----------
 *    A B C D E              
 *            i=4
 *            - (수행하지 않는다.)
 */
public class 배열응용_알고리즘_2_선택정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
//			for(int j=0;j<i;j++) // 중복 없애기
//			{
//				if(arr[i]==arr[j])
//				{
//					i--;
//					break;
//				}
//			}
		}
		System.out.println("============ 정렬 전 ============");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("======== 정렬 후  (ASC) ========");
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("======== 정렬 후 (DESC) ========");
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
