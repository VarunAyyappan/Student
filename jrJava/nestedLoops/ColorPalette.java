package jrJava.nestedLoops;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;
import resources.Timer;

public class ColorPalette {

	public static void main(String[] args) {

		int tileSize = 10;
		int tileNumbers = 60;
		int margin = 50;

		Timer timer = new Timer();
		DrawingBoard board = new DrawingBoard(tileSize*tileNumbers + 2*margin, tileSize*tileNumbers + 2*margin);
		Graphics2D canvas = board.getCanvas();
		
		for(int j=0; j<tileNumbers; j++){
			for(int i=0; i<tileNumbers; i++){
			
				Color color = new Color(255-4*i, 4*j, 4*i);
				canvas.setColor(color);
				canvas.fillRect(margin + tileSize*i, margin + tileSize*j, tileSize, tileSize);
				canvas.setColor(Color.white);
				canvas.drawRect(margin + tileSize*i, margin + tileSize*j, tileSize, tileSize);
				board.repaint();
				timer.pause(10);
			}
		}
 
	
	}

}










