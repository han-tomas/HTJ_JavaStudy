package com.sist.main3;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {

	protected  Music[] musics = new Music[50]; 
	protected String title="지니뮤직 Top50";
	// 1. 초기화
	/*
	 *    <방법>
	 *    1)인스턴스 블록
	 *    2)static 블록
	 *    ------------ 자동호출 // 자동으로 하게 할거냐
	 *    3)생성자 // 내가 불러서 할거냐
	 *    
	 *    예외처리
	 *    ------
	 *      |
	 *     에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *            메모리공간 부족
	 *     예외 => 수정이 가능한 에러
	 *         => 비정상 종료를 방지하고 정상 수행이 가능하게...
	 *         => io, net, thread, web
	 *            --  ---  ------  ---
	 *             |   |     |     404 500 403 412 400 ....
	 *             |   |    충돌
	 *             |  IP/URL
	 *            파일 경로명, 파일명
	 *         
	 *         => 에러
	 *              사용자 입력
	 *              프로그래머의 실수   
	 *         => 예외복구 / 예외회피
	 */
	 
	{
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// 문서 저장 공간 => HTML
			//System.out.println(doc.toString());
			/*
			 *    HTML => tag <> => Markup language
			 *            <a>값</a>
			 *    Element => tag
			 *    Elements => 같은 태그 여러개를 모아준 것
			 */
			// 노래명 <table class="list-wrap"> .
			// 구분자 => 모든 태그 class(중복)/id(중복이 없다.)
			// class => . id=> #
			Elements title = doc.select("table.list-wrap td.info a.title");
			
			// 가수명
			Elements singer = doc.select("table.list-wrap td.info a.artist");
			
			// 앨범
			Elements album = doc.select("table.list-wrap td.info a.albumtitle");
			
			// 상태
			Elements etc = doc.select("table.list-wrap td.number span");
			
			for(int i=0; i<title.size();i++)
			{
				/*System.out.println("노래명 : "+title.get(i).text());
				System.out.println("가수명 : "+singer.get(i).text());
				System.out.println("앨범 : "+album.get(i).text());*/
				String s = etc.get(i).text();
				String state="";
				String value ="";
				if(s.equals("유지"))
				{
					state="유지";
					value="0";
				}
				
				else
				{
					state=s.replaceAll("[0-9]", "");
					value=s.replaceAll("[가-힣]", "");
					/*
					 *    split
					 *    replaceAll
					 *    ----------- 정규식 (한글형태, 숫자형태 => 패턴)
					 *    [0-9] => 숫자전체
					 *    [가-힣] => 한글전체
					 *    [A-Za-z] => 영어전체
					 */
				}
				/*System.out.println("상태 : "+state);
				System.out.println("증폭 : "+value);
				System.out.println("===================================");*/
				
				musics[i]=new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrment(value);
				
				
			}
			
		}catch(Exception ex) {}
	}
	// 2. 기능 (어떤 기능) ==> 메소드
	/*
	 *    결과값을 전송 : 리턴형 // 보통은 자료들을 브라우저로 보내야되기때문에 리턴형
	 *    자체 출력 : void
	 */
	public Music[] musicAllData()
	{
		return musics;
		
	}
	
	
	// 2-1. 목록 출력 => type==1 title, type ==2 singer, type==3 album...
	public Music[] musicFind(String fd,int type)
	{
		int i=0;
		for(Music m:musics)
		{
			
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);
				if(bCheck==true)
				i++;
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
				if(bCheck==true)
				i++;
			}
		}	
			
		Music[] mm = new Music[i];
		i=0;
		/*
		 *  A a= new A();
		 *  A b = a;
		 */
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);

			}
			else
			{
				bCheck=m.getSinger().contains(fd);

			}
			if(bCheck==true)
			{
				mm[i]=m;
				i++;
			}
		}
		return mm;
		/* Chat gpt
		 * 이 코드는 Music 클래스 배열인 "musics"에서 검색어 "fd"를 포함한 곡 정보를 찾아서, 그 결과를 Music 배열인 "mm"으로 반환하는 메서드인 "musicFind"를 정의하는 것입니다.
		 * 메서드의 첫 번째 인자인 "fd"는 검색어이며, 두 번째 인자인 "type"은 검색어가 제목인지 가수명인지를 나타내는 값입니다.
		 * "type"이 1인 경우는 제목을 검색하고, 1이 아닌 경우는 가수명을 검색합니다.
		 * 먼저, "musics" 배열에서 검색어가 포함된 곡 정보를 찾기 위해 "for-each" 반복문을 사용합니다. 
		 * "boolean" 타입의 "bCheck" 변수는 검색어가 해당 곡의 제목 또는 가수명에 포함되어 있는지를 나타내는 값입니다. 
		 * "type"이 1인 경우는 곡의 제목을 검색하므로, 해당 곡의 제목이 검색어를 포함하고 있는지를 "contains" 메서드로 확인합니다.
		 * "type"이 1이 아닌 경우는 곡의 가수명을 검색하므로, 해당 곡의 가수명이 검색어를 포함하고 있는지를 확인합니다.
		 * 검색어가 해당 곡의 정보에 포함되어 있다면, "i" 변수를 증가시킵니다.
		 * 그 다음, 검색어가 포함된 곡의 수를 저장한 "i"를 크기로 하는 "mm" 배열을 생성합니다.
		 * 이후에는 다시 "musics" 배열을 순회하면서, 검색어가 포함된 곡을 찾습니다. 방법은 이전과 동일합니다.
		 * 다만, 검색어가 해당 곡의 정보에 포함되어 있다면, "mm" 배열에 해당 곡을 추가합니다.
		 * 마지막으로, "mm" 배열을 반환합니다. 이렇게 하면, "musicFind" 메서드는 검색어가 포함된 곡의 정보를 모두 포함한 "mm" 배열을 반환하게 됩니다.
		 */
	}
		
	
	// 2-2. 검색
	 
	public static void main(String[] args) {
		GenieMusicSystem g = new GenieMusicSystem();
		Music[] aa= g.musicFind("사", 1);
		
		for(Music a:aa)
		{
			System.out.println(a.getTitle());
		}
		
	}
}
