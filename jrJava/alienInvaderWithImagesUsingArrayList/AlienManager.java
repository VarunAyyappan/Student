package jrJava.alienInvaderWithImagesUsingArrayList;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import resources.DrawingBoard;


public class AlienManager {

	private static ArrayList<Alien> aliens;
	private static int boundaryY = (int)(Coordinator.SCREEN_HEIGHT*0.90);
	
	private static Image[] images1, images2;
	
	
	static {
		aliens = new ArrayList<Alien>();
		
		images1 = new Image[3];
		images2 = new Image[3];
		
		images1[0] = new ImageIcon(Coordinator.RESOURCE_PATH + "greenAlien_1.png").getImage();
		images2[0] = new ImageIcon(Coordinator.RESOURCE_PATH + "greenAlien_2.png").getImage();
		images1[1] = new ImageIcon(Coordinator.RESOURCE_PATH + "blueAlien_1.png").getImage();
		images2[1] = new ImageIcon(Coordinator.RESOURCE_PATH + "blueAlien_2.png").getImage();
		images1[2] = new ImageIcon(Coordinator.RESOURCE_PATH + "orangeAlien_1.png").getImage();
		images2[2] = new ImageIcon(Coordinator.RESOURCE_PATH + "orangeAlien_2.png").getImage();
	}
	
	
	public static void draw(DrawingBoard board){
		for(int i=0; i<aliens.size(); i++){
			aliens.get(i).draw(board);
		}
	}
	
	
	public static boolean isHit(Torpedo torpedo){
		for(int i=0; i<aliens.size(); i++){
			if(aliens.get(i).isHit(torpedo)) return true;
		}
		return false;
	}
	
	
	public static void create(){
		int x = (int)(Coordinator.SCREEN_WIDTH*Math.random());
		int vx = (int)(Math.random()*10-5);
		int vy = (int)(4 + Math.random()*6);
		
		int imageIndex = (int)(Math.random()*images1.length);
		add( new Alien(x, -10, vx, vy, images1[imageIndex], images2[imageIndex] ));	
	}
	
	
	
	public static void move(Ship ship){
		
		if(Math.random()>0.95) create();
		
		// walk backward
		Alien each;
		for(int i=aliens.size()-1; i>=0; i--){
			each = aliens.get(i);
			each.move(ship);
			if(each.getY()>boundaryY){
				remove(i);
			}
		}
	}
	
	
	public static void add(Alien alien){
		aliens.add(alien);
	}
	
	
	
	public static void remove(int index){
		aliens.remove(index);
	}
	
	
	
	public static void remove(Alien alien){
		aliens.remove(alien);
	}
	
	
	
}
