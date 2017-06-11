package jrJava.searchingAndSorting_Objects;

public class ObjectSearch {
	
	private static Employee[] employees;
	
	public static void main(String[] args) {
		/*Employee e = new Employee(101, 125000);
		
		/*
		 * String descr = e.toString();
		 * System.out.println(descr);
		 * Is the same as...
		 //
		System.out.println(e);*/
		
		createEmployees(100);
		print();
		System.out.println();
		System.out.println(search(100000));
	}
	
	public static void createEmployees(int size) {
		employees = new Employee[size];
		
		for(int i=0; i<size; i++) {
			employees[i] = new Employee(101+i, 60000+2000*i);
		}
	}
	
	public static void print() {
		for(int i=0; i<employees.length; i++) {
			if(i%10 == 0)
				System.out.println();
			
			if(employees[i].getSalary()<100000)
				System.out.print(employees[i] + "  ");
			else
				System.out.print(employees[i] + " ");
		}
	}
	
	public static int search(int salary) {
		int low=0;
		int high = employees.length-1;
		int mid;
		
		while(low<=high){
			mid = (low+high)/2;
			
			if(salary>employees[mid].getSalary()) low=mid+1;
			else if(salary<employees[mid].getSalary()) high=mid-1;
			else return mid;
		}
		
		return -1;     
	}
	
}
