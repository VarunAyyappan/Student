package jrJava.memoryCardGame3;

import java.util.Scanner;

import javax.swing.ImageIcon;

public class Coordinator {

	public static boolean gameOver;
	
	public static void main(String[] args) {

		gameOver = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many cards?");
		int numberOfCards = scanner.nextInt();
		System.out.println("Column number?");
		int columnNumber = scanner.nextInt();
		
		//System.out.println("main() point 1: "+ Thread.currentThread().getId());
		CardManager cardManager = new CardManager(numberOfCards, columnNumber);
		int screenWidth = columnNumber*Card.getSize() + 50 + 50;
		int screenHeight = cardManager.getRowNumber()*Card.getSize() + 50 + 50;
		
		DrawingPanel panel = new DrawingPanel("Memory Card Game", 200, 0, screenWidth, screenHeight);
		//System.out.println("main() point 2: "+ Thread.currentThread().getId());

		
		panel.addMouseListener(cardManager); 
		
		panel.setCardManager(cardManager);
		panel.repaint();
		
		while(!gameOver){ 
			
			cardManager.applyGameLogic();
			
			if(cardManager.getNeedRepaint())
				panel.repaint();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		panel.repaint();
		
	}

}


















