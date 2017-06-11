package jrJava.twoDimenArray;

public class Practice3 {

	public static void main(String[] args) {
		
		Employee[][] employees = new Employee[5][];
		employees[0] = new Employee[2];
		employees[1] = new Employee[3];
		employees[2] = new Employee[1];
		employees[3] = new Employee[2];
		int id = 101;
		
		for(int i=0;i<employees.length;i++){
			for(int j=0;j<employees[i].length;j++){
				employees[i][j] = new Employee(id, 0);
				id++;
			}
		}
		
	}

}
