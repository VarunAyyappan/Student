package jrJava.alienInvaderWithImages;

import resources.DrawingBoard;


public class TorpedoManager {

	private static int maxNumber = 20; // the length of the array
	private static int size; // the number of live torpedoes.
	private static Torpedo[] torpedoes;
	private static int boundaryY = (int)(Coordinator.SCREEN_HEIGHT*0.05);
	
	
	static {
		torpedoes = new Torpedo[maxNumber];
	}
	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<size; i++){
			torpedoes[i].draw(board);
		}
	}
	
	
	public static void move(){
		
		// walk backward
		for(int i=size-1; i>=0; i--){
			torpedoes[i].move();
			if(torpedoes[i].getY()<boundaryY){
				remove(i);
			}
		}
		
		
		/* walk forward
		for(int i=0; i<size; i++){
			torpedoes[i].move();
			if(torpedoes[i].getY()<boundaryY){
				remove(i);
				i--; // rewind the index
			}
		}
		*/
	}
	
	
	public static void add(Torpedo torpedo){
		if(size==maxNumber) return;
		torpedoes[size] = torpedo;
		size++;
	}
	
	
	
	public static void remove(int index){
		for(int i=index+1; i<size; i++){
			torpedoes[i-1] = torpedoes[i];
			if(i==size-1) torpedoes[i] = null;
		}
		size--;
	}
	
	
	
	public static void remove(Torpedo torpedo){
		for(int i=0; i<size; i++){
			if(torpedoes[i]==torpedo){
				remove(i);
			}
		}
	}
	
}







