package jrJava.inheritance4_importanceOfType2;

public class Test {

	
	public static void main(String[] args) {
		
		A ref1 = new A();
		
		InterfaceA ref2 = new A();
		
		InterfaceA ref3 = new B();
		
		assumeIAmFarAway(ref3);
		
		
	}
	
	
	public static void assumeIAmFarAway(InterfaceA iA){
		
	}
	

}
