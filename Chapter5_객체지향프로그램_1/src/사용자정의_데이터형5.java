import java.util.Scanner;
class Sawon{
//	--------------------------
	int sabun;
	String name;
	String dept; // 부서
	String job; // 직위
	String loc; // 근무지
	long pay; // 연봉
//	--------------------------인스턴스 변수
	static String company;
//	------ 메모리 공간이 1개만 설정 => 컴파일러에 의해 자동 생성
//	       new없이 사용이 가능
}
public class 사용자정의_데이터형5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong = new Sawon(); // 인스턴수 변수
		hong.sabun=1;
		hong.name="홍길동";
		hong.dept="개발부";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500L;
		hong.company="ABC";
		Sawon shim = new Sawon();
		shim.sabun=2;
		shim.name="심청이";
		shim.dept="개발부";
		shim.job="사원";
		shim.loc="서울";
		shim.pay=3300L;
		shim.company="ABC";
		Sawon park = new Sawon();
		park.sabun=3;
		park.name="박문수";
		park.dept="개발부";
		park.job="과장";
		park.loc="서울";
		park.pay=6200L;
		park.company="ABC";
		
		
		Sawon.company="KKK"; //static 변수는 new없이 사용이 가능
		                     /*
		                      * 클래스변수명.변수명 ==> hong.company
		                      * 클래스명.변수명 ==> Sawon.company
		                      * 공유변수, 클래스변수(클래스명으로 접근이 가능)
		                      * 
		                      */
		
		// ABC회사가 망했다 => 회사명 변경 => BCD
		hong.company="BCD"; // company는 static변수(정적변수)로 하나의 저장공간을 공유
		shim.company="CDE";
		shim.company="DEF";
		System.out.println(hong.name+"의 회사명 : "+hong.company);
		System.out.println(shim.name+"의 회사명 : "+shim.company);
		System.out.println(park.name+"의 회사명 : "+park.company);
		
		System.out.println();
		
		hong.loc="부산"; // shim.loc, park.loc ==> 서울 (그대로) /hong.loc ==> 부산
		System.out.println(hong.name+"의 근무지: "+hong.loc);
		System.out.println(shim.name+"의 근무지: "+shim.loc);
		System.out.println(park.name+"의 근무지: "+park.loc);
		

	}

}
