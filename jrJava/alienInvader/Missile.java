package jrJava.alienInvader;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Missile {

	public static final int WIDTH, HEIGHT;
	
	private int x, y; // center, bottom
	private int vy; // vy>0
	private static Color color;

	private boolean collided;
	private static Color explosionColor;
	private static int explosionRadius;
	
	
	static {
		WIDTH = 4;
		HEIGHT = 10;
		color = Color.red;
		explosionColor = Color.green;
		explosionRadius = 70;
	}


	public Missile(int x, int y, int vy){
		this.x = x;
		this.y = y;
		this.vy = vy;
	}

	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return WIDTH; }
	public static int getHeight(){ return HEIGHT; }
	

	public boolean isHit(Torpedo torpedo){
		if(torpedo.getX()>x-WIDTH/2-Torpedo.WIDTH/2 &&
		   torpedo.getX()<x+WIDTH/2+Torpedo.WIDTH/2 &&
		   torpedo.getY()>y-HEIGHT-Torpedo.HEIGHT &&
		   torpedo.getY()<y ){

			MissileManager.remove(this); 
			return true;
		}

		return false;
	}


	public void move(Ship ship){
		y += vy;
		
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
			canvas.setColor(color);
			canvas.drawRect(x-WIDTH/2, y-HEIGHT, WIDTH, HEIGHT);
		}
	}

}























