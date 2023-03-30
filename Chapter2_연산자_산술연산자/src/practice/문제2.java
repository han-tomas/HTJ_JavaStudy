package practice;
/*
 *   + (산술,문자열) 계산순서→
 *   / 0으로 나눌 수 없다, 정수/정수=정수
 *   % 결과값의 부호는 왼쪽편을 따라간다.
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b);  //8
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  //4
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  //12
	    System.out.printf("나누기 연산 결과: %d \n", a/b); //3
	    System.out.printf("나머지 연산 결과: %d \n", a%b); //0


	}

}
