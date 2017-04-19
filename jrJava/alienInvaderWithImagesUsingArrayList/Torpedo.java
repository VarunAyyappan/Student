package jrJava.alienInvaderWithImagesUsingArrayList;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;

public class Torpedo {

	public static final int WIDTH, HEIGHT;
	
	private int x, y; // center, top
	private int vy; // vy<0
	private static Image image;
	private boolean collidedWithAlien, collidedWithMissile;
	private static Color explosionColor;
	private static int explosionRadius;
	
	static{
		image = new ImageIcon(Coordinator.RESOURCE_PATH + "torpedo.png").getImage();
		WIDTH = image.getWidth(null);
		HEIGHT = image.getHeight(null);
		
		explosionColor = Color.orange;
		explosionRadius = 40;
	}
	
	
	public Torpedo(int x, int y, int vy){
		this.x = x;
		this.y = y;
		this.vy = vy;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	
	
	public void move(){
		y += vy;
		
		if(AlienManager.isHit(this)){
			//Coordinator.torpedo = null;
			collidedWithAlien = true;
		}
		else if(MissileManager.isHit(this)){
			//Coordinator.torpedo = null;
			collidedWithMissile = true;
		}
	}
	 
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		
		if(collidedWithAlien){
			canvas.setColor(explosionColor);
			canvas.fillOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			TorpedoManager.remove(this);
		}
		else if(collidedWithMissile){
			canvas.setColor(Color.pink);
			canvas.fillOval(x-explosionRadius/2, y-explosionRadius/2, explosionRadius, explosionRadius);
			TorpedoManager.remove(this);
		}
		else {
			canvas.drawImage(image, x-WIDTH/2, y, null);
		}
	}
	
}




 











