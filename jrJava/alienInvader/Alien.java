package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Alien {

	public static final int WIDTH, HEIGHT;
	
	private int x, y; // center, bottom
	private int vx, vy; // vy>0
	private Color bodyColor, eyeColor;
	private static final int eyeRadius;

	private boolean collided;
	private static Color explosionColor;
	private static int explosionRadius;


	static{
		
		WIDTH = 25;
		HEIGHT = 25;
		eyeRadius = 3;

		explosionColor = Color.magenta;
		explosionRadius = 80;
	}

	public Alien(int x, int y, int vx, int vy, Color bodyColor, Color eyeColor){
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.bodyColor = bodyColor;
		this.eyeColor = eyeColor;
	}


	public int getX(){ return x; }
	public int getY(){ return y; }
	
	
	
	public boolean isHit(Torpedo torpedo){

		// Perform the collision logic,
		// if collision happens,
		// Shootee should die.
		// return true;

		if(torpedo.getX()>x-WIDTH/2-Torpedo.WIDTH/2 &&
				torpedo.getX()<x+WIDTH/2+Torpedo.WIDTH/2 &&
				torpedo.getY()>y-HEIGHT-Torpedo.HEIGHT &&
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

			canvas.setColor(bodyColor);
			canvas.drawRect(x-WIDTH/2, y-HEIGHT, WIDTH, HEIGHT);
			canvas.setColor(eyeColor);
			canvas.fillOval(x-WIDTH/4-eyeRadius, y-HEIGHT*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius); 
			canvas.fillOval(x+WIDTH/4-eyeRadius, y-HEIGHT*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius); 
		}
	}

}













