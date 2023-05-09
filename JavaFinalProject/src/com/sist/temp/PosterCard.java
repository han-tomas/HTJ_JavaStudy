package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.commons.ImageChange;
import com.sist.manager.GenieMusicVO;
public class PosterCard extends JPanel {
	JLabel poLa = new JLabel(); // 이미지 출력
	JLabel tLa = new JLabel(); // 제목 출력
	// 초기화
	public PosterCard(GenieMusicVO vo)
	{
		setLayout(null);
		poLa.setBounds(5, 5, 150, 120);
		tLa.setBounds(5, 125, 150, 30);
		
		add(poLa);
		add(tLa);
		
		try
		{
			URL url = new URL("http:"+vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 150, 120);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		}catch(Exception ex) {}
	}
}
