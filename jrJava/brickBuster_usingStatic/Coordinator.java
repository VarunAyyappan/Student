package jrJava.brickBuster_usingStatic;

import java.awt.Color;

import javax.swing.JFrame;

import resources.DrawingBoard;
import resources.Timer;

public class Coordinator {

	private static int screenWidth = 570;
	private static int screenHeight = 700;
	
	
	public static void main(String[] args) {
		
		// prepare the DrawingBoard and Timer.
		DrawingBoard board = new DrawingBoard(screenWidth, screenHeight);
		Timer timer = new Timer();
		
		// create balls.
		Ball[] balls = new Ball[10];
		
		for(int i=0; i<balls.length; i++){
			Color ballColor = new Color((int)(Math.random()*150), (int)(Math.random()*150), (int)(Math.random()*150));
			balls[i] = new Ball(300, 500, (int)(Math.random()*6+3), -(int)(Math.random()*9+2), ballColor);
		}
		
		// create deflector
		Deflector deflector = new Deflector(80, 610);
		
		board.addMouseMotionListener(deflector);
		board.addMouseListener(deflector); 
		
		// create wall
		
		int numOfColumns = 10;
		
		System.out.println("before");
		int brickWidth = (Wall.getRight()-Wall.getLeft())/numOfColumns;
		System.out.println("after");
		
		int brickHeight = brickWidth/5;
		BrickManager[] brickManagers = new BrickManager[numOfColumns];
		
		for(int i=0; i<brickManagers.length; i++){
			brickManagers[i] = new BrickManager(Wall.getLeft()+brickWidth*i, Wall.getTop(), brickWidth, brickHeight, (int)(Math.random()*31+5) );
		}
		
		for(int i=0; i<balls.length; i++){
			balls[i].setDeflector(deflector); 
			balls[i].setBrickManagers(brickManagers); 
		}
		
		
		int count = 0;
		while(true){
			
			count++;
			if(count%10==0) Ball.changeRadius();
			
			
			for(int i=0; i<balls.length; i++) balls[i].move();
			
			board.clear();
			
			for(int i=0; i<balls.length; i++) balls[i].draw(board);
			
			for(int i=0; i<brickManagers.length; i++) brickManagers[i].draw(board); 
			
			deflector.draw(board);
			Wall.draw(board);
			
			board.repaint();
			timer.pause(20);
		}
		
	}
	
}
