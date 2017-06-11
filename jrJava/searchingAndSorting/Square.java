package jrJava.searchingAndSorting;

public class Square implements Comparable{
	
	private int x, y;
	private int side;
	
	public Square(int x, int y, int side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}
	
	public String toString() {
		return"[" + x + ", " + y + ", " + side + "]";
	}

	public int compareTo(Object o) {
		return 0;
	}
	
}
