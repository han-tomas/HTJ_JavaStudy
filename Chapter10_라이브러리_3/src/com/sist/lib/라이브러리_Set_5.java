package com.sist.lib;
import java.util.*;
public class 라이브러리_Set_5 {

	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0;i<10;i++)
		{
			int r = (int)(Math.random()*100)+1;
			set.add(r);
		}
		// 출력
		System.out.println(set);
		// 50보다 작은 수
		for(Object obj:set)
		{
			int a= (int)obj;
			if(a<50)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println("\n====================");
		// 50보다 큰수
		for(Object obj:set)
		{
			int a= (int)obj;
			if(a>50)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println("\n==================");
		// 1. 정렬
		// 2. 검색이 빠르다.
		TreeSet tset = new TreeSet();
		for(int i=0;i<10;i++)
		{
			int r = (int)(Math.random()*100)+1;
			tset.add(r);
		}
		System.out.println(tset);
		System.out.println("50보다 작은 수 : "+tset.headSet(50));
		System.out.println("50보다 큰 수 : "+tset.tailSet(50));

	}

}
