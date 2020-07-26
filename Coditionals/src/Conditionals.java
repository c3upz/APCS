import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Favorite number?");
		int userNumber = s.nextInt();
		s.nextLine();

		//basic if 
		if(userNumber == 9){ //inside must result in true of false BOOLEAN
			System.out.println("NO WAY ME TOO!!!");
		}	
		System.out.println("See you later!");


		//basic if/else
		System.out.print("Guess what word im thinking of: ");
		String guess = s.nextLine();
		if(guess.equalsIgnoreCase("Oats")){
			System.out.print("You guessed it!");
		}else{
			System.out.print("You did not guess correctly");
		}
		System.out.println();

		//basic if/else if/else
		System.out.print("Are you 18 years old or older? ");
		String anwser = s.nextLine();
		if(anwser.equalsIgnoreCase("Yes")){
			System.out.print("You are an adult");
		}else if(anwser.equalsIgnoreCase("No")){
			System.out.println("You are a minor");
		}else{
			System.out.print("You are probably dead!");
		}

	}
}
