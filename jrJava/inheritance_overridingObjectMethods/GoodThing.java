package jrJava.inheritance_overridingObjectMethods;


public class GoodThing extends Thing {

	private int levelOfGoodness;
	
	public GoodThing(int id, int levelOfGoodness){
		super(id);
		this.levelOfGoodness = levelOfGoodness;
	}
	
	public String toString(){
		return "Good thing with id="+id + ", levelOfGoodness="+levelOfGoodness;
	}
	
	
	public boolean equals(Object o){
		GoodThing other = (GoodThing) o;
		if(id==other.id && levelOfGoodness==other.levelOfGoodness) return true;
		return false;
	}
	
	public void showAndTell(){
		System.out.println("GoodThing (id="+id+", levelOfGoodness="+levelOfGoodness+")"); 
	}
	
}
