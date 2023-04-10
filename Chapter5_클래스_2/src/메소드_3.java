// char를 한개 보내서 => 대문자, 소문자, 아닌경우 => 경우의 수 3개 ==> String
import java.util.Scanner;
public class 메소드_3 {
	static String isAlpha(char c)
	{
		String result="";
		if(c>='A'&&c<='Z')
			result="대문자";
		else if(c>='a'&&c<='z')
			result ="소문자";
		else
			result="알파벳이 아닙니다.";
		
		return result;
	}
	static void process() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String s = scan.next();
		char c= s.charAt(0); // 문자한개를 읽어와서 char로 전환
		/*
		 *  String s ="Hello"
		 *             01234
		 *             => charAt(0) ==> H
		 */
		String b = isAlpha(c); // String b ="대문자" or String b ="소문자" String b ="알파벳이 아닙니다."
		System.out.println(c+"는(은)"+b);
		// 가급적이면 결과값이 여러개인 경우 => 문자열
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
	}

}
