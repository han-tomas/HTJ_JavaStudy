package com.sist.client;

import java.awt.*; // Layout
import javax.swing.*; // window

import com.sist.commons.ImageChange;

import java.awt.event.*; 

public class NetworkMain extends JFrame implements ActionListener{
	MenuPenal mp;
	ControlPenal cp;
	SidePenal sp;
	JButton b1,b2,b3,b4,b5;
	Login login = new Login();
	JLabel logo;
	public NetworkMain()
	{
		mp = new MenuPenal();
		cp = new ControlPenal();
		sp = new SidePenal();
		
		setLayout(null);
		logo= new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("C:\\java_datas\\KakaoTalk_20230504_123706324.PNG"), 300, 250);
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(1550, 15, 300, 250);
		mp.setBounds(10, 15, 1500, 50);
		cp.setBounds(10, 75, 1500, 850);
		sp.setBounds(1550, 275, 300, 650);
		
		setLayout(null);
		b1=new JButton("영화 랭킹");
		b2=new JButton("검색");
		b3=new JButton("영화 상세 정보");
		b4=new JButton("영화 뉴스");
		b5=new JButton("채팅");
		mp.setLayout(new GridLayout(1, 5, 10, 10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		
		//추가
		add(mp);
		add(cp);
		add(sp);
		add(logo);
		// 윈도우 크기
		setSize(1900, 1000);
		// 윈도우를 보여준다
		//setVisible(true);	
		// 종료
		// X 클릭시 메모리 해제
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
		
	}

	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		
		new NetworkMain();
	}
	// 버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "detail");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp,"chat");
		}
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initStyle();
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			cp.cp.append(msg, color);
			
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==login.b1)
		{
			login.setVisible(false);
			setVisible(true);
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); // 프로그램 종료
		}
		
	}

}