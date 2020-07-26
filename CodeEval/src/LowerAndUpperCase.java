import java.util.Scanner;
public class LowerAndUpperCase {

	public static void main(String[] args) {
		//creating this program to take input from a user and correct the case from upper 
		//to lower
		Scanner s = new Scanner (System.in);
		System.out.println("Hello and welcome to my CaseChanger!");
		System.out.print("Please enter a word/phrase: ");
		String userInput = s.nextLine();
		String changer = userInput.toLowerCase();
		System.out.println(changer);
		System.out.println();
	
	}
	
}
