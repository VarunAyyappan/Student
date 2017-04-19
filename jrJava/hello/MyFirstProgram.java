package jrJava.hello;

import java.util.Scanner;

public class MyFirstProgram {

	
	public static void main(String[] args) {
		
		System.out.println("Type in your name.");
		Scanner myScanner = new Scanner(System.in);
		String typedName = myScanner.next();
		
		int mathScore;
		int scienceScore;
		int total;
		
		mathScore = 58;
		scienceScore = 49;
		total = mathScore + scienceScore;
		
		System.out.println("The total score for " + typedName + " is " + total + ".");
		
		System.out.println("Sir is so handsome.");
	}

}
