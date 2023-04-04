// 3의 배수, 5의 배수, 7의 배수의 팝 => 갯수
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		int c3=0,c5=0,c7=0;
		
		int i=1; // 초기값
		while(i<=100) // 조건식
		{
			// 중복적으로 수행 => 단일조건, 중복이 없는 경우 => 다중 조건
			if(i%3==0)
			{
				a3+=i; // 합
				c3++; // 갯수
			}
			if(i%5==0)
			{
				a5+=i; 
				c5++;
			}
			if(i%7==0)
			{
				a7+=i; 
				c7++;
			}
			i++; // 증가식
			
		}
		
		int Max = c3;
		
		if(Max<c5)
			Max=c5;
		if(Max<c7)
			Max=c7;
		
		int Min = c3;
		
		if(Min>c5)
			Min=c5;
		if(Min>c7)
			Min=c7;
		
		System.out.println("============== 결과 값 ===============");
		System.out.println("1~100 사이의 3의 배수합 : "+a3+", 갯수: "+c3);
		System.out.println("1~100 사이의 3의 배수합 : "+a5+", 갯수: "+c5);
		System.out.println("1~100 사이의 3의 배수합 : "+a7+", 갯수: "+c7);
		System.out.println("가장 많은 갯수는 "+Max);
		System.out.println("가장 적은 갯수는 "+Min);

			
	}

}
