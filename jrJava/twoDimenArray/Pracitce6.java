package jrJava.twoDimenArray;

public class Pracitce6 {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3}, {11,12,13,14}, {21,22}, {31,32,33,34,35,36}};
		printAll(a);
		rotate(a);
		printAll(a);
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
	
	public static void rotate(int[][] values) {
		int temp = values[0][0];
		int i = 0, j = 0;
		
		for(i=values.length-1;i>=0;i++){
			for(j=values[i].length-1;j>0;j++){
				if(i==values.length-1 && j==values[i].length)
					values[i][j] = temp;
				else if(j==values[i].length-1)
					//values[i][j] = values[];
					
				values[i][j] = values[i][j+1];
			}
		}
		
		values[values.length-1][values[values.length-1].length-1] = temp;
	}

}
