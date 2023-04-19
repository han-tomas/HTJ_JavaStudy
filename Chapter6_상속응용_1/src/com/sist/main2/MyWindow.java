package com.sist.main2;
// 상속
import javax.swing.*;
import java.awt.*;
// 생성자, 초기블록, static => 상속 제외
public class MyWindow extends JFrame {
	
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	public MyWindow() //생성자 : 시작과 동시에 처리할 일이 있으면 사용 ==> ex) 자동 로그인
	{
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		tf= new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		setLayout(null);
		la1.setBounds(10, 15, 55, 30);
		la2.setBounds(10, 50, 55, 30);
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		add(la1);add(tf);
		add(la2);add(pf);
		add(p);
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow m = new MyWindow();

	}

}
