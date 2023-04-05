import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 1, arr2, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr2)); // [20, 30, 40, 50, 0, 0, 0, 0, 0, 0]
		

	}

}
