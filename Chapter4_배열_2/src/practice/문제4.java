package practice;

import java.util.Arrays;

public class 문제4 {
/*
 *  배열을 선언하고 생성하는 다음 물음에 답하라.
 */
	public static void main(String[] args) {
		
		// 1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
		char[] c = new char[10];
		
		// 2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라
		int[] n = {0,1,2,3,4,5};
		
		// 3) '일', '월', '화', '수', '목', '금','토'로 초기화된 배열 day를 선언하라.
		char[] day = {'일', '월', '화', '수', '목', '금','토'};
		
		// 4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
		boolean[] bool = new boolean[4];
		bool[0]=true;
		bool[3]=true;
		System.out.println(Arrays.toString(bool));
				

	}

}
