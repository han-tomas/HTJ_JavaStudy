package com.sist.util;
/*
 *    335page 
 *    -------
 *      Collection => 데이터를 묶어서 관리를 할 수 있게 만든 클래스
 *                 => 배열의 단점 보완
 *      Collection 프레임워크 (프레임워크 => 표준화)
 *                 -------- => 모든 개발자가 동일한 형태로 소스코딩
 *                             소스의 동일화 목적 : Spring, MyBatis, JQuery
 *                                              VueJS, ReactJS
 *                             일정 틀을 만들어 놓는 것.=> 쉽게 다른 개발자의 코딩을 분석                             
 *                             (완전 통일화 = 라이브러리)
 *      Collection : 1) 데이터 그룹, 다수의 데이터 => 모아서 관리
 *                      ---------------------------------
 *                             배열, 클래스
 *                             배열의 단점 => 고정적 (배열의 크기를 정해 놓고 작업)
 *                                          => 증가 / 감소 시에 새로운 배열을 만들어서 처리해야한다.
 *                                             ---------------------------------------------
 *                                             배열의 크기를 크게 만들면 => 메모리 누수현상 발생
 *                  
 *                   2) 데이터크기에 맞게 클래스를 제작(가변형) => 최적화
 *                                                  => 디폴트(10개) => 추가시 자동으로 10개+
 *                                                  => 저장 메모리를 결정하지 않는다.
 *                   3) 종류
 *                              Collection
 *                                    |
 *                            ---------------------------------------
 *                            |                                     |
 *                           List(순서O중복O)                      Set(순서X중복X)                      Map => 인터페이스
 *                            |(구현 클래스)                           |                                |
 *          (가장 많이 사용)***ArrayList(비동기화) => Vector를 보완   ***HashSet => 중복없는 데이터 저장   ***HashMap
 *                          Vector(동기화) => 네트워크에서 주로 사용     TreeSet(구현 클래스) => 검색       Hashtable
 *                          LinkedList => C언어 호환
 *                          
 *                          List list = new ArrayList()     
 *                          list = new Vector()
 *                          list = new LinkedList()
 *                         
 *                         ---------------------------------------------------- 
 *                          List
 *                          1) 순서를 가지고 있다 (인덱스) => 0부터 시작
 *                          2) 저장된 데이터의 중복을 허용한다
 *                          3) CURD 프로그램에 주로 사용한다
 *                             ---- Create    Update    Read    Delete
 *                                   저장       수정       읽기    삭제
 *                                  ----------------------------------
 *                                  Insert    Update    Select  Delete
 *                          4) 비동기화 => 데이터베이스 프로그램 연동시 사용
 *                          5) 주요메소드
 *                              = 데이터 추가 : add(Object)
 *                              = 데이터 삭제 : remove()
 *                              = 데이터 수정 : set()
 *                              = 데이터 읽기 : get()       
 *                              = 저장된 데이터 갯수 : size()
 *                              = 전체 삭제 : clear()
 *                              = 데이터 존재여부 확인 : isEmpty()
 *                              = 오라클에서 데이터 읽어서 저장 (List) ==> 브라우저 전송 
 *                          6) 구현하고 있는 클래스
 *                             ArrayList / Vector / LinkedList   
 *                         ----------------------------------------------------
 *                          Set
 *                          1) 순서가 없다(인덱스 번호가 없다.) => forEach
 *                          2) 데이터 중복을 허용하지 않는다.
 *                          3) 주로 사용처 => List에 중복된 데이터를 제거
 *                             ----------------------------------- 코딩 테스트
 *                          4) 구현 클래스 
 *                             HashSet / TreeSet
 *                          5) 주요 메소드
 *                              = 데이터 추가 : add(Object)
 *                              = 데이터 삭제 : remove()
 *                              = 데이터 수정 : set()
 *                              = 데이터 읽기 : get()       
 *                              = 저장된 데이터 갯수 : size()
 *                              = 전체 삭제 : clear()
 *                              = 데이터 존재여부 확인 : isEmpty()
 *                         ----------------------------------------------------       
 *                          Map(웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
 *                             request, response, session, cookie
 *                             new Cookie(key,값)
 *                                        ---
 *                             => 사용자가 값 3개
 *                                request.setAttribute("id","hong")
 *                                request.setAttribute("pwd","hong")
 *                                request.setAttribute("sex","man")  
 *                                => 키와 값을 쌍으로 저장한다.    
 *                                => 키는 중복을 허용하지 않는다, 값은 중복이 가능
 *                                => 키가 동일할때는 덮어쓴다.    
 *                          1) 사용처 : 웹에서 주로 사용 (클래스 관리, SQL관리시 많이 사용)
 *                                                 --------   ---------------
 *                                                  Spring      MyBatis                                          
 *                          2) 구현 클래스
 *                             HashMap
 *                          3) 주요 메소드
 *                              = 저장 : put()
 *                              = 읽기 : get(key)
 *                         ----------------------------------------------------
 *                          
 *                          프로젝트
 *                             1차 : 데이터베이스 사용법 (SQL) / JQuery(AJax)
 *                             2차 : Spring / String 라이브러리 / VueJS(Vuex)
 *                                                                   -----
 *                             3차 : 최신기술(우대) Spring-Boot / ReactJS(Redux)  
 *                                                                    ------
 *                                                                    
 *                             웹 프로그램
 *                             ---------
 *                              Model 1
 *                                  => 간단한 사이트 :JSP
 *                              Model 2 (***)
 *                                  => 큰 사이트 : MVC
 *                                  => 데이터관리 와 화면출력을 나눈다                                               
 *                                                         
 */
