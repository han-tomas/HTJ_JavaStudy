package practice;
/*
 * 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//임의의 문자 추출
		int num = (int)(Math.random()*2); // 0 ,1
		char ch;
		if(num==0)
			ch=(char)((Math.random()*26)+65); // 대문자
		else
			ch=(char)((Math.random()*26)+97); // 소문자
		System.out.println(ch);
		
		
		//임의로 추출된 문자의 대소문자 판단
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch+"은(는) 대문자입니다.");
		else
			System.out.println(ch+"은(는) 소문자입니다.");
	}

}
