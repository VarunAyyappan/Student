package jrJava.usingConditions;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		System.out.println("Enter your math score:"); 
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();

		if(grade>=90){
			System.out.println("Excellent Job!"); 
		}
		
		if(grade>=80 && grade<90){
			System.out.println("At least you got the average."); 
		}
		
		if(grade>=70 && grade<80){
			System.out.println("Oh. That's horrible."); 
		}
		
		if(grade>=60 && grade<70){
			System.out.println("You brought shame to our family!"); 
		}
		
		if(grade<60){
			System.out.println("#&$%^(* %$$%^% @$% *&^(^(!@@#."); 
		}
	}

}








