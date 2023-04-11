// 매개변수 전송법
/*     기술면접
 *    = Call By Value : 일반 기본형 데이터 전송 (String)
 *    = Call By Reference : 주소값을 넘겨주는 방식 (배열, 클래스) => 주소를 참조하면, 같은 메모리를 관리한다.
 */
public class 메소드_2_Call_By {
	static void swap(int x, int y)
	{
		System.out.println("교환전 x="+x+" ,y="+y);
		int temp =x;
		x=y;
		y=temp;
		System.out.println("교환후 x="+x+" ,y="+y);
	}
	static void swap2(int[] arr2)
    {
    	System.out.println("arr2="+arr2);
    	System.out.println("교환전 : arr2[0]= "+arr2[0]+", arr2[1]= "+arr2[1]);
    	int temp =  arr2[0];
    	arr2[0]=arr2[1];
    	arr2[1]=temp;
    	System.out.println("교환후 : arr2[0]= "+arr2[0]+", arr2[1]= "+arr2[1]);
    }
	
	static void swap3(String id, String pwd)
	{
		System.out.println("교환전 : id ="+id+" , pwd ="+pwd);
		String temp = id;
		id=pwd;
		pwd=temp;
		System.out.println("교환후 : id ="+id+" , pwd ="+pwd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("종료: a=" +a+", b="+b);
		System.out.println();
        //값만 전송 => Call By Value ==> 기본형
		
		
		
		int[] arr= {10,20};
		System.out.println("arr= "+arr);
		swap2(arr);// int[] arr2=arr
		System.out.println("종료후 : arr[0]= "+arr[0]+", arr[1]= "+arr[1]);
		System.out.println();
		// 배열, 클래스 => 메소드 자체에서 변경이 가능
		// Call By Reference
		// 주소를 넘겨준다 => 같은 메모리를 관리한다
		
		
		
		String id="admin";
		String pwd="1234";
		swap3(id,pwd);
		System.out.println("종료후 : id ="+id+" , pwd ="+pwd);
		// String은 배열과 비슷하지만 Call By Value 형
	}

}
