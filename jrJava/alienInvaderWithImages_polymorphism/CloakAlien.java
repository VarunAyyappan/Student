package jrJava.alienInvaderWithImages_polymorphism;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Image;
import resources.DrawingBoard;


public class CloakAlien extends SimpleAlien {

	protected int cloakBegin = 0;
	protected int cloakComplete = (int)(0.4*Coordinator.SCREEN_HEIGHT);
	protected int cloakStop = (int)(0.7*Coordinator.SCREEN_HEIGHT);
	
	
	public CloakAlien(int x, int y, int vx, int vy, Image image1, Image image2) {
		super(x, y, vx, vy, image1, image2);
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
			
			Composite original = canvas.getComposite();
			
			float alpha = 1.0f;
			
			if(y>=cloakBegin && y<cloakComplete) alpha = 1.0f - ((float)y-cloakBegin)/(cloakComplete-cloakBegin);
			else if(y>=cloakComplete && y<cloakStop) alpha = 0.0f;
			else alpha = 1.0f;
			
			Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha); 
			canvas.setComposite(comp);
			
			numOfDraw++;
			if(numOfDraw%6<3) canvas.drawImage(image1, x-width/2, y-height, null);
			else canvas.drawImage(image2, x-width/2, y-height, null);
			
			canvas.setComposite(original);
		}
	}
}






