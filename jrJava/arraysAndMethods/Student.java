package jrJava.arraysAndMethods;


public class Student {

	private int id;
	private double GPA;
	private boolean honored;
	private boolean expelled;
	
	public Student(int id, double GPA){
		this.id = id;
		this.GPA = GPA;
	}
	
	public double getGPA(){ return GPA; }
	
	public void setGPA(double GPA){ this.GPA = GPA; }
	
	public void makeHonored(){ honored = true; }
	
	public void expel(){ expelled = true; }
	
	public void print(){
		System.out.print(" {" + id + ", " + GPA + ", " + honored + ", " + expelled + "} ");
	}
	
}
