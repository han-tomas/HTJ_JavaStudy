// & | ^
/*
 *     &(*)    |(+)    ^(같으면 0, 다르면 1)
 * --------------------------
 * 00   0       0      0
 * --------------------------
 * 01   0       1      1
 * --------------------------
 * 10   0       1      1
 * --------------------------
 * 11   1       1      0
 * --------------------------
 * 
 *    8 & 3
 *    1000
 *    0011
 *    ----&
 *    0000 ==> 0
 *    
 *    8 | 3
 *    1000
 *    0011
 *    ----|
 *    1011 ==> 11
 *    
 *    8 ^ 3
 *    1000
 *    0011
 *    ----^
 *    1011 ==> 11
 *    
 *    13 & 6
 *    1101
 *    0110
 *    ----&
 *    0100 ==> 4
 *    
 *    13 | 6
 *    1101
 *    0110
 *    ----|
 *    1111 ==> 15
 *    
 *    13 ^ 6
 *    1101
 *    0110
 *    ----^
 *    1011 ==> 11
 */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(13|6);

	}

}
