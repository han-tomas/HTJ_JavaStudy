package com.sist.lang;
//delete, insert

public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동입니다");
		sb.delete(3, 6); //delete(int s, int e) => e-1이 되기 때문에 1더 추가할 것.
		System.out.println(sb.toString());
		sb.insert(3, "입니다");
		System.out.println(sb.toString());
		System.out.println(sb.substring(3));//delete와 insert는 StringBuffer를 리턴 => 자체 변경
		                                    //substring은 String을 리턴하기때문에 자체변경이 아니라 새로운 메모리에 저장 => 원본에 변경이 없다.
		                                    /*
		                                     * String s = sb.substring(3);
		                                     * System.out.println(s.toString);
		                                     */
		

	}

}
