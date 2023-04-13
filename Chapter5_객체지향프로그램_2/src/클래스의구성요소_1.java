/*
 *    기초
 *      = 변수, 데이터형,
 *      = 연산자, 제어문
 *        ---- 단항연산자(++,--,!,(type))
 *             이항연산자(산술,비교,논리,대입)
 *             삼항연산자
 *             조건문(단일 if, 선택 if~else, 다중 if~else if)
 *             반복문 (for, while)
 *                   --- 2차 for, for-each
 *             반복제어문(break)      
 *      = 배열 : 1차
 *      = 문자열 저장 => String
 *                      기능:
 *                     ***1) equals : 문자열 비교
 *                           => [원형] boolean equals(String s)
 *                              DB : WHERE name = '홍길동'
 *                     
 *                        2) stratsWith : 시작문자열
 *                           => [원형] boolean stratsWith(String s)
 *                              DB : WHERE name LIKE = '홍%'
 *                      
 *                        3) endsWith : 끝 문자열
 *                           => [원형] boolean endsWith(String s)
 *                              DB : WHERE name LIKE = '%홍'
 *                     
 *                     ***4) contains : 포함  
 *                           => [원형] boolean contains(String s)
 *                              DB : WHERE name LIKE = '%홍%'
 *                     
 *                        5) length : 문자갯수
 *                           => [원형] int length
 *                       
 *                        6) indexOf : 문자, 문자열의 위치 (처음부터)
 *                           int indexOf(char)
 *                           int indexOf(String)
 *                       *** 문자열은 index번호가 0부터 시작
 *                           예)             0123456789
 *                              String s =  "Hello Java";
 *                                                  -
 *                              s.indexOf('a'), s.indexOf("a") ==> 7 
 *                              
 *                        7) lastIndexOF : 문자, 문자열의 위치 (뒤에서부터) 
 *                           int lastIndexOf(char)
 *                           int lastIndexOf(String)
 *                           예)             0123456789
 *                              String s =  "Hello Java";
 *                                                    -
 *                              s.lastIndexOf('a'), s.lastIndexOf("a") ==> 9 
 *                       
 *                        8) trim : 좌우의 공백 제거
 *                           String trim()
 *                        
 *                        9) valueOf : 모든 데이터형을 문자열로 변환
 *                           valueOf(1) ==> "1"          
 *                        ***윈도우/ 웹 => 모든 데이터형 문자열
 *                           static String valueOf(모든 데이터형) : String에서 유일한 static이다. 
 *                           String.valueOf()
 *                           --------------
 *                           static이기 때문에 접근법은 클래스명.메소드명                       
 *                       
 *                        10) replace() : 변환 (문자열, 문자)
 *                            String replace(char,char)
 *                                           ---- ----
 *                                           old   new
 *                            String replace(String,String)
 *                            
 *                        11) replaceAll: 변환 (*문자열)
 *                            String replaceAll(String,String)
 *                                              ------ regexp => 정규식  
 *                            replaceAll("[가-힣]","") ==> 한글 전체를 공백으로 바꿔라.
 *                                        [A-Z],[a-z],[0-9]
 *                        
 *                        12) substring() : 문자열을 자르는 경우
 *                            String substring(int s)
 *                            String s ="Hello Java"
 *                                       0123456789
 *                            s.substring(6) ==> "Java"
 *                            String substring(int s, int e)
 *                            String s="Hello Java"
 *                                      0123456789
 *                            s.substring(0,4) ==> "Hell"
 *                                          -- 마지막 문자를 자르기때문에 +1해주어야 한다.
 *                                             s.substring(0,5) ==> "Hello"                               
 *    
 *    class : 설계 => 속성, 기능
 *                   --   --
 *                  변수    메소드
 *          예) 
 *             웹 => 출력 내용(변수)
 *                  메뉴,버튼(메소드)
 *                  ------------ 요구사항분석 (설계)          
 *            
 *            추상화 : 설계 (기능,데이터) => 사물을 단순화
 *              예)
 *                 사원 : 사번, 이름 ...
 *                       출근한다, 퇴근한다...
 *            ----------------------------------
 *            class 설계 =======> 메모리 저장(인스턴스)
 *                               new (클래스를 저장할때)
 *                              *Spring은 new를 사용하지 않는다.
 *                               new 없이 저장이 가능 => 리플렉션           
 *    
 *    1. 구성요소
 *       class ClassName // 클래스 선언부
 *       {
 *           ---------------
 *           변수(속성)
 *             멤버변수
 *               = 인스턴스 변수 => new 사용시마다 따로 메모리를 만든다.
 *               = 정적 변수(static) => 한개의 메모리 공간만 만들어 공유한다.(공유변수)
 *                                   컴파일러에 의해 자동 생성 
 *           ---------------
 *           메소드(동작) : 기능
 *           ---------------
 *           생성자 : 멤버변수 (인스턴스 변수) 초기화
 *                  메모리에 저장시 처음으로 호출되는 메소드
 *           ---------------
 *       }
 *    2. 구성요소 사용법
 *       1) 메모리에 저장
 *          class A
 *          {
 *             변수 / 메소드
 *          }
 *          
 *          선언)
 *              A a; 
 *              a = new A()
 *          
 *              A a = new A()
 *           
 *           예)   
 *              class A
 *              {
 *                  int sabun;
 *                  String name;
 *                  String getName(){}
 *                  int getSabun(){}
 *                  void run
 *              }  
 *              
 *              A a = new A() 
 *                    ---데이터 메모리를 모아준다                      
 *                 100-----------                           
 *                    sabun 저장공간                  
 *                    name 저장공간
 *                    ----------
 *                    getSabun()
 *                    getName()
 *                    ---------
 *             
 *             a.sabun ==> 100이라는 주소에 있는 sabun의 값을 가지고 온다
 *              - 도트연산자 => 메모리 주소 접근 연산자.      
 *                     
 *    3. 접근범위
 *    4. 객체지향의 3대 요소
 *    5. 클래스의 종류
 *    6. 예외처리
 *    -------------------
 *    API => 지정된 라이브러리 사용법만 알면된다.
 *    
 *    class A
 *    {
 *        int aa;
 *    }
 *    class B
 *    {
 *        A a = new A();
 *    }
 *    class C
 *    {
 *        B b = new B()
 *    }
 *    
 *    C c= new C()
 *    c.b.a.aa    
 *    
 *    ===========================
 *    class Out
 *    {
 *        println();
 *    }
 *    static System
 *    {
 *        Out out = new Out();
 *    }
 *    
 *    System.out.println();
 *    ------ --- --------
 *      |     |   메소드
 *      |    인스턴스
 *      |    클래스객체명.변수
 *    static
 *    클래스명.변수명
 *    ===========================
 *    
 *    
 */
class Student
{
	int hakbun;
	String name;
}
public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		Student hong = new Student();
		// hong => hakbun, name
		hong.hakbun=3;
		hong.name ="홍길동";
		
		Student shim=hong; // 참조(얕은복사) => 같은 메모리 공간 공유
		System.out.println(shim);
		System.out.println(hong);
		shim.hakbun = 2;
		shim.name="심청이";
		
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
		
		
	}

}
