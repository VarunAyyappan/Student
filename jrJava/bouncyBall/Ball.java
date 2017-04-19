package jrJava.bouncyBall;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.DrawingBoard;
import resources.SoundPlayer;

public class Ball {

	private int x = 100; // center
	private int y = 200; // center
	private int vx = 5;
	private int vy = -3;
	private int radius = 75;
	private Wall wall;
	private SoundPlayer sound;
	private Image image;
	
	
	public Ball(String imageFileName){
		sound = new SoundPlayer("jrJava/bouncyBall/boing.wav");
		ImageIcon icon = new ImageIcon("jrJava/bouncyBall/" + imageFileName);
		image = icon.getImage();
		radius = image.getWidth(null)/2;
	}
	 
	
	public void setWall(Wall _wall){
		wall = _wall;
	}
	
	
	public int getX(){ return x; }
	public int getRadius(){ return radius; }
	
	
	public void setX(int _x){
		x = _x;
	}
	
	
	public void setPosition(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	
	public void setAll(int _x, int _y, int _vx, int _vy){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
	}
	
	
	
	public void move(){
		x = x + vx;
		y = y + vy;
		
		if(x<=wall.getLeft()+radius){
			x = wall.getLeft() + radius;
			vx = -vx;
			sound.play();
		}
		else if(x>=wall.getRight()-radius){
			x = wall.getRight()-radius;
			vx = -vx;
			sound.play();
		}
		
		if(y<=wall.getTop()+radius){
			y = wall.getTop()+radius;
			vy = -vy;
			sound.play();
		}
		else if(y>=wall.getBottom()-radius){
			y = wall.getBottom()-radius;
			vy = -vy;
			sound.play();
		}
		
	}
	
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.drawImage(image, x-radius, y-radius, board);
	}
	
}














