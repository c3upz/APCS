import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); //scanner for user input	
		float numA; //defining varibles 
		float numB;
		System.out.println("Enter your first number: ");
		numA = userInput.nextFloat();	//where I take in input for the first number
		System.out.println("Enter:\n+ for addition\n- for subtraction\n* for multiplication\n and \\ for divsion");
		char function = userInput.next().charAt(0);	//where I take in input which operation
		if (function == '*'){
			System.out.println("Enter your second number: "); 
			numB = userInput.nextFloat();
			System.out.print("= ");
			System.out.println(numA * numB);
		}
		if (function == '/'){
			System.out.println("Enter your second number: ");
			numB = userInput.nextFloat();
			System.out.print("= ");
			System.out.println(numA / numB);
		}	
		if (function == '+'){
			System.out.println("Enter your second number: ");
			numB = userInput.nextFloat();
			System.out.print("= ");
			System.out.println(numA + numB);
		}
		if (function == '-'){
			System.out.println("Enter your second number: ");
			numB = userInput.nextFloat();
			System.out.print("= ");
			System.out.println(numA - numB);
		}
	}
}
	
	