package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	CardLayout card = new CardLayout();
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	// 화면 이동
	public ControlPanel()
	{
		dp = new DetailPanel(this);
		hp= new HomePanel(this);
		bp= new BoardListPanel(this);
		ip= new BoardInsertPanel(this);
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("detail",dp);
		add("board",bp);
		add("insert",ip);
		
		
	}

}
