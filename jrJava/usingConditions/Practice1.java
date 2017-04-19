package jrJava.usingConditions;

import java.util.Scanner;

public class Practice1 {

	
	public static void main(String[] args) {
		
		System.out.println("How much money do you have?");
		Scanner myScanner = new Scanner(System.in);
		double yourMoney = myScanner.nextDouble();
		
		
		if(yourMoney<100){
			
			System.out.println("You poor thing. We will double yours.");
			
			if(yourMoney<50){
				System.out.println("You real poor poor thing. We will double again.");
				yourMoney = yourMoney*2;
			}
			
			yourMoney = yourMoney*2;
		}
		 
		
		System.out.println("You have total $" + yourMoney + ".");
	}

}

