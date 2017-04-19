package jrJava.methodCallAndReturn;

public class Practice4 {

	public static void main(String[] args) {
	
		System.out.println(sum(99));
		
	}

	
	public static int sum(int end){
		return sum(1, end, 1);
	}
	
	
	public static int sum(int end, int increment){
		return sum(1, end, increment);
	}
	
	
	public static int sum(int begin, int end, int increment){
		int sum = 0;
		for(int i=begin; i<=end; i+=increment){
			sum += i;
		}
		return sum;
	}
	
}
