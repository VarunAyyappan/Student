package jrJava.methodCallAndReturn;

public class Practice2_withReturn {

	public static void main(String[] args) {
		
		//System.out.println(sum(1, 50, 1));
		
		//int theSum = sum(1,50,1) + 2*sum(200, 10000, 2);
		
		int theSum = sum(10, sum(1, 10, 1), 1);
		 
		
		int a = 100;
		if(sum(50,a,3)<=150){
			System.out.println("Hi there!");
		}
		 
		//System.out.println(theSum); 
	} 

	
	
	
	
	public static int sum(int begin, int end, int increment){
		int sum = 0;
		for(int i=begin; i<=end; i=i+increment){
			sum += i;
			if(sum>=1000){
				return sum;
			}
		}
		return sum;
	}
	
}
