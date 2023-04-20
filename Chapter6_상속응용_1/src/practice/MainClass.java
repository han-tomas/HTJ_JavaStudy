package practice;
class A
{
	 public A() {
		 System.out.println("A() call...");
	 }
	 public A(int a) {
		 System.out.println("A(int a) call...");
	 }
}
class B extends A
{
	public B() {
		System.out.println("B() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(); // 매개변수가 있는 생성자를 상속받으려면 기본생성자가 있어야 한다.

	}

}
