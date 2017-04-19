package jrJava.inheritanceTest;

import jrJava.inheritance1.A;
import jrJava.inheritance1.C;

public class Test {

	public static void main(String[] args) {
		
		
		Object ref = new Object();
		
		System.out.println(ref.hashCode()); 
		System.out.println(Integer.toHexString(ref.hashCode())); 
		//System.out.println(ref); 
		
		System.out.println(ref.toString());
		
		System.out.println(ref.equals(new C()));
	}
}
 