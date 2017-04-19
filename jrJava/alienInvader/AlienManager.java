package jrJava.alienInvader;

import java.awt.Color;

import resources.DrawingBoard;

public class AlienManager {

	private static int maxNumber = 30; // the length of the array
	private static int size; // the number of live aliens.
	private static Alien[] aliens;
	private static int boundaryY = (int)(Coordinator.SCREEN_HEIGHT*0.90);
	
	
	static {
		aliens = new Alien[maxNumber];
	}
	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<size; i++){
			aliens[i].draw(board);
		}
	}
	
	
	public static boolean isHit(Torpedo torpedo){
		for(int i=0; i<size; i++){
			if(aliens[i].isHit(torpedo)) return true;
		}
		return false;
	}
	
	
	public static void create(){
		int x = (int)(Coordinator.SCREEN_WIDTH*Math.random());
		int vx = (int)(Math.random()*10-5);
		int vy = (int)(4 + Math.random()*6);
		Color bodyColor = new Color((int)(Math.random()*256) , (int)(Math.random()*256) ,  (int)(Math.random()*256));
		
		int grayScale = (int)(Math.random()*100);
		Color eyeColor = new Color( grayScale, grayScale, grayScale);
		add( new Alien(x, -10, vx, vy, bodyColor, eyeColor) );
		
	}
	
	
	
	public static void move(Ship ship){
		
		if(Math.random()>0.95) create();
		
		
		// walk backward
		for(int i=size-1; i>=0; i--){
			aliens[i].move(ship);
			if(aliens[i].getY()>boundaryY){
				remove(i);
			}
		}
		
		
		/* walk forward
		for(int i=0; i<size; i++){
			aliens[i].move();
			if(aliens[i].getY()<boundaryY){
				remove(i);
				i--; // rewind the index
			}
		}
		*/
	}
	
	
	public static void add(Alien alien){
		if(size==maxNumber) return;
		aliens[size] = alien;
		size++;
	}
	
	
	
	public static void remove(int index){
		for(int i=index+1; i<size; i++){
			aliens[i-1] = aliens[i];
			if(i==size-1) aliens[i] = null;
		}
		size--;
	}
	
	
	
	public static void remove(Alien alien){
		for(int i=0; i<size; i++){
			if(aliens[i]==alien){
				remove(i);
			}
		}
	}
	
	
	
}
