package jrJava.usingConditions;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		System.out.println("Enter your math score:"); 
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();

		if(grade>=90){
			System.out.println("Excellent Job!"); 
		}
		else if(grade>=80){
			System.out.println("At least you got the average."); 
		}
		else if(grade>=70){
			System.out.println("Oh. That's horrible."); 
		}
		else if(grade>=60){
			System.out.println("You brought shame to our family!"); 
		}
		else {
			System.out.println("#&$%^(* %$$%^% @$% *&^(^(!@@#."); 
		}

	}

}
