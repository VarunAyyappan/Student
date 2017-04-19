package jrJava.introObject;

import java.awt.Color;

public class TheGuyThatBringsInThread {

	public static void main(String[] args) {
		
		Ball ball1;
		Ball ball2;
		
		ball1 = new Ball();
		ball1.x = 110;
		ball1.y = 90;
		ball1.vx = -2;
		ball1.vy = 3;
		ball1.radius = 40;
		ball1.color = Color.red;
		
		ball2 = new Ball();
		ball2.x = ball1.x*2;
		ball2.y = ball1.y*2;
		ball2.vx = ball1.vx*2;
		ball2.vy = ball1.vy*2;
		ball2.radius = ball1.radius*2;
		ball2.color = Color.blue;
		
		ball2 = ball1;
		ball1 = null;
		
		/*
		Student me;
		me = new Student();
		
		me.name = "Sir";
		me.id = 101;
		me.grade = 9;
		me.GPA = 4.5;
		me.isSuspended = false;
		me.mathScore = 4.5;
		me.englishScore = 4.5;
		me.socialScienceScore = 4.5;
		
		me.mathScore = me.mathScore - 0.5;
		*/
	}

}
