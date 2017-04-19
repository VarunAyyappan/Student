package jrJava.methodCallAndReturn;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("P1");
		myMethod1();
		System.out.println("P2");
		myMethod1();
		System.out.println("P3");
		myMethod2(100); 
		System.out.println("P10");	
		int result = myMethod3(100);
		System.out.println(result); 
	}
	
	
	public static void myMethod1(){
		System.out.println("P4");
	}
	
	
	public static void myMethod2(int a){
		System.out.println("P5");
		System.out.println("I received " + a);
	}
	
	
	public static int myMethod3(int a){
		System.out.println("P6");
		System.out.println("I received " + a);
		return a*a;
	}

}
