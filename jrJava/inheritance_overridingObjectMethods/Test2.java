package jrJava.inheritance_overridingObjectMethods;

public class Test2 {

	public static void main(String[] args) {
		
		Object ref1 = new Thing(100);
		Object ref2 = new Thing(100);
		System.out.println(ref1.equals(ref2)); 
		
		Thing r1 = new GoodThing(1000, -2);
		Object r2 = new GoodThing(1000, -2);
		System.out.println(r1.toString()); 
		System.out.println(r1.equals(r2));  
	
	}

}
