package jrJava.looping;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;
import resources.Timer;

public class Practice5 {

	
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		DrawingBoard board = new DrawingBoard(800, 600);
		Graphics2D canvas = board.getCanvas();
		
		for(int i=0; i<=50; i=i+1){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(100 + 10*i, 100, 140, 140);
			board.repaint();
			timer.pause(30); 
		}
		
		for(int i=0; i<=30; i=i+1){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(600, 100+10*i, 140, 140);
			board.repaint();
			timer.pause(30); 
		}
		
		for(int i=50; i>=0; i=i-1){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(100 + 10*i, 400, 140, 140);
			board.repaint();
			timer.pause(30); 
		}
		
		for(int i=30; i>=0; i=i-1){
			board.clear();
			canvas.setColor(Color.red);
			canvas.fillOval(100, 100+10*i, 140, 140);
			board.repaint();
			timer.pause(30); 
		}
		
	}

}














