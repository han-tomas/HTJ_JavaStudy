package com.sist.temp;

import java.awt.*; // Layout
import javax.swing.*; // window

import com.sist.commons.Function;
import com.sist.commons.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;

import java.awt.event.*; 
import java.util.*;
//-----------------네트워크 관련
import java.util.List;

import java.io.*;
import java.net.*;
/*
 *   프로그램 => 2개
 *   1) 로그인, 채팅문자열 입력 ... 일반 사용자
 *   2) 서버에서 전송되는 데이터를 출력
 *      ------------------------ 쓰레드
 */

public class NetworkMain extends JFrame implements ActionListener,Runnable,MouseListener{
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	Login login = new Login();
	JLabel logo;
	
	
	MusicSystem ms = new MusicSystem();
	// 네트워크 관련 클래스
	// 서버연결 => 연결기기
	Socket s; // 서버에 메모리 연결
	// 서버에서 보내준 값을 받는다
	BufferedReader in;
	// 서버로 값을 전송
	OutputStream out;
	// ID 저장
	String myId;
	// 테이블 선택 인덱스 번호
	int selectRow=-1; // 선택이 안됐을때
	// 쪽지보내기
	SendMessage sm = new SendMessage();
	RecvMessage rm = new RecvMessage();
	
	// 페이지 지정
	int curpage=1;
	int totalpage=0;
	
	public NetworkMain()
	{
		
		mp=new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // Layout 없이 직접 배치
		logo= new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("C:\\java_datas\\KakaoTalk_20230504_123706324.PNG"), 200, 130);
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(10, 15, 200, 130);
		mp.setBounds(10, 150, 200, 300);
		cp.setBounds(220, 15, 750, 780);
		tp.setBounds(980, 15, 200, 730);
		
		setLayout(null);
		b1=new JButton("홈");
		b2=new JButton("뮤직검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스검색");
		b5=new JButton("뮤직추천");
		mp.setLayout(new GridLayout(5, 1, 10, 10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		// 추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		// 윈도우 크기
		setSize(1200, 1000);
//		setVisible(true);
		// 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		// 로그인
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
		
		
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		//Homepage
		totalpage= ms.musicTotalPage();
		cp.hp.b1.addActionListener(this); // 이전
		cp.hp.b2.addActionListener(this); // 다음
		cp.hp.pageLa.setText(curpage+" page/"+totalpage+" pages");
		
		cp.cp.b1.addActionListener(this);
		cp.cp.b2.addActionListener(this);
		cp.cp.table.addMouseListener(this);
		
		// 쪽지보내기
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
		
		
	}
	public void musicDisplay() {
		List<GenieMusicVO> list=ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ms.musicTotalPage();
		cp.hp.pageLa.setText(curpage+" page /"+totalpage+"pages");
		
	}
	public static void main(String[] args) {
		new NetworkMain();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			curpage=1;
			cp.card.show(cp,"home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp,"find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp,"chat");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp,"news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp,"recommand");
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 데이터 읽기
			String id = login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하시오");
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름 입력하시오");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버로 전송
			try
			{
				s= new Socket("localhost",33333);
				//읽는 위치 / 쓰는 위치
				in= new BufferedReader(new InputStreamReader(s.getInputStream()));
				// s는 서버 메모리 => 서버메모리로부터 값을 읽어 온다.
				out=s.getOutputStream();
				// 서버에서 읽어 갈 수 있게 메모리에 저장
				
				// 서버로 로그인 요청
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
				
			}catch(Exception ex) {}
			// 서버로부터 전송된 값을 받아 온다.
			new Thread(this).start(); // run() 호출
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			// 서버로 전송
			try 
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch (Exception ex) {}
			cp.cp.tf.setText("");
			
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.cp.b2)
		{
			// 정보보기
			if(selectRow==-1)
			{
				JOptionPane.showMessageDialog(this, "정보를 볼 대상을 선택하세요");
				return;
			}
			// 선택된 경우
			String youId=cp.cp.table.getValueAt(selectRow, 0).toString();
			try
			{
				// 선택된 아이디의 정보를 보여달라고 서버에 요청
				out.write((Function.INFO+"|"+youId+"\n").getBytes());
//				--------- 서버 요청 ==> \n이 반드시 포함되어야 한다.
				// 처리 => 서버 => 결과값을 받아서 클라이언트에서 출력
			}catch(Exception ex) {}
		}
		else if(e.getSource()==cp.cp.b1)
		{
			// 쪽지보내기
			sm.ta.setText("");
			String youId=cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		// 쪽지보내기 관련
		else if(e.getSource()==sm.b2)
		{
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b2)
		{
			rm.setVisible(false);
		}
		else if(e.getSource()==sm.b1)
		{
			String youId = sm.tf.getText();
			String msg = sm.ta.getText();
			if(msg.length()<1)
			{
				sm.ta.requestFocus();
				return;
			}
			try
			{
				out.write((Function.MSGSEND+"|"+youId+"|"+msg+"\n").getBytes());
				//youID를 찾아서  msg를 보내주는 기능 수행
			}catch(Exception ex) {}
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b1)
		{
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		}
	}

	// 서버에서 결과값을 받아서 출력 => 쓰레드(자동화)
	// member.jsp
	//    100
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg= in.readLine();
				// 서버에서 보낸값
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				// 100|id|name|sex
				switch(protocol) 
				{
					// LOGIn => 테이블에 정보를 출력한다.
					case Function.LOGIN:
					{
						String[] data = { st.nextToken(),
								st.nextToken(),
								st.nextToken()};
						cp.cp.model.addRow(data);
					}
					break;
					// C/S => 모든 명령이 서버로부터 받아서 처리
					// MYLOG => 로그인 종료하고 메인창을 보여준다.
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						myId=st.nextToken();
						login.setVisible(false);
						setVisible(true);
					}
					break;
					case Function.CHAT:
					{
						cp.cp.initStyle();
						cp.cp.append(st.nextToken(), st.nextToken());
						//            채팅문자열           색상
						
					}
					break;
					case Function.INFO:
					{
						String data="아이디 : "+st.nextToken()+"\n"+"이름 : "+st.nextToken()+"\n"+"성별 : "+st.nextToken();
						JOptionPane.showMessageDialog(this, data);
					}
					break;
					case Function.MSGSEND:
					{
						String id= st.nextToken();
						String strMsg = st.nextToken();
						rm.tf.setText(id);
						rm.ta.setText(strMsg);
						rm.setVisible(true);
					}
					break;
				}
			}
		}catch(Exception ex) {}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.cp.table)
		{
			//if(e.getClickCount()==2) // 더블 클릭
			//{
				selectRow = cp.cp.table.getSelectedRow();
				String id = cp.cp.table.getValueAt(selectRow, 0).toString();
//				JOptionPane.showMessageDialog(this, "선택된 ID : "+id);
				if(id.equals(myId))
				{
					cp.cp.b1.setEnabled(false);
					cp.cp.b2.setEnabled(false);
				}
				else
				{
					cp.cp.b1.setEnabled(true);
					cp.cp.b2.setEnabled(true);
				}
			//}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
