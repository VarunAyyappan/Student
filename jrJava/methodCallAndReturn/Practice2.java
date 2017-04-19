package jrJava.methodCallAndReturn;

public class Practice2 {

	public static void main(String[] args) {
		
		int sum;
		
		// 1+2+3+ ... + 50
		sum = 0;
		for(int i=1; i<=50; i=i+1){
			sum += i;
		}
		System.out.println(sum); 
		
		
		// 15+16+17+...+205
		sum = 0;
		for(int i=15; i<=205; i=i+1){
			sum += i;
		}
		System.out.println(sum);
		
		
		// 135+137+139+...+501
		sum = 0;
		for(int i=135; i<=501; i=i+2){
			sum += i;
		}
		System.out.println(sum);
		 
		
		// ...
		
	}

}
