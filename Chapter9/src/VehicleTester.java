
public class VehicleTester {
	public static void main(String[] args){
		Superclass obj1 = new Superclass(1000, "I am super1");
		Subclass obj2 = new Subclass(2000, "I am super2", 100, "I am sub2");
		
		System.out.println(obj2);
	}
}
