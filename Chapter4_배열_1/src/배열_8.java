import java.util.Arrays;

/*
 *    int a=10;
 *    int b=a;
 */
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50};
//		int[] arr2=arr1; // 별칭 (참조데이터) => arr1과 arr2 주소값이 같다. => arr1과 arr2이 같은 메모리를 제어 ==> arr2값을 바꾸면 arr1도 바뀜.
		int[] arr2=arr1.clone(); //새로운 메모리 공간 생성 + 복제
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("========= 배열값 변경 =========");
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1)); 
		
		System.out.println(arr1);
		System.out.println(arr2); 
		
		int[] arr3=new int[10]; // 복제할 배열보다 크기가 크거나 같아야한다. 작으면 X(오류)
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}// 복제
		System.out.println(Arrays.toString(arr3)); //[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]

	}

}
