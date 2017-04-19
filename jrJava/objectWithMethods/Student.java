package jrJava.objectWithMethods;


public class Student {

	String name;
	int id;
	int grade;
	double GPA;
	boolean isSuspended;

	double mathScore;
	double socialScienceScore;
	double englishScore;
	
	
	double calculateGPA(){
		GPA = (mathScore+socialScienceScore+englishScore)/3;
		return GPA;
	}
	
}
