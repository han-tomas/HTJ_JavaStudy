package com.sist.lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 라이브러리_Object_2_1 extends JFrame implements ItemListener{
	JComboBox box;//JComboBox클래스를 데이터형으로 사용
	JLabel la; //JLabel클래스를 데이터형으로 사용
	public 라이브러리_Object_2_1()
	{
		box = new JComboBox(); //클래스내에 메소드에 객체를 생성하는경우//JComboBox()의 객체 생성
		box.addItem("홍길동"); //JComboBox라는 클래스에 addItem()이라는 메소드 사용
		box.addItem("심청이");
		box.addItem("박문수");
		la=new JLabel(); //JLabel()의 객체 생성
		
		// 배치
		add("North",box);
		add("Center",la);
		
		setSize(300,300);
		setVisible(true);
		
		box.addItemListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_Object_2_1();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name =(String)box.getSelectedItem()/*.toString()*/;  // 리턴형이 오브젝트기 때문에 형변환이 필요
			// String name = String.valueOf(box.getSelectedItem());  ==> 총 3가지 방법
			la.setText(name);
		}
	}

}
