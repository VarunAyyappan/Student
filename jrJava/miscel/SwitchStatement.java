package jrJava.miscel;

public class SwitchStatement {

	public static void main(String[] args) {

		int value = 3;

		switch(value){

		case 1: System.out.println("P1");
				System.out.println("P11");
				break;
				
		default:System.out.println("PD");
				System.out.println("PDD");
				break;
		
		case 2: System.out.println("P2");
				System.out.println("P22");
				break;
				
		case 0: System.out.println("P0");
				System.out.println("P00");
				break;
				
		
		}

	}

}
