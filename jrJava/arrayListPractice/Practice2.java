package jrJava.arrayListPractice;

import java.util.ArrayList;

public class Practice2 {

	
	public static void main(String[] args) {
		
		//String name1 = "Super Man";
		//String name2 = "Super Man";
		//String name3 = new String("Batman");
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("aaa");
		words.add("bbb");
		words.add("ccc");
		
		printAll(words);
		
		words.remove("aaa");
		
		printAll(words);
	}

	
	private static void printAll(ArrayList<String> list){
		for(int i=0; i<list.size(); i++){
			System.out.println( list.get(i) );
		}
		System.out.println(); 
	}
	
	
}
