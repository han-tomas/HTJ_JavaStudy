package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;



public class ControlPenal extends JPanel {
	HomePanel hp = new HomePanel();
	FindPanel fp = new FindPanel();
	DetailPanel dp = new DetailPanel();
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	CardLayout card = new CardLayout();
	public ControlPenal() 
	{
//		setBackground(Color.orange);
		setLayout(card);
		add("home",hp);
		add("find",fp);
		add("detail",dp);
		add("news",np);
		add("chat",cp);
	}
}
