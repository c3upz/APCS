
public class Subclass extends Superclass{
	String subString;
	
	
	public Subclass(int superInt, String superString, String subString) {
		super(superInt, superString);
		this.subString = subString;
	}
	
	@Override
	public String getString(){
		return this.subString;
	}
	
	public Subclass(){
		this.subString = "";
	}
}
