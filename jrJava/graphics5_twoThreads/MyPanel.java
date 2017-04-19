package jrJava.graphics5_twoThreads;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;


public class MyPanel extends JPanel {

	private int x = 0;
	private int y = 0;
	
	
	public void changeBoxLocation(){
		x++;
		y++;
	}
	
	
	public void paintComponent(Graphics g){
	
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//g.setColor(new Color(255, 255, 255));
		//g.fillRect(0,  0, getWidth(), getHeight()); 
		
		g.setColor(Color.red);
		g.drawOval(x, y, 100, 100); 
		
		
		g.drawOval(x, y, 200, 200); 
	}
	
}













