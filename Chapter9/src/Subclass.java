
public class Subclass extends Superclass {
	int subInt;
	String subString;

	public Subclass(int superInt, String superString, int subInt, String subString){
		super(superInt, superString);
		this.subString = subString;
		this.subInt = subInt;
	}
}
