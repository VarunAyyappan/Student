package jrJava.arrayPractice;

public class Practice3 {

	
	public static void main(String[] args) {
		
		// using length field of arrays:
		/*
		int[] abc = new int[25];
		
		System.out.println( abc.length );
		
		for(int i=0; i<abc.length; i++){
			System.out.println( abc[i] );
		}
		*/
		
		// how to initialize arrays:
		
		//int[] myArray = { 5, -7, 1, 0, 6, 11, 29, 87};
		
		//The following will not work.
		//int[] myArray;
		//myArray = { 5, -7, 1, 0, 6, 11, 29, 87};
		
		//int[] myArray = new int[]{ 5, -7, 1, 0, 6, 11, 29, 87 };
		
		int[] myArray;
		myArray = new int[]{ 5, -7, 1, 0, 6, 11, 29, 87 };
		
		
		for(int i=0; i<myArray.length; i++){
			System.out.println(myArray[i]); 
		}
		
		
	}

}













