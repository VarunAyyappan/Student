package jrJava.graphics4_myOwnComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MyButton extends JButton {

	//public MyButton(String text){
	//	super(text);
	//}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.green);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.red);
		g.drawString("Haha", 20, 25); 
		
		Image image = new ImageIcon("jrJava/graphics1/orangeAlien_1.png").getImage();
		g.drawImage(image, 60, 4, image.getWidth(null)/2, image.getHeight(null)/2, null);
	}
	
	
	//public void paintBorder(Graphics g){
	//	g.setColor(Color.darkGray);
	//	g.drawRect(0, 0, getWidth()-1, getHeight()-1);
	//}
	
	
}
 