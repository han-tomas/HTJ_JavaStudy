package com.sist.util;

import java.util.ArrayList;
/*
 *    subList(int start, int end) => index번호가 start부터 end-1까지 부분적으로 데이터 복사
 *    
 *    ==> 페이지 나누기
 *    addAll() => ArrayList가 가지고 있는 모든 데이터 복사
 *    retainAll() => 두개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 *    Collections.sort() => ArrayList 정렬
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		for(Object i:names1)
		{
			System.out.println(i);
		}
		
		
		ArrayList names2 = new ArrayList();
		names2.add("홍길순");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		
		System.out.println("=====================");
		
		// 교집합 => reatinAll
		ArrayList temp = new ArrayList();
		temp.addAll(names1); // names1의 데이터 전체를 temp에 복사
		temp.retainAll(names2); // 복사된 names1(temp) 과 names2의 데이터에 같은 값을 찾아라
		// 찾은 데이터(교집합)를 temp에 저장
		for(Object i:names1)
		{
			System.out.println(i);
		}
		System.out.println("=====================");
		for(Object i:temp)
		{
			System.out.println(i);
		}
		
		
		

	}

}
