import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	private static Scanner s;

	public static void main (String[] args){
		s = new Scanner (System.in);
		Random compNum = new Random();
		System.out.print("Hello! Welcome to rock, paper, scissors. Please enter your name:");
		String userName = s.next();
		boolean playing = true;

		System.out.println("Hello " + userName + "!");

		while(playing = true) {
			int compScore = 0;
			int userScore = 0;
			for(userScore = userScore; userScore < 3 && compScore < 3;) {		
				int compChoice = compNum.nextInt(3);
				System.out.print("Type in either rock, paper, or scissors: " );
				String userChoice = s.next();

				if (userChoice.equalsIgnoreCase("rock")){ //1= rock 2= paper 3= scissors
					if (compChoice == 0){
						System.out.println("You tie!");
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}else if (compChoice == 1){
						System.out.println("You lose!");
						compScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);

					}else if (compChoice == 2){
						System.out.println("You Win!");
						userScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}
				}else if (userChoice.equalsIgnoreCase("paper")){
					if (compChoice == 0){
						System.out.println("You Win!");
						userScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}else if (compChoice == 1){
						System.out.println("You tie!");
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}else if (compChoice == 2){
						System.out.println("You lose");
						compScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}
				}else if (userChoice.equalsIgnoreCase("scissors")){
					if (compChoice == 0){
						System.out.println("You lose!");
						compScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}else if (compChoice == 1){
						System.out.println("You win!");
						userScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}else if (compChoice == 2){
						System.out.println("You tie!");
						userScore++;
						System.out.println(userName + ": " + userScore);
						System.out.println("Computer: " + compScore);
					}
				}
			}

			if (userScore == 3){
				System.out.println("The final score was:\n" + userName + "= " + userScore + "\nComputer= " + compScore);
			}else if (compScore ==3) {
				System.out.println("The final score was\n" + userName + "= " + userScore + "\nComputer:" + compScore);
			}

			System.out.print("Do you want to play again? Yes or no? ");
			String playAgain = s.next();

			if (playAgain.equalsIgnoreCase("yes")) {
				playing = true;
			}else if (playAgain.equalsIgnoreCase("no")){
				playing = false;
				return;
			}else{
				return;
			}
		}
	}
}