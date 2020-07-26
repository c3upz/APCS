import java.util.Scanner;
import java.util.Random;

public class Returns {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Welcome to my Guessing Game!");
		System.out.println("Choose a number between 1 and 50: ");
		int userChoice = s.nextInt();
		s.nextLine();
		Random compNum = new Random();
		int compChoice = compNum.nextInt();
		
		boolean closeGuess = isCloseGuess(userChoice);
		System.out.println("It is " + trueOrFalse + " that you guess was close.");
	}
	
	
	public static boolean isCloseGuess(int userChoice){
		int distanceFromMyNumberPlus = userChoice + 5;
		int distanceFromMyNumberSub = userChoice - 5;
		boolean trueOrFalse = ();
		
	}
}
