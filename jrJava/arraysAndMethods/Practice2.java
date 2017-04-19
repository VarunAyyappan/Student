package jrJava.arraysAndMethods;

public class Practice2 {

	public static void main(String[] args) {
		
		boolean[] data = createArray(10);
		printAll(data);
		opposite(data);
		printAll(data);
	}

	
	public static boolean areMoreTruesThanFalses(boolean[] values){
		int countTrue = 0;
		for(int i=0; i<values.length; i++){
			if(values[i]) countTrue++;
		}
		
		return countTrue > (values.length-countTrue);
		
	}
	
	
	public static boolean areAllTrue(boolean[] values){
		for(int i=0; i<values.length; i++){
			if(!values[i]) return false;
		}
		return true;
	}
	
	
	public static void opposite(boolean[] values){
		for(int i=0; i<values.length; i++){
			values[i] = !values[i];
		}
	}
	
	
	public static boolean[] createArray(int size){
		boolean[] values = new boolean[size];
		for(int i=0; i<values.length; i++){
			if(Math.random()>0.5) values[i] = true;
			else values[i] = false;
		}
		return values;
	}
	
	
	public static void printAll(boolean[] values){
		for(int i=0; i<values.length; i++){
			System.out.print(values[i] + " ");
		}
		System.out.println(); 
	}
	
	
}
