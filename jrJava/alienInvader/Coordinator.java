package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;
import resources.Timer;


public class Coordinator {

	public static final int SCREEN_WIDTH, SCREEN_HEIGHT;
	public static boolean gameOver;
	
	
	static {
		SCREEN_WIDTH = 800;
		SCREEN_HEIGHT = 750;
	}
	
	
	public static void main(String[] args){
		
		DrawingBoard board = new DrawingBoard(SCREEN_WIDTH, SCREEN_HEIGHT);
		Timer timer = new Timer();
		
		Ship ship = new Ship(300, 610);
		
		board.addMouseListener(ship);
		board.addMouseMotionListener(ship);
		board.getJFrame().addKeyListener(ship); 
		
		
		
		while(!gameOver){
			
			board.clear();
			
			AlienManager.move(ship);
			AlienManager.draw(board); 
			
			TorpedoManager.move();
			TorpedoManager.draw(board); 
			
			MissileManager.move(ship);
			MissileManager.draw(board);
			
			ship.draw(board);
		
			board.repaint();
			timer.pause(30); 
		}
	}
}










