package jrJava.searchingAndSorting_Objects;

import java.awt.Color;

public class Sorter {
	
	public static void main(String[] args) {
		//String[] words = {"ccd", "fgh", "abcd", "bcb", "aab", "a", "aa", "aabb", "dede", "kaleb", "is", "in", "trouble"};
		//print(words);
		
		//Double[] nums = {4.53, 2.22, 0.99, 1.34, 5.666, 0.56467, 0.6678, 0.0001};
		//print(nums);
		//selectSort(nums);
		
		Ball[] balls = {new Ball(109, 200, 50, Color.RED),
				new Ball(100, 205, 60, Color.BLUE),
				new Ball(104, 203, 60, Color.BLUE),
				new Ball(100, 210, 50, Color.BLUE),
				new Ball(105, 210, 60, Color.GREEN),
				new Ball(109, 200, 70, Color.BLUE),
				new Ball(100, 230, 70, Color.RED),
				new Ball(120, 230, 70, Color.GREEN),
				new Ball(135, 230, 50, Color.GREEN),
				new Ball(110, 210, 50, Color.RED) };
		
		print(balls);
		bubbleSort(balls);
		print(balls);
	}
	
	public static Employee[] createArray(int size) {
		Employee[] employees = new Employee[size];
		
		for(int i=0;i<size; i++) {
			employees[i] = new Employee(100+i, (int)(65000+35000*Math.random()));
		}
		
		return employees;
	}
	
	public static void print(Object[] objs) {
		for(int i=0; i<objs.length; i++){
			
			if(i%3==0)
				System.out.println();
			System.out.print(objs[i] + "  ");
		}
		
		System.out.println('\n');
	}
	
	public static void bubbleSort(Comparable[] comparables) {
		Comparable temp;
		int i;
		boolean isDone = false;
		
		while(!isDone) {
			isDone = true;
			
			for(i=0; i<comparables.length-1; i++) {
				if(comparables[i].compareTo(comparables[i+1])>0) {
					temp = comparables[i];
					comparables[i] = comparables[i+1];
					comparables[i+1] = temp;
					isDone = false;
				}
			}
		}
	}
	
	public static void selectSort(Comparable[] comparables) {
		int minIndex = 0;
		Comparable temp;
		int j = 0;
		
		for(int i=0; i<comparables.length-1; i++) {
			// The following will find the index of which the minimum number is stored.
			for(j=i+1; j<comparables.length; j++){
				if(comparables[j].compareTo(comparables[minIndex])<0)
					minIndex = j;
			}
			//System.out.println(values[minIndex] + " at " + minIndex);
			
			// This puts the minimum number at the beginning of the window.
			temp = comparables[i];
			comparables[i] = comparables[minIndex];
			comparables[minIndex] = temp;
		}
	}
	
	public static void insertSort(Comparable[] comparables) {
		int i, j;
		Comparable temp;
		for(i=0; i<comparables.length;i++) {
			temp = comparables[i];

			for(j=i-1; j>=0; j--) {
				if(comparables[j].compareTo(temp)>0) 
					comparables[j+1] = comparables[j];
				else
					break;     // Mr.Conlin (Java teacher), "REEEEEEEEEEEEEEEEEEEEEEEElEEEEE!"
			}
			comparables[j+1] = temp;
		}
	}
	
}
