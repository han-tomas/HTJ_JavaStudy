package com.sist.map; 
/*
 *          Map => 인터페이스
 *           |
 *    ----------------------
 *     |                   |
 *    Hashtable           HashMap
 *    특징)
 *       => 두개를 동시에 저장(key,value)
 *          (단, key는 중복할 수 없다.)
 *          ("id","hong")
 *          ("id","shim") ==> X
 *          ------------- id로 shim값을 가져온다. 덮어쓴다 
 *          ("id1","hong")
 *          ("id2","hong") ==>O    
         => 사용처 : 웹에서 제공하는 모든 클래스(Map 형식)
            HttpSevletRequest
              request.setAttribute("key"."value")
            HttpSevletResponse
            HttpSession
            Cookie
         => 스프링 , 마이바티스 => Map형식
            ----   --------SQL
            클래스등록        ("all","SELECT * FROM emp")
            ("a",new A())  
         => 저장 / 읽기
            ---------
            저장 : put("key","값")
            읽기 : get(key)
            -------------------------- JSON, Properties
            => 데이터는 구분자를 필요로 한다.
                      ----
                      ArrayList => 인덱스 번호
                      Set       => 중복X
                      Map       => key
                      오라클     => Primary Key
                      ------------------------
                      영화 : 영화번호
                      뮤직 : 뮤직번호
                      맛집 : 맛집번호
                      게시판 : 게시판번호
                      회원관리 : ID  
                      ------------------------ 정형화된 데이터
                      비정형화 => 빅데이터 => 정형화된 데이터
                                          ============
                                           통계 / 확률
                      
                      
 */ 
import java.util.*;
public class 라이브러리_Map_1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		// 데이터 저장
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("password", "4567"); // key가 중복되면 => 덮어쓴다.
		// 데이터 출력
		/*System.out.println("ID "+map.get("id"));
		System.out.println("PWD "+map.get("password"));
		System.out.println("NAME "+map.get("name"));
		System.out.println("SEX "+map.get("sex"));
		System.out.println("AGE "+map.get("age"));*/
		
		Set set = map.keySet();
		System.out.println(set);
		for(Object obj:set)
		{
			String key =(String)obj;
			System.out.println(key+" : "+map.get(key));
		}
		/*
		 *    clear() : 전체 삭제
		 *    get() : 실제 데이터값 읽을 때
		 *    put() : 데이터 추가
		 *    isEmpty() : 데이터가 있는지 여부 (true/false)
		 *    size() : 저장된 갯수
		 *    values() : 실제 저장된 값 전체
		 */
		for(Object obj:map.values())
		{
			System.out.println(obj);
		}
	}

}
