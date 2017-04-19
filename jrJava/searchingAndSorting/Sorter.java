package jrJava.searchingAndSorting;

public class Sorter {
	
	public static void main(String[] args) {
		int[] a = createArray(300000);
		print(a);
		long start = System.currentTimeMillis();

		selectSort(a);
		
		long end = System.currentTimeMillis();
		print(a);
		
		System.out.println(end-start);
	}
	
	public static void bubbleSort(int[] values) {
		// We use a window of size 2
		// i: to indicate the head of the window
		// At the beginning of: i=0; at the end i=length-2 (not length-1)
		// The two elements in each window will be i and i+1
		int temp;
		int i;
		boolean isDone = false;
		
		while(!isDone) {
			isDone = true;
			
			for(i=0; i<values.length-1; i++) {
				// check the order of the two elements
				// if they are in wrong order, we will swap them

				if(values[i]>values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					isDone = false;
				}
			}
		}
	}
	
	public static void selectSort(int[] values) {
		int minIndex = 0;
		int temp = 0;
		int i, j;
		
		for(i=0; i<values.length-1; i++) {
			// The following will find the index of which the minimum number is stored.
			for(j=i+1; j<values.length; j++){
				if(values[j]<values[minIndex])
					minIndex = j;
			}
			//System.out.println(values[minIndex] + " at " + minIndex);
			
			// This puts the minimum number at the beginning of the window.
			temp = values[i];
			values[i] = values[minIndex];
			values[minIndex] = temp;
		}
	}
	
	public static void insertSort(int[] values) {

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
	
}