import java.util.*;
//ArrayList => 사용빈도가 가장 많다.
//=> 배열과 유사 => 인덱스 번호를 사용한다. => 자동으로 지정
//=> 순차적이다 (인덱스가 항상 0으로 시작)
//=> 크기를 지정하지 않는다 (가변형)
//=> 데이터베이스 연동
/*
 *    생성
 *    ---
 *    List list = new ArrayList(); => 기본 생성자 => 메모리가 10개
 *    ArrayList list = new ArratList();
 *    ==> 10개를 넘으면 자동 10개를 추가
 *    
 *    ArrayList list = new ArrayList(10);
 */
public class 라이브러리_List_1 {
	
	public static void main(String[] args) {
		// 생성
		ArrayList list = new ArrayList(); // 저장 => 기본 default Object
		// list에는 모든 데이터형을 첨부할 수 있다 (클래스, 기본형 ...)
		// 가급적이면 같은 데이터형을 첨부하는 것이 관리하기 편하다.
		
		// list라는 공간에 데이터 추가
		// 순서가 존재 ==> for
		// 이름 관리
		list.add("홍길동"); // index = 0
		list.add("박문수"); // index = 1
		list.add("심청이"); // index = 2 =>(강감찬) index = 3 =>(을지문덕) index = 4 
		list.add("춘향이"); // index = 3 =>(강감찬) index = 4 =>(을지문덕) index = 5
		list.add("이순신"); // index = 4 =>(강감찬) index = 5 =>(을지문덕) index = 6
		list.add(2, "강감찬"); // index = 2
		list.add(3, "을지문덕"); // index = 3
		list.add("박문수");
		// 자동으로 인덱스 번호가 변경된다.
		
		//출력
		// 데이터 추가시 => add()를 이용한다.
		// add 메소드는 오버로딩된다.
		// add(Object o) => 뒤에 순차적으로, add(int index,Object o) => 원하는 위치에 (인덱스 번호를 다 바꿔줘야되기 때문에 속도가 느리다.)
		// 저장된 갯수 => size() (= 배열의 length())
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 삭제
		System.out.println("========= 삭제 ==========");
		/*
		 *  0.홍길동
		 *  1.박문수
		 *  2.강감찬
		 *  3.을지문덕 ==> 삭제
		 *  4.심청이
		 *  5.춘향이
		 *  6.이순신
		 */
		// list.remove(index) list.remove("name")
		// 실제값을 삭제                     
		// 중간에 생략하는 번호 없이 순차적으로 자동 설정된다.
		// 중복이 있고 이름으로 삭제 요청할 경우, 가장 처음에 있는 이름만 삭제된다.
		list.remove("박문수");
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//수정
		System.out.println("========= 수정 =========");
		// set => set(index번호 , 변경할 데이터)
		list.set(0, "홍길순");
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//저장된 갯수확인
		System.out.println("===== 저장된 갯수 확인 =====");
		System.out.println("인원수 : "+list.size());
		System.out.println("====== 전체 삭제 ======");
		list.clear(); //메모리 공간 삭제
		System.out.println("인원수 : "+list.size());
		/*
		 *    ***add(Object o)
		 *       set(int index, Object o)
		 *       remove(int index)
		 *    ***Object get(int index)
		 *    ***int sixe()
		 *    ***clear()
		 */

	}

}
