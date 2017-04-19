package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import resources.DrawingBoard;


public class Deflector implements KeyListener {

	private int x, y; //left, top
	private int width = 100, height = 15;
	private Color color = Color.black;
	private Wall wall;
	
	
	
	public Deflector(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	
	public void setWall(Wall _wall){ wall = _wall; }
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getWidth(){ return width; }
	public int getHeight(){ return height; }
	
	
	public void keyPressed(KeyEvent e){
		
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_LEFT) x = x - 10;
		else if(keyCode==KeyEvent.VK_RIGHT) x = x + 10;
		
		if(x<wall.getLeft()) x = wall.getLeft();
		else if(x>wall.getRight()-width) x = wall.getRight()-width;
		
		//char typed = e.getKeyChar();
		//System.out.println(typed); 
		
		//System.out.println("inside keyPressed() method.");
	}
	
	public void keyTyped(KeyEvent e){
		//System.out.println("inside keyTyped() method.");
	}
	
	public void keyReleased(KeyEvent e){
		//System.out.println("inside keyReleased() method.");
	}
	
	
	public void draw(DrawingBoard board){
		Graphics2D canvas = board.getCanvas();
		canvas.setColor(color);
		canvas.fillRect(x, y, width, height);
	}

}









