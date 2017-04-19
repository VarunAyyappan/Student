package jrJava.inheritance2;

public class BB extends AA {

	public BB(){
		super(100, 120);
		System.out.println(b);
		
	}
	
	protected int b;
	
	public void mB(){
		System.out.println(b);
	}
	
}
