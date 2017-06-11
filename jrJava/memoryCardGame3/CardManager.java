package jrJava.memoryCardGame3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class CardManager implements MouseListener {
	

	private Card[][] cards;
	private int row, col;
	private boolean oneSelected, twoSelected, threeSelected;
	private Card firstSelected, secondSelected, thirdSelected;
	private static SoundPlayer tick, chime, buzz;
	private boolean needRepaint;
	
	private int score;
	private Font font;
	
	private long timeThreeCardsSelected;
	
	
	private static String[] imageNames = { 
			"apple", "bank", "basketball", "bubble_blue", 
			"bubble_green", "bubble_red", "building", "cat",
			"cheese", "denture", "dog", "hockey_stick", 
			"keys", "phone", "pizza", "santa",
			"soccer_ball", "sock", "toilet_bowl", "toilet_paper",
			"xmas_tree"
	};
	
	static {
		tick = new SoundPlayer("jrJava/memoryCardGame2/tick.wav");
		chime = new SoundPlayer("jrJava/memoryCardGame2/chime.wav");
		buzz = new SoundPlayer("jrJava/memoryCardGame2/tick.wav");
	}
	
	public CardManager(int numberOfCards, int columnNumber){
		
		// If the card number is odd, make it even.
		numberOfCards = (numberOfCards+2)/3*3;
		if(numberOfCards>imageNames.length*3) numberOfCards = imageNames.length*3;
		
		col = columnNumber;
		row = numberOfCards/columnNumber + (numberOfCards%columnNumber==0? 0:1);
		//int row = numberOfCards/columnNumber + numberOfCards%columnNumber==0? 0:1; will be read as
		//int row = (numberOfCards/columnNumber + numberOfCards%columnNumber)==0? 0:1;
		
		int i, j;
		
		// Create two dimensional array.
		cards = new Card[row][];
		for(i=0; i<row; i++){
			if(i<row-1) cards[i] = new Card[col];
			else cards[i] = new Card[numberOfCards-(row-1)*col];
		}
		
		// Create Images.
		Image[] images = new Image[numberOfCards];
		Image each;
		for(i=0; i<numberOfCards/3; i++){
			each = new ImageIcon("jrJava/memoryCardGame2/" + imageNames[i] + ".png").getImage();
			images[i] = each;
			images[i + numberOfCards/3]= each;
			images[i + numberOfCards*2/3]= each;
		}
		
		// Random arrangement of images
		Image temp;
		int rand;
		for(i=0;i<images.length;i++) {
			rand = (int)(Math.random()*images.length);
			temp = images[rand];
			images[rand] = images[i];
			images[i] = temp;
		}
	
		// Create the card objects.
		int x, y;
		for(i=0; i<row; i++){
			// secondary array's references are cards[i].
			for(j=0; j<cards[i].length; j++){
				each = images[i*col + j];
				x = 50 + j*Card.getSize();
				y = 50 + i*Card.getSize();
				cards[i][j] = new Card(each, x, y);
				//cards[i][j].show();
			}
		}
		
		score = 0;
		font = new Font("Arial", Font.BOLD, 14);
		
		needRepaint = false;
	}
	
	
	public int getRowNumber(){ return row; }
	public boolean getNeedRepaint() {return needRepaint;}
	
	
	public void draw(Graphics g){
		int i, j;
		for(i=0; i<cards.length; i++){
			for(j=0; j<cards[i].length; j++){
				cards[i][j].draw(g); 
			}
		}
		
		g.setFont(font);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Score: " + score, 100, 30);
		
		if(Coordinator.gameOver) {
			g.setFont(new Font("Comic Sans MS", Font.BOLD, 10*col));
			g.setColor(Color.ORANGE);
			g.drawString("Congratulations!", 100, 200);
			g.setColor(Color.GREEN);
			g.drawString("Game Over", 200, 300);
		}
		
		needRepaint = false;
	}
	

	public void showAll(){
		int i, j;
		for(i=0; i<cards.length; i++){
			for(j=0; j<cards[i].length; j++){
				cards[i][j].show();
			}
		}
	}
	
	

	public void hideAll(){
		int i, j;
		for(i=0; i<cards.length; i++){
			for(j=0; j<cards[i].length; j++){
				cards[i][j].hide();
			}
		}
	}
	
	public void applyGameLogic(){
		boolean shouldCheckAllCards = false;
		
		if(!threeSelected || System.currentTimeMillis()<=timeThreeCardsSelected+2000)
			return;
		else if(firstSelected.equals(secondSelected) && firstSelected.equals(thirdSelected) && secondSelected.equals(thirdSelected)){
			firstSelected.setMatched();
			secondSelected.setMatched();
			thirdSelected.setMatched();
			chime.play();
			needRepaint = true;
			shouldCheckAllCards = true;
			score+=50;
		}
		else {
			firstSelected.hide();
			secondSelected.hide();
			thirdSelected.hide();
			buzz.play();
			needRepaint = true;
			score-=50;
		}
		
		oneSelected = false;
		twoSelected = false; 
		threeSelected = false;
		firstSelected = null;
		secondSelected = null;
		thirdSelected = null;
		
		if(shouldCheckAllCards){
			int i, j;
			for(i=0; i<cards.length; i++){
				for(j=0; j<cards[i].length; j++){
					if(!cards[i][j].isMatched())
						return;
				}
			}
			Coordinator.gameOver = true;
		}
	}
	
	public void mousePressed(MouseEvent e) {
		
		//System.out.println("mousePressed() point 1: "+ Thread.currentThread().getId());
		//System.out.println("Mouse is pressed at " + e.getX() + ", " + e.getY());
		
		
		if(threeSelected) return;
		
		int mx = e.getX();
		int my = e.getY();
		
		int i, j;
		for(i=0; i<cards.length; i++){
			for(j=0; j<cards[i].length; j++){
				if(cards[i][j].isSelected(mx, my) && !cards[i][j].isMatched() && cards[i][j]!=firstSelected && cards[i][j]!=secondSelected){
					cards[i][j].show();
					
					if(!oneSelected && !twoSelected){ // meaning no card has been selected
						oneSelected = true;
						firstSelected = cards[i][j];
						
						needRepaint = true;
						
						tick.play();
						
						return;
					}
					else if(!twoSelected) { // meaning one has been selected
						twoSelected = true;
						oneSelected = false;
						secondSelected = cards[i][j];
						
						needRepaint = true;
						
						tick.play();
						
						return;
					}
					else {
						threeSelected = true;
						twoSelected = false;
						oneSelected = false;
						thirdSelected = cards[i][j];;
						
						needRepaint = true;
						
						timeThreeCardsSelected = System.currentTimeMillis();
						
						tick.play();
						
						return;
					}
					
				}
			}
		}
		
		
	}
	
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
}













