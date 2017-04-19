package jrJava.alienInvaderWithImages;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import resources.DrawingBoard;

public class Alien {

	private int x, y; // center, bottom
	private int vx, vy; // vy>0
	private Image image1, image2;
	private int width, height;
	private boolean collided;
	private static Color explosionColor;
	private static int explosionRadius;
	private int numOfDraw;
	

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


	public void move(Ship ship){
		x += vx;
		y += vy;

		if(Math.random()<0.06) MissileManager.add( new Missile(x, y+10, 2*vy) );
		
		if(ship.isHit(this)){
			collided = true;
		}
	}


	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();

		if(collided){
			canvas.setColor(explosionColor);
			canvas.fillOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			//Coordinator.missile = null;
			Coordinator.gameOver = true;
		}
		else {
			numOfDraw++;
			if(numOfDraw%6<3) canvas.drawImage(image1, x-width/2, y-height, null);
			else canvas.drawImage(image2, x-width/2, y-height, null);
		}
	}

}













