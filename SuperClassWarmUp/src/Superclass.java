
public class Superclass {
	int superInt;
	String superString;
	
	public Superclass(int superInt, String superString){
		this.superInt = superInt;
		this.superString = superString;
	}
	
	public Superclass(){
		this.superInt = 0;
		this.superString = "";
	}

	public String getString(){
		return this.superString;
	}
	
	@Override
	public String toString(){
		return "The string is: " +  superString + ", the int is: " + superInt;
	}
}


