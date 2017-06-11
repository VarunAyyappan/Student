package jrJava.searchingAndSorting_Objects;

public class Employee implements Comparable {
	private int id;
	private int salary;
	
	public Employee(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return "[" + id + ", " + salary + "]";
	}

	
	public int compareTo(Object o) {
		Employee other = (Employee) o;
		
		if(salary>other.salary) 
			return 1;
		else if(salary<other.salary)
			return -1;
		else{
			if(id>other.id)
				return 1;
			else
				return -1;
		// or just return 0
		}
	}
	
}
