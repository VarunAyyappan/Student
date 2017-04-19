package jrJava.looping;

public class Practice8 {

	public static void main(String[] args) {
		
		//11+13+15+...+99
		
		int sum = 0;
		int i = 11;
		
		while(i<=99){
			sum += i;
			i += 2;
		}
		
		System.out.println(sum);
		
		/*
		int sum = 0;
		
		for(int i=11; i<=99; i+=2){
			sum += i;
		}
		
		System.out.println(sum);
		*/
	}

}
