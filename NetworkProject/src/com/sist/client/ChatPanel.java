package com.sist.client;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
public class ChatPanel extends JPanel{
	JTextPane pane;
	JTextField tf;
	JButton b1,b2;
	JTable table; // 화면 UI
	DefaultTableModel model; // 데이터 관리

	JComboBox<String> box;

	public ChatPanel() {
//		setBackground(Color.green);
		pane = new JTextPane();
		pane.setEditable(false);
		JScrollPane js1 = new JScrollPane(pane);
		b1= new JButton("쪽지보내기");
		b2= new JButton("정보보기");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		tf= new JTextField();
		box=new JComboBox<String>();
		// red => 알림
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		// 테이블
		String[] col= {"아이디","이름","성별"};
		String[][] row= new String[0][3];
		model = new DefaultTableModel(row,col);
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		// 배치
		setLayout(null);
		js1.setBounds(2, 0, 1190, 805);
		tf.setBounds(2, 810, 1000, 30);
		box.setBounds(1010, 810, 180, 30);
		js2.setBounds(1205, 0, 290, 845);
		p.setBounds(520, 270, 230, 35);
		add(js1);
		add(tf); add(box);
		add(js2);
		add(p);
		String[] data= {"hong","홍길동","남자"};
		model.addRow(data);
		//이벤트
		
	}
	public void initStyle()
	{
		Style blue = pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style green = pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style pink = pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style yellow = pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style cyan = pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style orange = pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
		
	}
	public void append(String msg, String color)
	{
		try
		{
			Document doc = pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		}catch(Exception ex) {}
	}

}
