package practice;

public class 문제 {
/*
1.자바의 상속에 대한 설명 중 틀린 것은?
1) 자바는 다중 상속을 허용한다.(단일 상속) //인터페이스는 다중 구현
-----------------------자바 class => 상속 / interface => 구현
2) 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다.
3) 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.
   static, 생성자, 초기화블럭, private(상속은 된다. 단지 접근이 안된다)
   => 상속의 예외 조건
4) final 클래스는 상속할 수 없고, final 메소드는 오버라이딩 할 수 없다.
   final이 있는 경우 있는 그대로 사용 => String, Math, System...
   
  
2.클래스 타입 변환에 대한 설명 중 틀린 것은?
  class 동물
  class 사람 extends 동물 => 동물 a = new 사람();
                          사람 b = new 사람();
                           B bb =(B)a;
  
1) 자식 객체는 부모 타입으로 자동 타입 변환된다.
2) 부모 객체는 항상 자식 타입으로 강제 타입 변환된다.
---------------------------------------
3) 자동 타입 변환을 이용해서 필드와 매개 변수의 다형성을 구현한다.
4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.
  
  
3.final 키워드에 대한 설명으로 틀린 것은?
 
1) final 클래스는 부모 클래스로 사용할 수 있다.
-------------------------------------
2) final 필드는 값이 저장된 후에는 변경할 수 없다.
3) final 메소드는 재정의(오버라이딩)할 수 없다.
4) static final 필드는 상수를 말한다.
  
  
4.오버라이딩(Overriding)에 대한 설명으로 틀린 것은?
  
1) 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개 변수)와 동일해야 한다.
2) 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.(ex. public > private)
3) @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.
4) protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할 수 없다.
-----------------------------------------------------------------
  
5. Parent 클래스를 상속한 Child 클래스의 생성자에서 컴파일 에러가 발생한 이유는?

public class Parent{
	public String name;
	---------------------
    public Parent(){} ==> 기본 생성자가 있어야한다.
    --------------------- 
	public Parent(String name){
		this.name = name;
	}
}
 
public class Child extends Parent{
	private int studentNo;
 
	public Child(String name, int studentNo){
		this.name = name;
		this.studentNo = studentNo;
	}
}
------------------------------------------------------------ 
1) 생성자는 상속이 되지 않는다.
2) Child c = new Child("",1)=>  상위 클래스의 기본 생성자가 호출된다.
------------------------------------------------------------

7. 인터페이스에 대한 설명으로 틀린 것은 무엇입니까?
 
1. 인터페이스는 객체 사용 설명서 역할을 한다.
2. 구현 클래스가 인터페이스의 추상 메소드에 대한 실체 메소드를 가지고 있지 않으면 추상 클래스가 된다.
3. 인터페이스는 인스턴스 필드를 가질 수 있다. (상수형 변수만 가지고 있다.)
----------------------------------
   public static final
4. 구현 객체는 인터페이스 타입으로 자동 변환된다.
*멤버변수 => 필드, 속성(인스턴스 변수)

 
8. 인터페이스의 다형성과 거리가 먼 것은? 
 
1. 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
2. 매개 변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
3. 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다.
4. 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다.
----------------------------------------------------



9. 다음 중 인터페이스의 장점이 아닌 것은? (390page 참조)

a. 표준화를 가능하게 해준다.
b. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
c. 독립적인 프로그래밍이 가능하다.
d. 다중상속을 가능하게 해준다.
e. 패키지간의 연결을 도와준다.
----------------------


10. 다음 중 틀린 것은?

a. 필드는 초기화하지 않아도 된다.
b. 클래스에 생성자가 없어도 된다.
c. 생성자는 일반적으로 필드를 초기화한다.
d. 필드는 생성자보다 먼저 선언해야 한다.


11. 상속을 설명한 것이다. 틀린 것은?
 
a. 모든 클래스의 최상위 클래스는 Object이다.
b. 부모 객체를 자식 클래스 타입의 변수에 대입할 수 있다.
c. 부모 클래스의 private 메소드를 자식 클래스가 오버라이딩할 수 없다.
d. 부모 클래스를 상속하려면 extends 키워드가 필요하다.



12. 다음 코드가 있다. 밑줄 그은 곳에 적절하지 않은 코드는?
 
class Car {
    public String name;
    protected String color;
    private  int model;
}
 
class SportsCar extends Car {
    boolean turbo;
}
 
public class CarTest {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        ______________________
    }
}
 
a. s.name = "ferrari";
b. s.color = "red";
c. s.model = 105;
d. s.turbo = true;

 
 
 14. 다음과 같은 부모 클래스와 자식 클래스가 있다 틀린 곳을 찾으시오
 
class Person {
    void name() { }
    protected void number() { }
    private void secret() { }
}
 
class Student extends Person {
    public void name() { }
    void number() { }
    private void secret() { }
}


15. 인터페이스를 설명한 것이다. 틀린 것은?
 
a. 인터페이스는 인스턴스 변수를 포함할 수 없다.
b. 인터페이스는 생성자를 포함할 수 없다.
c. 인터페이스는 상수를 포함할 수 없다.
d. 인터페이스의 모든 멤버는 public으로 공개된다.



16. 다음은 인터페이스와 구현 클래스를 정의한 코드이다. 빈칸에 적절한 내용은?
 
interface A{
    void isPrint();
}
 
class B __________ {
    public void isPrint() {
        System.out.println(“OK");
    }
}

 
17. Printable는 인터페이스이다. 다음 코드에서 잘못된 행을 모두 찾으시오.
 
interface Printable {
    String toner;
    abstract void print();
}
 
public class PrintableTest extends Printable {
    public static void main(String[] args) {
        new Printable();
        new PrintableTest();
    }
 
    void print() {}
}



   


 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
