package jrJava.graphics6_DrawingPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;


public class DrawingPanel2 extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
	
	private JFrame frame;
	
	private int boxX1, boxX2, boxY1, boxY2;
	private int ballX, ballY, radius, vx, vy;
	private Color bgColor, boxColor, ballColor;
	
	private boolean mouseBusy;
	
	private JButton buttonFaster, buttonSlower;
	private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.CYAN, Color.ORANGE, Color.DARK_GRAY};
	private JButton[] colorButtons ;
	
	public DrawingPanel2(){
		bgColor = Color.WHITE;
		boxColor = Color.GRAY;
		ballColor = Color.GRAY;
		radius = 50;
		ballX = ballY = 250;
		vx = vy = 20;
		mouseBusy = true;
		
		frame = new JFrame("Animation");
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		frame.getContentPane().add(this);
		
		buttonFaster = new JButton("Faster");
		buttonFaster.setBounds(50, 20, 80, 20);
		add(buttonFaster);
		buttonFaster.addActionListener(this);
		
		buttonSlower = new JButton("Slower");
		buttonSlower.setBounds(150, 20, 80, 20);
		add(buttonSlower);
		buttonSlower.addActionListener(this);
		
		colorButtons = new JButton[colors.length];
		for(int i=0; i<colorButtons.length; i++) {
			colorButtons[i] = new JButton("c");
			colorButtons[i].setBounds(250+i*50, 20, 45, 20);
			this.add(colorButtons[i]);
			colorButtons[i].addActionListener(this);
			colorButtons[i].setForeground(colors[i]);
		}
		
		frame.setVisible(true);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this); 
	}
	
	
	public void paintComponent(Graphics g){
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(bgColor);
		g.drawRect(0, 0, getWidth(), getHeight());
		
		g.setColor(boxColor);
		g.drawRect(boxX1, boxY1, boxX2-boxX1, boxY2-boxY1); 
		
		g.setColor(ballColor);
		g.fillOval(ballX-radius, ballY-radius, radius*2, radius*2);
	}
	
	public boolean getMouseBusy() {
		return mouseBusy;
	}
	
	public void move() {
		ballX+=vx;
		ballY+=vy;
		
		if(ballX<=boxX1+radius) {
			ballX = boxX1+radius;
			vx = -vx;
		}
		else if(ballX>=boxX2-radius) {
			ballX = boxX2-radius;
			vx = -vx;
		}
		else if(ballY<=boxY1+radius) {
			ballY = boxY1+radius;
			vy = -vy;
		}
		else if(ballY>=boxY2-radius) {
			ballY = boxY2-radius;
			vy = -vy;
		}
	}
	
	public void mousePressed(MouseEvent e) {
		boxX1 = e.getX();
		boxY1 = e.getY();
		
		mouseBusy = true;
	}
	
	public void mouseReleased(MouseEvent e) {
		mouseBusy = false;
	}
	
	public void mouseDragged(MouseEvent e) {
		boxX2 = e.getX();
		boxY2 = e.getY();
	}
	
	
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(buttonFaster)) {
			if(vx>=0)
				vx++;
			else
				vx--;
			
			if(vy>=0)
				vy++;
			else
				vy--;
		}
		else if(e.getSource().equals(buttonSlower)) {
			if(vx>0)
				vx--;
			else if(vx<0)
				vx++;
			
			if(vy>0)
				vy--;
			else if(vy<0)
				vy++;
		}
		
		for(int i=0; i<colorButtons.length; i++) {
			if(e.getSource().equals(colorButtons[i])) {
				ballColor = colors[i];
				break;
			}
		}
	}

}

