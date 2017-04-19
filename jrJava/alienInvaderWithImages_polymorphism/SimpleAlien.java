package jrJava.alienInvaderWithImages_polymorphism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import resources.DrawingBoard;

public class SimpleAlien extends Alien {

	protected int numOfDraw;
	

	static{
		explosionColor = Color.magenta;
		explosionRadius = 80;
	}

	public SimpleAlien(int x, int y, int vx, int vy, Image image1, Image image2){
		super(x, y, vx, vy, image1, image2);
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

		shootMissile();
		
		if(ship.isHit(this)){
			collided = true;
		}
	}


	public void shootMissile(){
		if(Math.random()<0.06) MissileManager.add( new Missile(x, y+10, 2*vy) );
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













