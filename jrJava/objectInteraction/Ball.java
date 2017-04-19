package jrJava.objectInteraction;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Ball {

	private int x = 100; // center
	private int y = 200; // center
	private int vx = 5;
	private int vy = -3;
	private int radius = 75;
	private Color color = Color.red;
	private Wall wall;
	private int changeRate = 1;
	private int maxRadius = 120, minRadius = 10;
	
	private Ball ob1, ob2;
	private boolean overlapped;
	
	
	public Ball(){
		System.out.println(radius);
	}
	 
	public Ball(int _x){
		x = _x;
	}
	
	public void setWall(Wall _wall){
		wall = _wall;
	}
	
	
	public void setBalls(Ball _ob1, Ball _ob2){
		ob1 = _ob1;
		ob2 = _ob2;
	}
	
	
	public int getX(){ return x; }
	public int getRadius(){ return radius; }
	public Color getColor(){ return color; }
	
	
	public void setX(int _x){
		x = _x;
	}
	
	
	public void setPosition(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	
	public void setAll(int _x, int _y, int _vx, int _vy, int _radius, Color _color){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		radius = _radius;
		color = _color;
	}
	
	
	
	public void move(){
		x = x + vx;
		y = y + vy;
		
		if(x<=wall.getLeft()+radius){
			x = wall.getLeft() + radius;
			vx = -vx;
		}
		else if(x>=wall.getRight()-radius){
			x = wall.getRight()-radius;
			vx = -vx;
		}
		
		if(y<=wall.getTop()+radius){
			y = wall.getTop()+radius;
			vy = -vy;
		}
		else if(y>=wall.getBottom()-radius){
			y = wall.getBottom()-radius;
			vy = -vy;
		}
		
		
		if(Math.sqrt((x-ob1.x)*(x-ob1.x) + (y-ob1.y)*(y-ob1.y)) < radius+ob1.radius ||
				Math.sqrt((x-ob2.x)*(x-ob2.x) + (y-ob2.y)*(y-ob2.y)) < radius+ob2.radius){
			overlapped = true;
		}
		else {
			overlapped = false;
		}
		
	}
	
	
	public void change(){
		radius += changeRate;
		if(radius<minRadius || radius>maxRadius){
			changeRate = -changeRate; //changeRate *= -1; changeRate = -1*changeRate;
		}
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		
		if(overlapped) {
			canvas.drawOval(x-radius, y-radius, 2*radius, 2*radius); 
		}
		else {
			canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius); 
		}
	}
	
}










