package jrJava.arraysAndMethods;

public class Practice3 {

	
	public static void main(String[] args) {
		Student[] them = createArray(10);
		printAll(them);
		
		expelSome(them, 2.5);
		printAll(them);
		
		makeHonorStudents(them, 0.8);
		printAll(them);
	}

	
	public static void makeHonorStudents(Student[] students, double margin){
		double sum = 0.0;
		for(int i=0; i<students.length; i++){
			sum += students[i].getGPA();
		}
		double average = sum/students.length;
		
		for(int i=0; i<students.length; i++){
			if(students[i].getGPA()>average+margin) students[i].makeHonored();
		}
	}
	
	
	public static void expelSome(Student[] students, double limit){
		for(int i=0; i<students.length; i++){
			if(students[i].getGPA()<limit) students[i].expel();
		}
	}
	
	
	public static Student[] createArray(int size){
		
		Student[] students = new Student[size];
	
		for(int i=0; i<students.length; i++){
			int id = 100 + i;
			double GPA = ((int)(Math.random()*201) + 200)/100.0;
			students[i] = new Student(id, GPA);
		}
		
		return students;
	}
	
	
	public static void printAll(Student[] students){
		for(int i=0; i<students.length; i++){
			students[i].print();
		}
		System.out.println();
	}
	
}
