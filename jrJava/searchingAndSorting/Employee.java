package jrJava.searchingAndSorting;

public class Employee {
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
	
}
