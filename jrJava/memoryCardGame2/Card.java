package jrJava.memoryCardGame2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Card {

	private static Image backImage;
	private static int size, padding, inset;
	private static Color borderColor, innerBorderColor;
	
	private Image image;
	private int x, y; // top, left corner
	private boolean matched; // show or not show at all.
	private boolean shouldReveal;  // front or back side.
	
	
	static {
		backImage = new ImageIcon("jrJava/memoryCardGame/backside.png").getImage();
		size = 100;
		padding = 5;
		inset = 10;
		borderColor = Color.lightGray;
		innerBorderColor = Color.black;
	}
	
	
	public Card(Image image, int x, int y){
		this.image = image;
		this.x = x;
		this.y = y;
	}
	
	
	public static int getSize(){ return size; }
	
	
	public boolean equals(Object o){
		Card theOtherCard = (Card) o;
		return image==theOtherCard.image;	
	}
	
	
	public void show(){ shouldReveal = true; }
	public void hide(){ shouldReveal = false;  }
	
	public void setMatched(){ matched = true;  }
	public boolean isMatched(){ return matched; }
	
	
	public boolean isSelected(int mx, int my){
		if(matched) return false;
		return mx>=x && mx<=x+size && my>=y && my<=y+size;
	}

	
	public void draw(Graphics g){
		if(matched) return;
		
		if(shouldReveal){
			g.drawImage(image, x+inset, y+inset, size-2*inset, size-2*inset, null);
		}
		else {
			g.drawImage(backImage, x+inset, y+inset, size-2*inset, size-2*inset, null);
		}
		
		g.setColor(borderColor);
		g.drawRect(x, y, size, size); 
		
		g.setColor(innerBorderColor);
		g.drawRect(x+padding, y+padding, size-2*padding, size-2*padding);
	}

}



 












