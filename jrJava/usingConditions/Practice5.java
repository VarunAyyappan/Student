package jrJava.usingConditions;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Scanner;

import resources.DrawingBoard;

public class Practice5 {

	
	public static void main(String[] args) {
			
		int xCenter;
		int yCenter;
		int radius;
		
		//Collect data (xCenter, yCenter, radius) from the user.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of center of the circle in integer.");
		xCenter = scanner.nextInt();
		System.out.println("Enter the y-coordinate of center of the circle in integer.");
		yCenter = scanner.nextInt();
		System.out.println("Enter the radius of the circle in integer.");
		radius = scanner.nextInt();
		
		
		//Draw the circle at that center location with the radius,
		//with the color based on the center.
		int screenWidth = 800;
		int screenHeight = 600;
		
		DrawingBoard board = new DrawingBoard(screenWidth, screenHeight);
		Graphics2D canvas = board.getCanvas();
		
		
		if(xCenter>=0 && xCenter<screenWidth/2 && yCenter>=0 && yCenter<screenHeight/2){
			canvas.setColor(Color.red);
		}
		else if(xCenter>=screenWidth/2 && xCenter<=screenWidth && yCenter>=0 && yCenter<screenHeight/2){
			canvas.setColor(Color.blue);
		}
		else if(xCenter>=0 && xCenter<screenWidth/2 && yCenter>=screenHeight/2 && yCenter<=screenHeight){
			canvas.setColor(Color.green);
		}
		else if(xCenter>=screenWidth/2 && xCenter<=screenWidth && yCenter>=screenHeight/2 && yCenter<=screenHeight){
			canvas.setColor(Color.orange);
		}
		else {
			canvas.setColor(Color.gray);
		}
		
		
		canvas.fillOval(xCenter-radius, yCenter-radius, 2*radius, 2*radius);
		
		canvas.setColor(Color.darkGray);
		canvas.drawLine(screenWidth/2, 0, screenWidth/2, screenHeight);
		canvas.drawLine(0, screenHeight/2, screenWidth, screenHeight/2);
		
		board.repaint();
	}
 
}








