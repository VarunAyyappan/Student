package jrJava.arrayListPractice;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		
		ArrayList<Thing> things = new ArrayList<Thing>();
		
		//System.out.println(things.size());
		
		Thing t1 = new Thing(101, 1, 1);
		things.add(t1);
		
		things.add(new Thing(102, 2, 2));
		things.add(new Thing(103, 3, 3));
		things.add(new Thing(104, 4, 4));
		
		//System.out.println(things.size());
		//Thing t2 = things.get(1);
		//t2.describe();
		//things.get(1).describe();
		
		//things.get(things.size()-1).describe();
		
		things.add(2,  new Thing(105, 5, 5) );
		
		printAll(things);
		
		things.remove(1);
		printAll(things);
	}
	
	
	private static void printAll(ArrayList<Thing> list){
		for(int i=0; i<list.size(); i++){
			list.get(i).describe();
		}
		System.out.println(); 
	}
	

}





















