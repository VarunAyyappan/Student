package jrJava.searchingAndSorting;

public class SeqeuntialSearch {
	
	private static int[] values = {45, 11, 77, 2, 15, 89, 93, 1, 3, 18, 26, 61, 55, 13, 88, 79, 51, 41, 49, 76};
	
	public static void main(String[] args) {
		System.out.println(search(15));
		System.out.println(search(56));
	}
	
	public static int search(int key) {
		
		for(int i=0; i<values.length; i++) {
			if(values[i]==key)
				return i;
		}
		
		return -1;
	}
	
}
