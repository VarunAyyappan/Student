package jrJava.twoDimenArray;

public class Practice4 {

	public static void main(String[] args) {

		Employee[] e;
		e = new Employee[]{new Employee(101, 10000), new Employee(107, 15000), new Employee(122, 270000)};

		// or....

		Employee[] f = {new Employee(101, 10000), new Employee(107, 15000), new Employee(122, 270000)};

		// ---------------------------------------------------------------------------------------------------

		int[][] aaa = { {1,2,3}, {4,5,6}, {7,8,9,10}};

		int[][] bbb; 
		bbb = new int[][]{ {1,2,3}, {4,5,6}, {7,8,9,10}};

		int[][] ccc = new int[3][]; 
		ccc[0] = new int[]{1,2,3};
		ccc[0] = new int[]{4,5,6};
		ccc[0] = new int[]{7,8,9,10};

		// ----------------------------------------------------------------------------------------------------

		Employee[][] emp = { {new Employee(101, 0), new Employee(102, 0)},
						   {new Employee(103, 0), new Employee(104, 0), new Employee(105, 0)},
						   {new Employee(106, 0)},
						   {new Employee(107, 0), new Employee(108, 0)}};
		
	}

}
