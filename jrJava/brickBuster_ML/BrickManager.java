package jrJava.brickBuster_ML;

import java.awt.Color;

import resources.DrawingBoard;

public class BrickManager {

	private Brick[] bricks;
	private int brickWidth;
	private int brickHeight;

	private int x, y; // top left corner of the brick column.
	private int numOfLiveBricks;


	// 1. create all bricks
	public BrickManager(int x, int y, int brickWidth, int brickHeight, int numOfBricks){
		this.x = x;
		this.y = y;
		this.brickWidth = brickWidth;
		this.brickHeight = brickHeight;
		this.numOfLiveBricks = numOfBricks;

		bricks = new Brick[numOfBricks];

		// create bricks
		boolean isLast = false;
		for(int i=0; i<bricks.length; i++){
			Color color = new Color( (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			if(i==bricks.length-1) isLast = true;
			bricks[i] = new Brick(x, y+brickHeight*i, brickWidth, brickHeight, color, isLast);
		}

	}


	// 2. use the bricks
	public void draw(DrawingBoard board){
		for(int i=0; i<numOfLiveBricks; i++){
			bricks[i].draw(board);
		}
	}
	
	
	public boolean isHit(Ball ball){
		for(int i=0; i<numOfLiveBricks; i++){
			if(bricks[i].isHit(ball)){
				
				// if it is the bottom one.
				if(i==numOfLiveBricks-1){
					bricks[i] = null;
					if(i>0) bricks[i-1].setAsBottomOne(); // problem spot. 
				}
				// if one of the middle bricks busted.
				else {
					for(int j=i+1; j<numOfLiveBricks; j++){
						bricks[j].shiftUp();
						bricks[j-1] = bricks[j];
					}
					bricks[numOfLiveBricks-1] = null;
				}
				
				numOfLiveBricks--;
				return true;
			}
		}
		
		return false;
	}
	
	
	// 3. destroy the bricks.

}













