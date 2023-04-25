package com.sist.lib;
class Card{
	private int number;
	private String type;
	public Card()
	{
		number=7;
		type="♥";
	}
	public void print() 
	{
		System.out.println("번호 : "+number+", Type : "+type);
	}
}
public class 라이브러리_Object_4_1 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.print();
		System.out.println("====================");
		
		try
		{
			//메모리 할당하는 다른 방법
			Class clsName= Class.forName("com.sist.lib.Card");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			//객체 생성
			((Card)obj).print();
		}catch(Exception ex) {}
	}

}
