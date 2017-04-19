package jrJava.arraysAndMethods;

public class Practice1 {

	
	public static void main(String[] args) {
		
		/*
		int size = 30;
		int[] nums = new int[size];
		
		fillWithData(nums);
		printAll(nums);
		*/
		
		//int[] nums = createArray(10);
		//printAll(nums);
		//int evenSum = sumEvens(nums);
		//System.out.println(evenSum);
		//int evenCount = countEvens(nums);
		//System.out.println(evenCount); 
		
		//int total = sum(nums);
		//System.out.println(total); 
		//System.out.println(average(nums)); 
		
		//int[] nums = createArray(10);
		//printAll(nums);
		//int count = countNumbersBetween(nums, 30, 70);
		//System.out.println(count); 
		//square(nums);
		//printAll(nums);
		
		//int[] array1 = createArray(10);
		//int[] array2 = createArray(10);
		//int[] array3 = sum(array1, array2);
		
		//printAll(array1);
		//printAll(array2);
		//printAll(array3);
		
		int[] nums = createArray(5);
		printAll(nums);
		shiftRight(nums);
		printAll(nums);
	}

	
	
	public static void shiftLeft(int[] values){
	
	}
	
	
	
	public static void shiftRight(int[] values){
		int temp = values[values.length-1];
		
		for(int i=values.length-1; i>0; i--){
			values[i] = values[i-1];
		}
		values[0] = temp;
	}
	
	
	
	public static int[] sum(int[] values1, int[] values2){
		
		if(values1.length!=values2.length) return null;
		
		int[] values = new int[values1.length];
		for(int i=0; i<values.length; i++){
			values[i] = values1[i] + values2[i];
		}
		return values;
	}
	
	
	public static int countNumbersBetween(int[] values, int lower, int upper){
		int count = 0;
		for(int i=0; i<values.length; i++){
			if(values[i]>lower && values[i]<upper) count++;
		}
		return count;
	}
	
	
	public static void square(int[] values){
		for(int i=0; i<values.length; i++){
			values[i] = values[i]*values[i];
		}
	}
	
	
	public static int sumEvens(int[] values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			if(values[i]%2==0) sum += values[i];
		}
		
		return sum;
	}
	
	
	public static int countEvens(int[] values){
		int count = 0;
		for(int i=0; i<values.length; i++){
			if(values[i]%2==0) count++;
		}
		
		return count;
	}
	
	
	
	public static int[] createArray(int size){
		int[] values = new int[size];
		for(int i=0; i<values.length; i++){
			values[i] = (int)(Math.random()*100);
		}
		return values;
	}
	 
	
	public static void fillWithData(int[] values){ 
		for(int i=0; i<values.length; i++){
			values[i] = (int)(Math.random()*100);
		}
	}
	
	
	public static void printAll(int[] values){
		for(int i=0; i<values.length; i++){
			//System.out.print(values[i] + " ");
			System.out.printf("%5d", values[i]);
		}
		System.out.println(); 
	}
	
	
	public static int sum(int[] values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
	
	
	public static double average(int[] values){
		double sum = 0.0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum/values.length;
	}
	
}










