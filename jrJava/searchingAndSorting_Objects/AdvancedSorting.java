package jrJava.searchingAndSorting_Objects;

public class AdvancedSorting {
	
	public static void bubbleSort(int[] values) {
		int i, temp;
		boolean isDone = false;
		int[] even = new int[values.length], odd = new int[values.length];
		
		while(!isDone) {
			isDone = true;
			
			for(i=0; i<values.length-1; i++) {
				if(values[i]%2>values[i+1]%2 || (values[i]%2==values[i+1]%2 && values[i]>values[i+1])) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					isDone = false;
				}
			}
		}
	}
	
	public static int[] createArray(int size) {
		int[] values = new int[size];
		
		for(int i=0;i<size; i++) {
			values[i] = (int)(Math.random()*size/2);
		}
		
		return values;
	}
	
	public static void print(int[] values) {
		for(int i=0; i<values.length; i++)
			System.out.print(values[i] + "  ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {14, 7, 9, 11, 8, 3, 12, 10, 6, 5, 14, 4};
		int[] b = createArray(10);
		print(a);
		bubbleSort(a);
		print(a);
	}

}
