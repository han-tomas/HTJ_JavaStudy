package com.sist.practice;
/*
 *    1. 캡슐화
 *    => 데이터 보호
 *    => 데이터를 은닉화(private) / 메소드를 통해서 접근이 가능(다른 클래스 연결 => public)
 *    
 *    사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다.
 *    사용자 정의 데이터형 ==> ~VO (Value Object)
 */
class SutdaCard
{
	
	private int num;
	private boolean isKwang;
	
	//getter => 읽기
	//setter => 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}
class Student
{
	private String name;
	private int ban,no,kor,eng,math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
class PlayingCard
{
	int kind;
	int num;
	static int width;
	static int height;
	PlayingCard(int k, int n)
	{
		kind =k;
		num=n;
	}
}
/*
 *    인스턴스변수: kind, num // 데이터를 각각 저장시에 사용
 *    정적변수(공유변수) : width, height // 공통으로 사용되는 변수 => 메모리가 1개만 생성
 *    지역변수 : k,n // 메소드에서 선언되는 변수
 *                   => 메소드 안에서만 사용 ({}을 벗어나면 사라진다)
 *                   => 반드시 초기화후에 사용
 */
/*
 *  다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 *  
 *  a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 *  b. 생성자는 객체를 생성하기 위한 것이다.(x) => new
 *  -----------------------------
 *  c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.(X) => 생성자는 없어도 상관없다. 자동생성
 *  --------------------------------------
 *  d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
 *  e. 생성자는 오버로딩 할 수 없다.(X) => 기본 생성자에 오버로딩
 *  ------------------------
 *           ------ 같은 이름의 메소드를 여러개 만들어서 사용
 *        *** 오버로딩의 조건
 *        = 한개의 클래스나 상속 관계의 클래스
 *        = 메소드명 동일 (한개의 이름으로 여러개의 새로운 기능을 추가)
 *        = 매개변수의 갯수나 데이터형이 다르다.
 *        = 리턴형은 관계없다.  
 *   
 *  
 * 
 *  다음중 this에 대한 설명으로 맞지 않은 것은?(모두 고르시오)
 *       ----
 *       1) 모든 클래스는 this를 가지고 있다.
 *       2) 객체 자신을 가르키는 참조변수(static Object this) => new
 *       3) this는 생성자, 인스턴스 메소드에서 사용이 가능
 *       4) 지역변수와 인스턴스 변수를 구분할때 사용한다.
 *       5) 클래스메소드 내에서는 사용할 수 없다.
 *          인스턴스메소드, 객체메소드
 *          =>객체명.메소드
 *          정적메소드, 공유메소드, 클래스매소드
 *          =>클래스명.메소드
 *       class A
 *       {
 *          private String name; => heap
 *          public void display(String name) => stack
 *          {
 *             this.name=name (매개변수)
 *             ---------
 *             A클래스에 설정된 변수
 *          }
 *       }
 *       
 *       
 *  a. 객체 자신을 가르키는 참조변수이다.
 *  b. 클래스 내에서라면 어디서든 사용할 수 있다.(X) => static에서 사용 불가
 *  ---------------------------------
 *  c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
 *  d.클래스 메서드 내에서는 사용할 수 없다.
 *  
 *  
 *  
 *  다음중 오버로딩이 성립하기 위한 조건이 아닌 것은?(모두 고르시오)
 * 
 *  a.메서드의 이름이 같아야 한다.
 *  b.매개변수의 개수나 타입이 달라야한다.
 *  c.리턴타입이 달라야 한다.(X) => 리턴형은 관계없다
 *  ------------------
 *   
 *  d.매개변수의 이름이 달라야 한다.(X) => void diplay(int a) => display(int)
 * -------------------------   => void diplay(int a) => display(int) (같다)
 *  
 *  
 *  오버로딩의 조건
 *  
 *  1. (메소드)이름이 같아야한다.
 *  2. (매개변수)의 개수 또는 타입이 달라야 한다.
 *  3. 매개변수는 같고 (매개변수명)이 다른 경우는 오버로딩이 성립되지 않는다.
 *  
 *  
 *  다음 중 아래의 add 매소드를 올바르게 오버로딩 한 것은 ? (모두 고르시오)
 *  =====================================
 *  long add(int a, int b){ return a+b;} => add(int,int)
 *  =====================================
 *  a. long add(int x, int y){ return x+y;}(X) => add(int,int)
 *  b. long add(long a, long b){ return a+b;}(O) => add(long,long)
 *  -----------------------------------------
 *  c. long add(byte a, byte b){ return a+b;}(O) => add(byte,byte)
 *  -----------------------------------------
 *  d. long add(long a, int b){ return a+b;}(O) =>add(long,int)
 *  ----------------------------------------
 *  
 *  
 *  다음중 초기화에 대한 설명으로 옳지 않은 것은?(모두 고르시오)
 *  
 *  a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
 *     ----- 인스턴스 변수, 정적변수 => 자동 초기화
 *     int => 0
 *     double => 0.0
 *     boolean => false
 *     String,배열,클래스 => null: 참조하는 주소가 없는 경우 
 *  b. 지역변수는 사용하기 전에 반드시 초기화 해야한다.
 *  c. 초기화 블럭보다 생성자가 먼저 수행된다.(X)==> 명시적 초기화 => 초기화 블럭 => 생성자
 *  -------------------------------                    클래스변수 => 인스턴스변수
 *  d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
 *  e. 클래스변수보다 인스턴스변수가 먼저 초기화 된다.(X) ==> 클래스변수 => 인스턴스변수
 *  ------------------------------------
 *     -------컴파일시
 *                -------- new
 *                
 *  
 *  다음 중 인스턴스 변수의 초기화 순서가 올바른 것은?
 *  
 *  a. 기본값 - 명시적초기화 - 초기화블럭 - 생성자 (O)
 *  -----------------------------------
 *  b. 기본값 - 명시적초기화 - 생성자 - 초기화블럭
 *  c. 기본값 - 초기화블럭 - 명시적초기화 -생성자
 *  d. 기본값 - 초기화블럭 - 생성자 - 명시적초기화
 *  
 *  
 *  다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 *  
 *  a. 자동 초기화 되므로 별도의 초기화가 필요없다(X)
 *  ------------------------------------
 *  b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
 *  c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
 *  d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.(X)
 *  --------------------------------------
 *  e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.(X) => 스택메모리(stack)
 *  -------------------------------------------
 *  
 *  다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
 * 
 *  a. public-protected-default-private(O)
 *  -----------------------------------
 *  b. public-default-protected-private
 *  c. default-public-protected-private
 *  d. private-protected-public-default
 *  
 *  (private) 같은 클래스 내에서만 접근이 가능하다.
 *  (default) 같은 패키지 내에서만 접근이 가능하다.
 *  (protected) 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
 *  (public) 접근 제한이 전혀없다
 *  
 *  
 *  c. 지역변수에도 접근 제어자를 사용할 수 있다.(X)
 *     -----
 *     지역변수는 static , 접근지정어, abstract는 사용이 불가능
 *     지역변수중에 유일하게 사용 : final
 *  
 */
public class 객체지향연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
