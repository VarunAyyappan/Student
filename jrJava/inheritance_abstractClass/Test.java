package jrJava.inheritance_abstractClass;

public class Test {

	public static void main(String[] args) {
		
		Animal ref = new Husky();
		doSomething(ref);
		
	}

	

	public static void doSomething(Animal animal){
		animal.move();
	}
	
	
}
