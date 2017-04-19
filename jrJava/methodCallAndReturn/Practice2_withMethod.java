package jrJava.methodCallAndReturn;

public class Practice2_withMethod {

	public static void main(String[] args) {
		
		//sum(1, 50, 1);
		//sum(15, 205, 1);
		//sum(135, 501, 2);
		
		sum(1, 10000000, 1);
		
		return;
	}

	
	
	public static void sum(int begin, int end, int increment){
		
		int sum = 0;
		for(int i=begin; i<=end; i=i+increment){
			sum += i;
			if(sum>=1000){
				System.out.println(sum);
				return;
			}
			
		}
		System.out.println(sum); 
		
		return;
	}
	
}
