package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Torpedo {

	public static final int WIDTH, HEIGHT;
	
	private int x, y; // center, top
	private int vy; // vy<0
	private static Color color;
	private boolean collidedWithAlien, collidedWithMissile;
	private static Color explosionColor;
	private static int explosionRadius;
	
	static{
		WIDTH = 4;
		HEIGHT = 12;
		color = Color.blue;
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
			canvas.setColor(color);
			canvas.drawRect(x-WIDTH/2, y, WIDTH, HEIGHT);
		}
	}
	
}




 











