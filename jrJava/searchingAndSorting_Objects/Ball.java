package jrJava.searchingAndSorting_Objects;

import java.awt.Color;

public class Ball implements Comparable{
	
	private int x, y;
	private int radius;
	private Color color;
	
	public Ball(int x, int y, int radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString(){
		return "[" + x + ", " + y + ", " + radius +", " + color + "]";
	}

	public int compareTo(Object o) {
		Ball other = (Ball) o;
		
		if(color.getBlue()>other.color.getBlue())
			return 1;
		else if(color.getBlue()<other.color.getBlue())
			return -1;
		else{
			if(radius>other.radius)
				return 1;
			else if(radius<other.radius)
				return -1;
			else {
				if(x>other.x)
					return 1;
				else if(x<other.x)
					return -1;
				else
					return 0;
			}
		}
	}
	
}
