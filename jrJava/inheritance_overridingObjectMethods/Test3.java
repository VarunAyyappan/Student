package jrJava.inheritance_overridingObjectMethods;

public class Test3 {

	public static void main(String[] args) {
		
		Thing[] things = new Thing[4];
		
		things[0] = new Thing(100);
		things[1] = new Thing(105);
		things[2] = new GoodThing(1000, 12);
		things[3] = new GoodThing(1003, -100);
		
		for(int i=0; i<things.length; i++) things[i].showAndTell();
		
	}

}
