package jrJava.arrayPractice;

public class Practice5 {

	public static void main(String[] args) {
		
		Thing[] things = new Thing[4];
		
		things[0] = new Thing(101, 5, 6);
		things[1] = new Thing(102, 15, 26);
		things[2] = new Thing(103, 52, 16);
		things[3] = new Thing(104, 14, 68);
		
		printAll(things);
	}

	
	
	public static void printAll(Thing[] ref){
	
		for(int i=0; i<ref.length; i++){
			ref[i].describe();
		}
	}

	
}
