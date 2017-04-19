package jrJava.looping;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;
import resources.Timer;

public class Practice6 {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics2D canvas = board.getCanvas();
		
		for(int i=0; i<=60; i++){
			board.clear();
			canvas.setColor( new Color(255-4*i, 4*i, 0) );
			canvas.fillOval(100 + 5*i, 100 + 5*i, 10 + 3*i, 10 + 3*i);
			board.repaint();
			timer.pause(30);
		}

		for(int i=60; i>=0; i--){
			board.clear();
			canvas.setColor( new Color(255-4*i, 4*i, 0) );
			canvas.fillOval(100 + 5*i, 100 + 5*i, 10 + 3*i, 10 + 3*i);
			board.repaint();
			timer.pause(30);
		}
		
	}

}
