package jrJava.twoDimenArray;

public class Practice2 {

	public static void main(String[] args) {
		
		int[][] a = new int[5][];
		a[0] = new int[]{45, 46, 47};
		a[1] = new int[]{99, 100, 101, 102};
		a[2] = new int[]{-1, -2, -3, -4, -5, -6};
		a[3] = new int[]{0, 0, 0, 1, 1, 1, 1, 1, 1};
		a[4] = new int[]{10, -10, 10, -10, -10, -10, -10, 10-10};
		
		printAll(a);
		printLastElement(a);
		
	}
	
	public static void printAll(int[][] values) {
		
		// primary array's length: values.lenght
		// element of primary array: values[i] (also the reference o secondary array)
		
		for(int i=0;i<values.length-1;i++){
			// Reference of each secondary array
			for(int j=0;j<values[i].length;j++){
				System.out.print(values[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	public static void printLastElement(int[][] values){
		
		System.out.println(values[values.length-1][values[values.length-1].length-1]);
	}
}
