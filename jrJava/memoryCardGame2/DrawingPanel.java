package jrJava.memoryCardGame2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel {

	private JFrame frame;
	
	private CardManager cardManager;
	
	
	public DrawingPanel(String title, int x, int y, int width, int height){
		
		System.out.println("DrawingPanel() point 1: "+ Thread.currentThread().getId());
		
		frame = new JFrame(title);
		frame.setBounds(x, y, width, height); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		
		frame.getContentPane().add(this); // default: it will into the center and take the whole space.
		
		frame.pack();
		frame.setVisible(true);
	}


	public void setCardManager(CardManager cardManager){ this.cardManager = cardManager; }
	
	
	public void paintComponent(Graphics g){
		
		//System.out.println("paintComponent(): "+ Thread.currentThread().getId());
		
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		g.setColor(Color.white);
		g.fillRect(0,  0, getWidth(), getHeight()); 
		
		//if(card!=null) card.draw(g);
		if(cardManager!=null) cardManager.draw(g);
	}
	
}




























