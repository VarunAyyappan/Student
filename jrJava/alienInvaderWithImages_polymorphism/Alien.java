package jrJava.alienInvaderWithImages_polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import resources.DrawingBoard;

public abstract class Alien {

	protected int x, y; // center, bottom
	protected int vx, vy; // vy>0
	protected Image image1, image2;
	protected int width, height;
	protected boolean collided;
	protected static Color explosionColor;
	protected static int explosionRadius;
	
	

	static{
		explosionColor = Color.magenta;
		explosionRadius = 80;
	}

	public Alien(int x, int y, int vx, int vy, Image image1, Image image2){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.image1 = image1;
		this.image2 = image2;
		
		width = image1.getWidth(null);
		height = image1.getHeight(null);
	}


	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getWidth(){ return width; }
	public int getHeight(){ return height; }
	
	
	public boolean isHit(Torpedo torpedo){

		// Perform the collision logic,
		// if collision happens,
		// Shootee should die.
		// return true;

		if(torpedo.getX()>x-width/2-Torpedo.WIDTH/2 &&
				torpedo.getX()<x+width/2+Torpedo.WIDTH/2 &&
				torpedo.getY()>y-height-Torpedo.HEIGHT &&
				torpedo.getY()<y ){

			AlienManager.remove(this); 
			return true;
		}

		return false;
	}


	public abstract void move(Ship ship);

	public abstract void shootMissile();

	public abstract void draw(DrawingBoard board);

}













