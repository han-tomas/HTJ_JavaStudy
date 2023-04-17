package com.sist.main;

import lombok.Getter; // lombok 다운 => MVN repository => lombok검색 => project lombok 최신 버전 jar파일 다운후=>javaDev에 파일 옮겨주기
import lombok.Setter; // => 명령 프롬프트에서 cd:\javaDev => jav -jar lombok-1.18.26.jar (lom까지만 치고 tab누르면 됨)
                      // eclipse.exe 파일 선택해서 install=> quit install 후 eclipse 재실행
                      // 자바 프로젝트 Chapter5_접근지정어_1 우클릭 후 Build Path -> configure ->  class pathd에 Add External jar 해서 추가

@Getter // lomboc에  의해서 getter setter 메소드 만들 필요 없음.
@Setter

class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
}
// 객체지향의 3대 특성은 문법 사항은 아니다. => 권장 (실무 => 캡슐화)
public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1명 저장
		Sawon sa = new Sawon();
		//sa => sabun, name, dept, loc, pay
		sa.setSabun(1);
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("서울");
		sa.setPay(3000);
		
		System.out.println(sa.getSabun()+" "
				+sa.getName()+" "
				+sa.getDept()+" "
				+sa.getLoc()+" "
				+sa.getPay());

	}

}
