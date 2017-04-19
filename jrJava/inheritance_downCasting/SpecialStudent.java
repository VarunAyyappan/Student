package jrJava.inheritance_downCasting;

public class SpecialStudent extends Student {

	private boolean isSuspended;
	
	public SpecialStudent(int id, double gpa, boolean isSuspended){
		super(id, gpa);
		this.isSuspended = isSuspended;
	}
	
	
	public String toString(){
		return "Student id="+id+" , GPA="+gpa+" ,suspended="+isSuspended;
	}
	
	public boolean equals(Object other){
		SpecialStudent o = (SpecialStudent) other; // down casting
		if(id==o.id && gpa==o.gpa && isSuspended==o.isSuspended) return true;
		return false;
	}
	
	public boolean isSuspended(){ return isSuspended; }
	
}
