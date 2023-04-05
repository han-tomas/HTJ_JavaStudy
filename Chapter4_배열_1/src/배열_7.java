import java.util.Arrays;

public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,'A','B',100,15}; //10.5=> double => int형보다 크기가 큰 double 형은 들어올 수 없다.
		System.out.println(arr1);// 주소값 출력 => I@주소값
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2={10,'A','B',100,15.7}; // double형으로 자동 형변환
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = { 'A',66,'C',78,97}; // int를 포함할 수 있다.=> char형으로 바뀌어서 출력된다.
		System.out.println(Arrays.toString(arr3));
		
		boolean[] arr4= new boolean[5]; // boolean은 false로 초기화
		System.out.println(Arrays.toString(arr4));
		
		byte[] arr5 = new byte[5]; //byte는 0으로 초기화
		System.out.println(Arrays.toString(arr5));
		
		//  int[] arr; ==> null (주소가 없는 경우)

	}

}
