package jrJava.objectInteraction_wp;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class Ball {

	int x = 100; // center
	int y = 200; // center
	int vx = 5;
	int vy = -3;
	int radius = 75;
	Color color = Color.red;
	Wall wall;
	
	
	Ball(){
		System.out.println(radius);
	}
	 
	Ball(int _x){
		x = _x;
	}
	
	
	
	int getX(){ return x; }
	int getRadius(){ return radius; }
	Color getColor(){ return color; }
	
	
	void setX(int _x){
		x = _x;
	}
	
	
	void setPosition(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	
	void setAll(int _x, int _y, int _vx, int _vy, int _radius, Color _color){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		radius = _radius;
		color = _color;
	}
	
	
	
	void move(){
		x = x + vx;
		y = y + vy;
		
		if(x<=wall.left+radius){
			x = wall.left + radius;
			vx = -vx;
		}
		else if(x>=wall.right-radius){
			x = wall.right-radius;
			vx = -vx;
		}
		
		if(y<=wall.top+radius){
			y = wall.top+radius;
			vy = -vy;
		}
		else if(y>=wall.bottom-radius){
			y = wall.bottom-radius;
			vy = -vy;
		}
	}
	
	
	void grow(){
		radius++;
		if(radius>150) radius = 150;
	}
	
	
	void shrink(){
		radius--;
		if(radius<5) radius = 5;
	}
	
	
	
	void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius); 
	}
	
}










