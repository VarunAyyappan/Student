package jrJava.memoryCardGame2;

public class Temp {

	public static void main(String[] args) {
		
		//System.out.println(2>5? 4:3); 

		int a = 10;
		int b = 25;
		
		//int c = Math.max(a,  b);
		//int c = a>b? a: b;
		//System.out.println(c);
		
		int c = a + aaa(a, bbb(2*a, b))>10? aaa(0, 3*a):bbb(3*a, 0);
		System.out.println(c);
		
	}
	
	
	private static int aaa(int a, int b){
		return a+b;
	}
	
	private static int bbb(int a, int b){
		return a-b;
	}

} 
