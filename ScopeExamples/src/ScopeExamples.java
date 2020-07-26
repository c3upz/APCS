
public class ScopeExamples {
	static int x;

	public static void main(String[] args) { 

		for(x = 0; x < 100; x++){
			System.out.println("right now x is : " + x);
		}

		//System.out.println("The last thing that x was equal to was: " + x);
		coolMethod();
	}

	public static void coolMethod(){
		System.out.println("The last thing x was equal to was: " + x);
	}
}
