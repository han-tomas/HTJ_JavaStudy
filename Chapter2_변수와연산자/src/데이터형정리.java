/*
 *   변수 설정 => 자바에서 지원하는 데이터형을 미리 숙지
 *   0,1만 저장 (항상 숫자로 저장이 된다.)
 *    => 문자는 각 문자마다 숫자를 가지고 있다.
 *    bit ==> byte ==> word ==>  record
 *    ============
 *     |
 *    0,1=> bit가 8개 => 1byte
 *    --------------------
 *     0(1) 1 1 1 1 1 1 1 
 *    --------------------
 *      |
 *     부호비트 (0: 양수, 1: 음수)
 *     => 컴퓨터에서 모든 숫자는 int 인식, 실수 => double
 *     데이터형
 *    -------------------------------------------------------------- 
 *    데이터형   1byte(8bit)  2byte(16bit)  4byte(32bit)  8byte(64bit)
 *    --------------------------------------------------------------
 *    정수 
 *    --------------------------------------------------------------
 *    byte        O (네트워크 전송, 파일 업로드, 파일 다운로드)
 *                -128~127 (범위를 벗어나면 오버플로우 발생)
 *    --------------------------------------------------------------
 *    short(X)                  O (C언어 호환)
 *    --------------------------------------------------------------
 *    int                                     O (deafault)
 *                     모든 정수의 기본(웹) => hit, 고유번호,
 *    --------------------------------------------------------------
 *    long                                                   O
 *                     int / long의 구분은 L(l)
 *    --------------------------------------------------------------
 *    실수
 *    --------------------------------------------------------------
 *    float(X)                                O
 *    --------------------------------------------------------------
 *    double                                                 O (deafault)
 *                     double / float 구분은 F(f) 
 *    --------------------------------------------------------------
 *    문자
 *    --------------------------------------------------------------
 *    char                      O (0~65535) 각국의 언어 사용이 가능
 *                                UTF-8 (Unicode)
 *                                ''를 사용해서 저장 => 한글자만 저장이 가능
 *                     "" => String           
 *    --------------------------------------------------------------
 *    논리
 *    --------------------------------------------------------------
 *    boolean     O     true/false => 조건문을 만들 경우에 사용
 *                    => 삼항연산자, if, while, for, do~while
 *    --------------------------------------------------------------
 *    
 *    크기
 *    byte < short < int < long < float < double
 *           char
 *        **boolean은 제외
 *        수 표현이 많을수록 크기가 크다. //byte 크기가 크다고 큰것이 아님.
 *        long => 1 , float => 1.000000 => 2^6
 *        char는 정수로 취급 가능
 *        'A' => 65
 *        'a' => 97
 *        '0' => 48
 *    변수는 한개만 저장하는 메모리 공간의 이름 (주소) => 별칭
 *    ------------------------------------------
 *    변수
 *     1) 선언
 *        데이터형 변수명;
 *     2) 초기화
 *        변수 = 값;
 *        => 명시적 초기화
 *        int a;
 *        a = 10;
 *        = 난수 (임의의 값)
 *        = 입력을 받아서 초기화
 *     3) 선언과 동시에 초기화 
 *        데이터형 변수명 = 값;
 *     4) 데이터형에 대입 : 항상 왼쪽이 크거나 같다.
 *        byte 값(byte)
 *        int 값 (byte, int, char)
 *          byte = 10;
 *          int a = b, 'A', 100;
 *        long 값 (byte, int, char, long)
 *        float 값 (byte, int, char, long, float)
 *        double 값 (byte, int, char, long, float, double)
 *             
 *        
 */
public class 데이터형정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = (byte)300;   //오버플로우 발생
		System.out.println(b); 
		System.out.println(0);
		System.out.println((int)'0');
		System.out.println(0-10);
		System.out.println('0'-10);
		double d = 10; // 10.0
		 d ='A'; // 65.0
		System.out.println(d);
		
	}

}
