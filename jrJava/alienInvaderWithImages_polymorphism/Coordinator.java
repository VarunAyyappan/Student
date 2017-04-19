package jrJava.alienInvaderWithImages_polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;
import resources.Timer;


public class Coordinator {

	public static final String RESOURCE_PATH = "jrJava/alienInvaderWithImages/ImagesAndSounds/";
	
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
		
		board.setBackgroundImage(RESOURCE_PATH + "bg.png");
		
		new SoundPlayer(RESOURCE_PATH + "bgMusic.wav").playLoop();
		
		
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
		
		
		Image gameOverImage = new ImageIcon(RESOURCE_PATH + "gameOver.png").getImage();
		Graphics2D canvas = board.getCanvas();
		int xPos = SCREEN_WIDTH/2 - gameOverImage.getWidth(null)/2;
		int yPos = SCREEN_HEIGHT/2 - gameOverImage.getHeight(null)/2;
		canvas.drawImage(gameOverImage, xPos, yPos, null);
		board.repaint();
	}
}










