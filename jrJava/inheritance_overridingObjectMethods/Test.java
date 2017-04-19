package jrJava.inheritance_overridingObjectMethods;

public class Test {

	public static void main(String[] args) {
		
		Thing thing1 = new Thing(100);
		String description1 = thing1.toString();
		System.out.println(description1);
		
		Thing thing2 = new Thing(100);
		boolean result = thing1.equals(thing2);
		System.out.println(result); 
	}

}
