package jrJava.usingConditions;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		System.out.println("How much money do you have?");
		Scanner myScanner = new Scanner(System.in);
		double yourMoney = myScanner.nextDouble();
		
		if(yourMoney<50){
			yourMoney = 2*yourMoney;
			System.out.println("You poor thing. \nYou now have $" + yourMoney + ".");
		}
		else {
			yourMoney = yourMoney/2;
			System.out.println("You have too much. \nYou now have $" + yourMoney + ".");
		}
		
		/*
		if(yourMoney<50){
			yourMoney = 2*yourMoney;
			System.out.println("You poor thing. \nYou now have $" + yourMoney + ".");
		}
		
		if(yourMoney>=50){
			yourMoney = yourMoney/2;
			System.out.println("You have too much. \nYou now have $" + yourMoney + ".");
		}
		*/
	}

}
