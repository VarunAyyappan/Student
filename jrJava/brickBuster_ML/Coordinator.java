package jrJava.brickBuster_ML;

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
		Ball[] balls = new Ball[10];
		
		for(int i=0; i<balls.length; i++){
			Color ballColor = new Color((int)(Math.random()*150), (int)(Math.random()*150), (int)(Math.random()*150));
			balls[i] = new Ball(300, 500, (int)(Math.random()*6+3), -(int)(Math.random()*9+2), 5, ballColor);
		}
		
		// create deflector
		Deflector deflector = new Deflector(80, 610);
		
		board.addMouseMotionListener(deflector);
		board.addMouseListener(deflector); 
		
		// create wall
		Wall wall = new Wall();
		deflector.setWall(wall); 
		
		int numOfColumns = 10;
		int brickWidth = (wall.getRight()-wall.getLeft())/numOfColumns;
		int brickHeight = brickWidth/5;
		BrickManager[] brickManagers = new BrickManager[numOfColumns];
		
		for(int i=0; i<brickManagers.length; i++){
			brickManagers[i] = new BrickManager(wall.getLeft()+brickWidth*i, wall.getTop(), brickWidth, brickHeight, (int)(Math.random()*31+5) );
		}
		
		for(int i=0; i<balls.length; i++){
			balls[i].setWall(wall); 
			balls[i].setDeflector(deflector); 
			balls[i].setBrickManagers(brickManagers); 
		}
		
		
		while(true){
			
			for(int i=0; i<balls.length; i++) balls[i].move();
			
			board.clear();
			
			for(int i=0; i<balls.length; i++) balls[i].draw(board);
			
			for(int i=0; i<brickManagers.length; i++) brickManagers[i].draw(board); 
			
			deflector.draw(board);
			wall.draw(board);
			
			board.repaint();
			timer.pause(20);
		}
		
	}
	
}
