package jrJava.arrayListPractice;


public class Thing {

	private int id;
	private int x;
	private int y;
	
	public Thing(int id, int x, int y){
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	
	public void describe(){
		System.out.println("id=" + id + "  x=" + x + "  y=" + y); 
	}
	
}
