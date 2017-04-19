package jrJava.objectInteraction;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;

public class Wall {

	private int left = 50;
	private int right = 750;
	private int top = 50;
	private int bottom = 550;
	private Color color = Color.darkGray;
	private int changeRate = 1;
	private int maxLeft = 180, minLeft = 50;
	
	
	public int getLeft(){ return left + 50; }
	public int getRight(){ return right - 50; }
	public int getTop(){ return top + 50; }
	public int getBottom(){ return bottom - 50; }
	
	
	public void change(){
		left += changeRate;
		right -= changeRate;
		top += changeRate;
		bottom -= changeRate;
		
		if(left<minLeft || left>maxLeft){
			changeRate = -changeRate;
		}
	}
	
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.drawRect(left, top, right-left, bottom-top); 
	}
	
}
