import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		// 1. 배열의 크기를 출력
		System.out.println("배열의 크기 : "+arr.length);
		// 2. 세번째값을 300
		arr[2]=300;
		System.out.println(Arrays.toString(arr));
		// 3. 다섯번째를 출력
		System.out.println("다섯번째 값 : "+arr[4]);

	}

}
