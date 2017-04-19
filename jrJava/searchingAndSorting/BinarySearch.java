package jrJava.searchingAndSorting;

public class BinarySearch {
	
	private static int[] values = {1, 3, 7, 11, 12, 21, 25, 29, 30, 37, 42, 48, 55, 61, 68, 73, 77, 85, 91, 92, 96, 99, 100, 101, 102, 103};
	
	public static void main(String[] args) {
		System.out.println(search(92));
		System.out.println();
	}
	
	public static int search(int key) {
		int low=0, high=values.length, mid=0;
		int trial = 0;
		
		while(low<=high){
			trial++;
			System.out.println(trial);
			mid = (low+high)/2;
			
			if(key>values[mid]) low=mid+1;
			else if(key<values[mid]) high=mid-1;
			else return mid;
		}
		
		return -1;     
	}
	
}
