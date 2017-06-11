package jrJava.memoryCardGame;

import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Coordinator {

	
	public static void main(String[] args) {
		
		DrawingPanel panel = 
		new DrawingPanel("Memory Card Game", 200, 50, 500, 500);
		
		Card card = 
		new Card(new ImageIcon("jrJava/memoryCardGame/hockey_stick.png").getImage(), 
		200, 200);
		
		card.show();
		panel.setCard(card); 
		panel.repaint();
		
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("Type in 1(show), 2(hide), 3(appear), 4(disappear). Press ENTER:");
			int typed = scanner.nextInt();
			
			if(typed==1){
				card.setUnMatched();
				card.show();
			}
			else if(typed==2){
				card.setUnMatched();
				card.hide();
			}
			else if(typed==3){
				card.setUnMatched();
			}
			else if(typed==4){
				card.setMatched();
			}
			
			panel.repaint();
		}
		
	}

}










