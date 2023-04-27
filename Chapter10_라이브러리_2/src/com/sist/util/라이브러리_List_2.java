package com.sist.util;

import java.util.ArrayList;
import java.util.Collections;

// List 메소드
/*
 *    add, remove,set,size,clear
 *    -------------------------- 기본 메소드
 *    containsAll() => 두개의 list에서 중복된 데이터를 모아서 관리
 *       =>JOIN
 *    retainAll() => 두개의 list에서 중복된 데이터만 남기기
 *    addAll => 데이터 전체 복사
 *    subList => 부분적 데이터를 복사할 경우데 사용
 */
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(8);
		
		// 출력
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("=============");
		
		// 일부만 추가 sublist(stard,end)
		ArrayList list2 = new ArrayList(list.subList(1, 4)); // end-1 => index 1,index 2,index 3
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		for(Object i:list2)
		{
			System.out.println(i);
		}
		System.out.println("=============");
		
		//sort
		Collections.sort(list);
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("=============");
		
		// 같은 데이터 추출
		System.out.println(list.containsAll(list2));// 포함관계인가? false
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("=============");
		// 중복된 데이터만 추출 =>INSERSECT => 교집합
		System.out.println(list.retainAll(list2));
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		
		// 전체 복사
		System.out.println("=============");
		ArrayList list3 = new ArrayList<>();
		list3.addAll(list);
		for(Object i:list3)
		{
			System.out.println(i);
		}

	}

}
