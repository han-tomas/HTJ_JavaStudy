/*
 *    대입연산자
 *    연산순서 (우→좌)
 *    
 *    
 *     = 대입연산자
 *     ------------- 복합대입연산자
 *  ***+= ==> 누적 (총합)
 *  ***-=
 *     *=
 *     /=
 *     %=
 *     <<=
 *     >>=
 *     &=
 *     |=
 *     ^=
 *     -------------
 *     
 *     +=
 *     ---
 *     int a = 10;
 *     a += 10; a = a + 10; ==>20
 *     a += 1;  a = a + 1; a++ ++a
 *     ----------------------------
 *     a += 20 a = a + 20; ==>30
 *     a -= 20 a = a + 20; ==>-10
 *     a *= 20 a = a * 20; ==> 200
 *     a /= 20 a = a / 20; ==> 0
 *     a %= 20 a = a % 20; ==> 0
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		a++;
		a++;
		a++;
		System.out.println(a);*/
		int a = 10;
		a += 3;
		System.out.println(a);
		
	}

}
