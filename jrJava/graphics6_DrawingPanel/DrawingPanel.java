package jrJava.graphics6_DrawingPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;


public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {
	
	private JFrame frame;
	
	private int prevX, prevY;
	private int currentX, currentY;
	
	
	public DrawingPanel(){
		frame = new JFrame("Animation");
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		frame.getContentPane().add(this); 
		
		frame.setVisible(true);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this); 
	}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.red);
		g.drawLine(prevX, prevY, currentX, currentY); 
	}


	public void mousePressed(MouseEvent e) {
		
	}
	
	
	public void mouseDragged(MouseEvent e) {
		prevX = currentX;
		prevY = currentY;
		
		currentX = e.getX();
		currentY = e.getY();
		
		this.repaint();
	}
	
	
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}
