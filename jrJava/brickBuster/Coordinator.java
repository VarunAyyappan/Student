package jrJava.brickBuster;

import java.awt.Color;

import javax.swing.JFrame;

import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	
	public static void main(String[] args) {
		
		// prepare the DrawingBoard and Timer.
		DrawingBoard board = new DrawingBoard(570, 700);
		Timer timer = new Timer();
		
		// create balls.
		// ball1, ball2, ball3, ...
		Ball ball = new Ball(300, 500, 7, -9, 10, Color.red);
		
		// create bricks
		// brick1, brick2, brick3, ... 
		
		// create deflector
		Deflector deflector = new Deflector(80, 610);
		ball.setDeflector(deflector); 
		
		JFrame frame = board.getJFrame();
		frame.addKeyListener(deflector); 
		
		// create wall
		Wall wall = new Wall();
		deflector.setWall(wall); 
		ball.setWall(wall); 
		
		
		while(true){
			
			ball.move();
			//ball1.move();
			//ball2.move();
			//...
			
			board.clear();
			ball.draw(board);
			//ball1.draw(board);
			//ball2.draw(board);
			//...
			
			deflector.draw(board);
			wall.draw(board);
			
			board.repaint();
			timer.pause(30);
			
		}
		
	}

	
}
