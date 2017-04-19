package jrJava.objectInteraction_wp;

import java.awt.Color;

import resources.DrawingBoard;
import resources.Timer;

public class Test2 {

	public static void main(String[] args) {
		
		Ball b1;
		b1 = new Ball();
		b1.setAll(100, 200, 5, -2, 50, Color.red); 
		
		Ball b2;
		b2 = new Ball();
		b2.setAll(500, 300, -4, 3, 80, Color.blue);
		
		Wall wall = new Wall();
		
		b1.wall = wall;
		b2.wall = wall;
		
		DrawingBoard board = new DrawingBoard(800, 600);
		Timer timer = new Timer();
		
		
		while(true){
			
			b1.move();
			b2.move();
			b1.grow();
			b2.shrink();
			
			board.clear();
			wall.draw(board); 
			b1.draw(board);
			b2.draw(board);
			
			board.repaint();
			timer.pause(20); 
			
		}
		
	}

}









