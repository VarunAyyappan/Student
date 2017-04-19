package jrJava.objectWithMethods;

public class Test1 {

	public static void main(String[] args) {
		
		Student stu1;
		Student stu2;
		
		stu1 = new Student();
		stu2 = new Student();

		stu1.mathScore = 3.5;
		stu1.socialScienceScore = 3.75;
		stu1.englishScore = 4.0;
		
		double result1 = stu1.calculateGPA();
		System.out.println(result1); 
		
		
		stu2.mathScore = 2.9;
		stu2.socialScienceScore = 3.00;
		stu2.englishScore = 2.84;
		
		double result2 = stu2.calculateGPA();
		System.out.println(result2); 
		
	}

}
