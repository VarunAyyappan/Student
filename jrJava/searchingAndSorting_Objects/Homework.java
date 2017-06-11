package jrJava.searchingAndSorting_Objects;

public class Homework {
	
	// 1. Bubble sort in numbers in descending order.
	public static void bubbleSort(int[] values) {
		int i, temp;
		boolean isDone = false;
		
		while(!isDone) {
			isDone = true;
			
			for(i=values.length-2; i>=0; i--) {
				if(values[i]<values[i+1]) {
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					isDone = false;
				}
			}
		}
	}
	
	// 2. Select sort: sort in ascending order, but select maximum in each window
	public static void selectSort(int[] values) {
		int maxIndex = 0;
		int temp = 0;
		int j;
		
		for(int i=values.length-1; i>=0; i--) {
			// The following will find the index of which the maximum number is stored.
			for(j=0; j<i; j++){
				if(values[j]>values[maxIndex])
					maxIndex = j;
			}
			//System.out.println(values[maxIndex] + " at " + maxIndex);
			
			// This puts the max number at the end of the window.
			temp = values[i];
			values[i] = values[maxIndex];
			values[maxIndex] = temp;
			maxIndex = 0;
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
		int[] a = createArray(12);
		print(a);
		bubbleSort(a);
		print(a);
		
		System.out.println();
		
		int[] b = createArray(12);
		print(b);
		selectSort(b);
		print(b);
	}

}
