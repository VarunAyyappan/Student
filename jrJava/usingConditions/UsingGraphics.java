package jrJava.usingConditions;


import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;


public class UsingGraphics {

	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(800, 600);
		Graphics2D canvas = board.getCanvas();
		
		canvas.setColor(Color.red); 
		canvas.fillRect(100, 200, 150, 250);
		
		canvas.setColor(Color.blue);
		canvas.fillRect(400, 300, 200, 200);
		
		canvas.setColor(Color.green);
		canvas.fillOval(500, 50, 200, 100); 
		
		canvas.setColor(Color.black);
		canvas.drawOval(500, 50, 200, 100); 
		
		Color myColor = new Color(150, 150, 150);
		canvas.setColor(myColor);
		canvas.fillOval(100, 150, 400, 400);
		
		canvas.setColor(Color.darkGray);
		canvas.drawLine(10, 10, 790, 590); 
		
		board.repaint();
	}

}









