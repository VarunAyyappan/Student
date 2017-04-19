package jrJava.inheritance3;


public class Thing {

	public Thing(){
		this(1000);
	}
	
	public Thing(int a){
		this(a, 2000);
	}
	
	
	public Thing(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	private int a;
	private int b;
	
	public void doIt(){
		System.out.println("I do it.");
	}
	
	public void dontDoIt(){
		System.out.println("I don;t do it.");
	}
	
}
