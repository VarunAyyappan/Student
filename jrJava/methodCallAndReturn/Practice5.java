package jrJava.methodCallAndReturn;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;
import resources.Timer;

public class Practice5 {

	
	public static void main(String[] args) {
		
	
		DrawingBoard board = new DrawingBoard(800, 600);
		Timer timer = new Timer();
		
		move(board, timer, Color.red, 80, 100, 100, 700, 650);
		move(board, timer, Color.red, 80, 700, 650, 400, -50);
		move(board, timer, Color.red, 80, 400, -50, 200, 620);
		move(board, timer, Color.red, 80, 200, 620, 810, 400);
		move(board, timer, Color.red, 80, 810, 400, 100, 100);
	}
	
	
	
	public static void move(DrawingBoard board, Timer timer, Color color, int radius, int x1, int y1, int x2, int y2){
		
		Graphics2D canvas = board.getCanvas();
		
		double dx = (x2-x1)/100.0; // ((double)x2-x1)/100.0;
		double dy = (y2-y1)/100.0; // ((double)y2-y1)/100.0;
		
		int xC, yC;
		
		for(int i=0; i<=100; i++){
			
			xC = (int)(x1 + dx*i);
			yC = (int)(y1 + dy*i);
			
			board.clear();
			canvas.setColor(color);
			canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
			board.repaint();
			timer.pause(20);
		}		
		
	}
	
	

}


















