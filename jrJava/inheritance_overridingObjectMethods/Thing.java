package jrJava.inheritance_overridingObjectMethods;


public class Thing {

	protected int id;
	
	public Thing(int id){
		this.id = id;
	}

	public String toString(){
		//return super.toString() + " id=" + id;
		return "Thing with id="+id;
	}
	
	//This is wrong!!!. We are not overriding. We are overloading.
	//public boolean equals(Thing o){
	//	if(id==o.id) return true;
	//	else return false;
	//}
	
	
	public boolean equals(Object o){
		Thing theOtherThing = (Thing) o;
		if(id==theOtherThing.id) return true;
		return false;
	}
	
	
	public void showAndTell(){
		System.out.println("Thing (id="+id+")"); 
	}
	
}














