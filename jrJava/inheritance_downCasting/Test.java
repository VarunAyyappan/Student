package jrJava.inheritance_downCasting;

public class Test {

	public static void main(String[] args) {
		
		Object r = new SpecialStudent(100, 2.1, true);
		Student r1 = (Student) r;
		SpecialStudent r2 = (SpecialStudent) r;
		System.out.println(r2.isSuspended());
		
		Object s1 = new Student(110, 4.00);
		SpecialStudent s2 = (SpecialStudent) s1;
	}

}
