package jrJava.objectInteraction_wp;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;

public class Wall {

	int left = 50;
	int right = 750;
	int top = 50;
	int bottom = 550;
	
	Color color = Color.darkGray;
	//Color fillColor;
	//int thickness;
	
	
	
	void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.drawRect(left, top, right-left, bottom-top); 
	}
	
}
