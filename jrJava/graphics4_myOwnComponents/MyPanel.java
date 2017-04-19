package jrJava.graphics4_myOwnComponents;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class MyPanel extends JPanel {

	
	public void paintComponent(Graphics g){
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(0,  0, getWidth(), getHeight()); 
		
		g.setColor(Color.blue);
		g.drawLine(0,  0, getWidth(), getHeight()); 
		g.drawLine(0,  getHeight(), getWidth(), 0); 
		
		g.setColor(Color.red);
		g.fillOval(100, 100, 100, 100); 
	}
	
}
