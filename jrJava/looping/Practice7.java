package jrJava.looping;

import java.util.Scanner;

public class Practice7 {

	
	public static void main(String[] args) {
		
		double sum = 0.0;
		double average = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=1; i<=10; i++){
			
			System.out.println("Enter a new value.");
			double entered = scanner.nextDouble();
			
			sum += entered;
			average = sum/i;
			
			System.out.println("The current sum=" + sum);
			System.out.println("The current average=" + average);
		}
		
	}

}
