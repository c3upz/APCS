import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Pig {
	//2 players take turns rolling a 6 sided dice
	//during a turn the player rolls the dice until they
	//1. Choose not to roll the dice anymore
	//2. or they roll a '1' then all of the rolls till then are added up and
	//there turn ends
	public static Scanner s = new Scanner(System.in);
	public static Random r = new Random();

	public static void main(String[]args){
		System.out.println("Welcome to the game 'Pig'!");
		System.out.println();
		String player1Name = promptPlayerName();
		String player2Name = promptPlayerName();
		int player1Score = 0;
		int player2Score = 0;
		int WIN = 100;
		while(player1Score < WIN && player2Score < WIN){
			printCurrentScore(player1Name, player1Score, player2Name, player2Score);

			int player1TurnScore = playerTurn(player1Name);
			player1Score += player1TurnScore;

			int player2TurnScore = playerTurn(player2Name);
			player2Score += player2TurnScore;

		}
		
		printPigResults(player1Name, player1Score, player2Name, player2Score);
		
	}

	private static void printPigResults(String player1Name, int player1Score, String player2Name, int player2Score) {
		System.out.println("_____________Results________________");
		if(player1Score > player2Score){
			System.out.println(player1Name + " won!");
		}
		
		if(player1Score < player2Score){
			System.out.println(player2Name + " won!");
		}
		
		System.out.println("GAMEOVER! Thanks for playing!");
	}

	private static int playerTurn(String playerName) {
		System.out.println();
		System.out.println(playerName + "'s turn");

		boolean playerRoll = true;
		int turnScore = 0;
		String choice;

		while(playerRoll){
			int roll = r.nextInt(6) + 1;

			if(roll == 1){
				System.out.println(playerName + " rolled " + roll);
				System.out.println(playerName + " recieved 0 points this turn! :(");
				return 0;
			}
			
			System.out.println(playerName + " rolled " + roll);
			turnScore += roll;
			System.out.println(playerName + " has " + turnScore + " so far.");
			System.out.println("Type 'roll' to roll again");
			System.out.println("Type 'hold' to hold");
			System.out.print("Choice: ");
			choice = s.nextLine();

			if (choice.equalsIgnoreCase("hold")){
				playerRoll = false;
			}
		}
		System.out.println(playerName + " got " + turnScore + " points.");
		return turnScore;
	}

	private static void printCurrentScore(String player1Name, int player1Score, String player2Name, int player2Score) {
		System.out.println();
		System.out.println(player1Name + ":" + player1Score + "   ");
		System.out.println(player2Name + ":" + player2Score + "   ");
		System.out.println();

	}

	private static String promptPlayerName() {
		System.out.print("Enter player name: ");
		return s.nextLine();
	}

}