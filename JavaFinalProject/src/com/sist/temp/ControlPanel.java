package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	RecommandPanel rp = new RecommandPanel();
	HomePanel hp;
	CardLayout card = new CardLayout();
	DetailPanel dp;
	// 화면 이동
	public ControlPanel()
	{
		dp = new DetailPanel(this);
		hp= new HomePanel(this);
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("recommand",rp);
		add("detail",dp);
		
		
	}

}
