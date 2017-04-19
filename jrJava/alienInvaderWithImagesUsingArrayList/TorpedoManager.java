package jrJava.alienInvaderWithImagesUsingArrayList;

import java.util.ArrayList;

import resources.DrawingBoard;


public class TorpedoManager {

	//private static int maxNumber = 5; // the length of the array
	//private static int size; // the number of live torpedoes.
	//private static Torpedo[] torpedoes;
	private static ArrayList<Torpedo> torpedoes;
	private static int boundaryY = (int)(Coordinator.SCREEN_HEIGHT*0.05);
	
	
	static {
		//torpedoes = new Torpedo[maxNumber];
		torpedoes = new ArrayList<Torpedo>();
	}

	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<torpedoes.size(); i++){
			torpedoes.get(i).draw(board);
		}
	}
	
	
	public static void move(){
		// walk backward
		Torpedo each;
		for(int i=torpedoes.size()-1; i>=0; i--){
			each = torpedoes.get(i);
			each.move();
			if(each.getY()<boundaryY){
				remove(i);
			}
		}
	}
	
	
	public static void add(Torpedo torpedo){
		torpedoes.add(torpedo);
	}
	
	
	
	public static void remove(int index){
		torpedoes.remove(index);
	}
	
	
	
	public static void remove(Torpedo torpedo){
		torpedoes.remove(torpedo);
	}
	
}







