package jrJava.arrayPractice;

public class Practice4 {

	public static void main(String[] args) {
		
		Thing[] things = new Thing[]{ new Thing(101, 5, 6), new Thing(102, 11, -5), new Thing(103, 10, 20) };
		
		things[1].describe(); 
	}

}
