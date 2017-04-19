package jrJava.graphics5_twoThreads;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MyButton extends JButton {

	//public MyButton(String text){
	//	super(text);
	//}
	
	private int alienX = 60;
	
	private Color bgColor = Color.white;
	
	
	public void changeAlienPosition(){
		alienX++;
		if(alienX>80) alienX = 80;
	}
	
	
	public void changeColor(){
		if(bgColor.equals(Color.white)) bgColor = Color.pink;
		else if(bgColor.equals(Color.pink)) bgColor = Color.white;
	}
	
	
	public void paintComponent(Graphics g){
		
		if(getModel().isPressed()){
			g.setColor(Color.green);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.red);
			g.drawString("Ouch!", 20, 25); 
		}
		else if(getModel().isRollover()){
			g.setColor(Color.lightGray);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.red);
			g.drawString("Oh-oh", 20, 25); 
		}
		else {
			g.setColor(bgColor);
			g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(Color.red);
			g.drawString("Haha", 20, 25); 
		}
		
		
		Image image = new ImageIcon("jrJava/graphics1/orangeAlien_1.png").getImage();
		g.drawImage(image, alienX, 4, image.getWidth(null)/2, image.getHeight(null)/2, null);
	}
	
	
	//public void paintBorder(Graphics g){
	//	g.setColor(Color.darkGray);
	//	g.drawRect(0, 0, getWidth()-1, getHeight()-1);
	//}
	
	
}
 