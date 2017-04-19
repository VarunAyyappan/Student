package jrJava.arrayListPractice;

import java.util.ArrayList;

public class Practice3 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		data.add(new Integer(101));
		data.add(new Integer(102));
		data.add(new Integer(103));
		data.add(1, new Integer(105));
		printAll(data);
		
		data.remove(0);
		printAll(data);
		
		Integer a = 55;   // Integer a = new Integer(55);
		int b = a;        // int b = a.intValue();
			
		//Integer theReturned = doNothing(new Integer(200));
		int theReturned = doNothing(200).intValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(1234));
		System.out.println(Integer.toHexString(1234));
	} 

	
	private static Integer doNothing(Integer param){
		return param;
	}
	

	private static void printAll(ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++){
			System.out.println( list.get(i) );
		}
		System.out.println(); 
	}
	
}








