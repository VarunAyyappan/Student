package jrJava.objectInteraction;

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
		b2.setAll(500, 300, -4, 3, 80, Color.green);
		
		Ball b3;
		b3 = new Ball();
		b3.setAll(300, 400, -3, -3, 120, Color.orange);
		
		b1.setBalls(b2, b3);
		b2.setBalls(b1, b3);
		b3.setBalls(b1, b2);
		
		Wall wall = new Wall();
		
		b1.setWall(wall);
		b2.setWall(wall);
		b3.setWall(wall);
		
		DrawingBoard board = new DrawingBoard(800, 600);
		Timer timer = new Timer();
		
		
		while(true){
			
			b1.move();
			b2.move();
			b3.move();
			
			b1.change();
			b2.change();
			b3.change();
			//wall.change();
			
			board.clear();
			wall.draw(board); 
			b1.draw(board);
			b2.draw(board);
			b3.draw(board);
			
			board.repaint();
			timer.pause(20); 
			
		}
		
	}

}









