package jrJava.methodCallAndReturn;

public class Practice3_overloading {

	public static void main(String[] args) {
		myMethod(10, false);
	}

	
	public static void myMethod(){
		System.out.println("P1"); 
	}
	
	public static void myMethod(int a){
		System.out.println("P2"); 
	}	
	
	public static void myMethod(boolean a){
		System.out.println("P3"); 
	}	
	
	public static void myMethod(double a){
		System.out.println("P4"); 
	}	
	
	public static void myMethod(int a, int b){
		System.out.println("P5"); 
	}	
	
	public static void myMethod(int a, boolean b){
		System.out.println("P6"); 
	}	
	
}



