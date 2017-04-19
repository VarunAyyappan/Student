package jrJava.inheritance_downCasting;

public class Student {

	protected int id;
	protected double gpa;
	
	
	public Student(int id, double gpa){
		this.id = id;
		this.gpa = gpa;
	}
	
	
	public String toString(){
		return "Student id="+id+" , GPA="+gpa;
	}
	
	public boolean equals(Object other){
		Student o = (Student) other; // down casting
		if(id==o.id && gpa==o.gpa) return true;
		return false;
	}
	

}

