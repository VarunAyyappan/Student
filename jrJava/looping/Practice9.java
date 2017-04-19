package jrJava.looping;

import java.util.Scanner;

public class Practice9 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		//for(int i=0; i<10; i++){
		while(true){
			System.out.println("Enter an integer:");
			int justEntered = scanner.nextInt();
			
			if(justEntered<0){
				System.out.println("Somebody typed in a negative number!!!!");
				break;
			}
			
			if(justEntered%2==1){
				continue;
			}
			
			sum += justEntered;
			System.out.println("current sum = " + sum); 
		}
		
		System.out.println("Hew! I am out.");
	}

}
