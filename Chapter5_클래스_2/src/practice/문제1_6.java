package practice;

public class 문제1_6 {
 
	// 1. 1~10까지 출력하는 메소드 구현
	static void method1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	// 2. 1~10까지 합을 구하는 메소드 구현
	static int method2()
	{
		int sum =0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	
	// 3. 1~n까지 합을 구하는 메소드 구현
	static int method3(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	
	// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
//	static String method4(int a,int b)
//	{
//		String result ="";
//		if(b==0)
//			result ="0으로 나눌 수 없습니다.";
//		else
//			result = a+"/"+b+"="+a/(double)b;
//		return result;
//	}
	static double method4(int a, int b)
	{
		return a/(double)b;
	}
	
	
	// 5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static String method5(String s)
	{
//		String result ="";
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
//				result += s.charAt(i);
//			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
//				result+=(char)(s.charAt(i)-32);
//			
//		}
//		return result;
		return s.toUpperCase();
	}
	
	
	// 6. 문자열을 거꾸로 출력하는 메소드 구현
	static void method6(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
//		StringBuffer sb = new StringBuffer();
//		sb.append(s);
//		String ss = sb.reverse().toString();
//		System.out.println(ss);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		System.out.println(method2());
		System.out.println(method3(11)); //n
		System.out.println(method4(10,2));
		String s= method5("Hello Java");
		System.out.println(s);
		method6("Hello Java");
	}

}
