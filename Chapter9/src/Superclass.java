

public class Superclass {
	int superInt;
	String superString;
	
	
	public Superclass(int superInt, String superString){
		this.superInt = superInt;
		this.superString = superString;
	}
	
	public int getInt(){
		return this.superInt;
	}
	
	public String getString(){
		return this.superString;
	}	
	
	@Override
	public String toString(){
		return "My string is: " + superString + "and my num is: " + superInt;
	}
}
