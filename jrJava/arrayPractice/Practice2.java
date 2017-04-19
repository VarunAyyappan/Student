package jrJava.arrayPractice;


public class Practice2 {

	
	public static void main(String[] args) {
		
		int theLength = 5;
		
		double[] abc = new double[theLength];
		
		abc[1] = 3.14;
		abc[3] = -0.01;
		
		for(int i=0; i<theLength; i++){
			System.out.printf("%7.2f", abc[i]);
		}
		System.out.println(); 
		
		//abc[5] = 12.6;
		//int n = 3;
		//System.out.println(abc[n*n-5*n-1]);  
		
		double[] def = new double[theLength];
		
		for(int i=0; i<theLength; i++){
			def[i] = abc[i] + 1.0;
		}
		
		for(int i=0; i<theLength; i++){
			System.out.printf("%7.2f", def[i]);
		}
		System.out.println(); 
		
	}

	
}











