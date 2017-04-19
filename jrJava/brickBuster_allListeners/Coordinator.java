package jrJava.brickBuster_allListeners;

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
		Ball ball1 = new Ball(300, 500, 17, -19, 10, Color.red);
		Ball ball2 = new Ball(300, 500, -15, -17, 10, Color.green);
		Ball ball3 = new Ball(300, 500, 14, -15, 10, Color.blue);
		
		// create deflector
		Deflector deflector = new Deflector(80, 610);
		ball1.setDeflector(deflector); 
		ball2.setDeflector(deflector); 
		ball3.setDeflector(deflector); 
		
		board.addMouseMotionListener(deflector);
		board.addMouseListener(deflector); 
		board.getJFrame().addKeyListener(deflector); 
		
		// create wall
		Wall wall = new Wall();
		deflector.setWall(wall); 
		ball1.setWall(wall); 
		ball2.setWall(wall); 
		ball3.setWall(wall); 
		
		while(true){
			
			ball1.move();
			ball2.move();
			ball3.move();
			
			board.clear();
			
			ball1.draw(board);
			ball2.draw(board);
			ball3.draw(board);
			
			deflector.draw(board);
			wall.draw(board);
			
			board.repaint();
			timer.pause(30);
			
		} 
		
	}

	
}
