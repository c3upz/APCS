import java.util.Scanner;
public class ScannersAreCool {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String userName = userInput.nextLine();
		System.out.println("Hello, " + userName + "! " + "Welcome to my MadLib!");
		String[] words = new String[7];
		System.out.print("Please enter a plural noun: ");
		words[0] = userInput.next();
		System.out.print("\nPlease enter an occupation: ");
		words[1] = userInput.next();
		System.out.print("\nPlease enter a animal (plural): ");
		words[2] = userInput.next();
		System.out.print("\nPlease enter an occupation: ");
		words[3] = userInput.next();
		System.out.print("\nPlease enter plural: ");
		words[4] = userInput.next();
		System.out.print("\nPlease enter a verb: ");
		words[5] = userInput.next();
		System.out.print("\nPlease enter a noun: ");
		words[6] = userInput.nextLine();
		System.out.println("In the book War of the " + words[0] + " the main character is an anonymous " + words[1]);
		System.out.println("who records the arrival of " + words[3] + " in " + words[4] +". Needless to say, havoc reigns as the");
		System.out.println(words[5] + "continue to" + "everything in sight, until they are killed by the ");
		System.out.println("common " + words[6]);
	}

}

