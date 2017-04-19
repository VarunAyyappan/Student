package jrJava.alienInvader;

import resources.DrawingBoard;

public class MissileManager {
	
	private static int maxNumber = 200; // the length of the array
	private static int size; // the number of live missiles.
	private static Missile[] missiles;
	private static int boundaryY = (int)(Coordinator.SCREEN_HEIGHT*0.90);
	
	
	static {
		missiles = new Missile[maxNumber];
	}
	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<size; i++){
			missiles[i].draw(board);
		}
	}
	
	
	public static boolean isHit(Torpedo torpedo){
		for(int i=0; i<size; i++){
			if(missiles[i].isHit(torpedo)) return true;
		}
		return false;
	}
	
	
	public static void move(Ship ship){
		
		// walk backward
		for(int i=size-1; i>=0; i--){
			missiles[i].move(ship);
			if(missiles[i].getY()>boundaryY){
				remove(i);
			}
		}
		
		
		/* walk forward
		for(int i=0; i<size; i++){
			missiles[i].move();
			if(missiles[i].getY()<boundaryY){
				remove(i);
				i--; // rewind the index
			}
		}
		*/
	}
	
	
	public static void add(Missile missile){
		if(size==maxNumber) return;
		missiles[size] = missile;
		size++;
	}
	
	
	
	public static void remove(int index){
		for(int i=index+1; i<size; i++){
			missiles[i-1] = missiles[i];
			if(i==size-1) missiles[i] = null;
		}
		size--;
	}
	
	
	
	public static void remove(Missile missile){
		for(int i=0; i<size; i++){
			if(missiles[i]==missile){
				remove(i);
			}
		}
	}
	
	
}
