import java.util.Random;
import java.util.Scanner;

public class MyRocketLab {
	
													//all drawings in this code use unicode in conjunction with 
													//keyboard characters
	public static void main (String[] args){
		starsClouds();          //static methods 
		airPlane();
		spaceshipHead();
		shipWings();
		shipTail();
		shipThrusters();
		shipFlame();
		spaceDate();
		rpsGame();
	}
	
	public static void starsClouds(){ //drawing the clouds and stars above the rocketships
		System.out.print("\u2606" + "\t\t\u2606" + "\t   \u2606" + "\t\t \u2606" + "\t\t \u2606" + "\t\t   \u2606" + "\t\t     \u2606");
		System.out.println("\t    \u2606" + "\t\t\u2606" + "\t   \u2606" + "\t\t \u2606" + "\t\t \u2606" + "\t\t   \u2606" + "\t\t     \u2606");
		System.out.print("    \u2606" + "\t\t  \u2606" + "\t\t\t\u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t \u2606");
		System.out.println("    \u2606" + "\t\t  \u2606" + "\t\t\t\u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t \u2606");
		System.out.print("   \u2606" + "\t\t \u2606" + "\t\t    \u2606" + "\t\t \u2606" + "\t\t  \u2606" + "\t\t  \u2606");
		System.out.println("   \u2606" + "\t\t \u2606" + "\t\t    \u2606" + "\t\t \u2606" + "\t\t  \u2606" + "\t\t  \u2606");
		System.out.print("       \u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t\u2606");
		System.out.println("       \u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t\u2606" + "\t\t\t\u2606" + "\t\t\u2606");
		System.out.println("\u2601" + "\t\t\u2601" + "\t\t\t\u2601" + "\t\t\u2601" + "\t\t\t\t\u2601" + "\t\t\u2601" + "\t\t\u2601" + "\t\t\t\u2601" + "\t\t\u2601" + "\t\t\t\t\u2601");
	}
	
	public static void airPlane(){ //creating random airplanes in the background
		Random randomGenerator = new Random(); //creating a random number.
		int randomNumber = randomGenerator.nextInt(10); //declaring int and setting it to random number
														//each random number = a new spot on the screen
		if (randomNumber == 1) {
			System.out.println("\t \u2708");
		}
		
		if (randomNumber == 2) {
			System.out.println("\t\t \u2708");
		}
		
		if (randomNumber == 3) {
			System.out.println("\t\t\t \u2708");
		}
		
		if (randomNumber == 4) {
			System.out.println("\t\t\t\t \u2708");
		}
		
		if (randomNumber == 5) {
			System.out.println("\t\t\t\t\t \u2708");
		}
		
		if (randomNumber == 6) {
			System.out.println("\t\t\t\t\t\t \u2708");
		}
		
		if (randomNumber == 7) {
			System.out.println("\t\t\t\t\t\t\t \u2708");
		}
		
		if (randomNumber == 8) {
			System.out.println("\t\t\t\t\t\t\t\t \u2708");
		}
		else {
			System.out.println("\t\t\t\t\t\t\t\t\t \u2708");
		}
	}
	public static void spaceshipHead(){ //drawing the head of the ship using unicode
		System.out.println("\n\n\t\t\t\u25B2" + "\t\t\t\t\t\t\t\t\t\t\u256D\u2501\u256E");
		System.out.println("\t\t       / \\"  +  "\t\t\t\t\t\t\t\t\t\t|   |");
		System.out.println("\t\t      /   \\"  +  "\t\t\t\t\t\t\t\t\t\t|   |");
		System.out.println("\t\t  \u2581\u2571\t    \u2572\u2581" + "\t\t\t\t\t\t\t\t\t       \u2571    \u2572");
		System.out.println("\t\t  \u258F\t       \u258F" + "\t\t\t    SPACE RACE\t\t\t\t     \u2571\t       \u2572");
		System.out.println("\t\t\u2571\t       \u2572" + "\t\t\t\t\t\t\t\t    \u2502\t\t \u2502");
		System.out.println("\t      \u2571\t\t\t \u2572" + "\t\t\t\t\t\t\t\t    \u2502\t\t \u2502");
		System.out.println("\t    \u2571\t\t\t   \u2572" + "\t\t\t\t\t\t\t\t   \u2571\t\t  \u2572");
		System.out.println("\t   \u2501\u2501\u2501 \t\t \u2501\u2501\u2501" + "\t\t\t\t\t\t\t\t \u2571\t\t    \u2572");
		System.out.println("\t       \u2503\t\t\u2503" + "\t\t\t\t\t\t\t\t\u2503\t\t     \u2503");
		System.out.println("\t       \u2503\t\t\u2503" + "\t\t\t\t\t\t\t\t\u2503\t\t     \u2503");
		System.out.println("\t       \u2503\t\t\u2503" + "\t\t\t\t\t\t\t\t \u2572\t\t    \u2571");
	}
		
	public static void shipWings(){ //drawing the ships wings using unicode
		System.out.println("\t      \u2571\t\t\t \u2572" + "\t\t\t\t\t\t\t\t \u25C0\t\t    \u25b6");
		System.out.println("\t    \u2571\t\t\t   \u2572" + "\t\t\t\t\t\t\t        \u2571\t\t     \u2572");
		System.out.println("\t  \u2571\t\t\t     \u2572" + "\t\t\t\t\t\t\t      \u2571\t\t\t       \u2572");
		System.out.println("\t\u2571\t\t\t       \u2572" + "\t\t\t\t\t\t    \u2571\t\t\t\t \u2572");
		System.out.println("      \u2571\t\t       USA\t\t \u2572" + "\t\t\tVS.\t\t\t  \u2571\t\t\u262DUSSR\t\t   \u2572");
		System.out.println("    \u2571\t\t\t\t\t   \u2572" + "\t\t\t\t\t\t\u2571\t\t\t\t     \u2572");
		System.out.println("  \u2571\t\t\t\t\t     \u2572" + "\t\t\t\t\t      \u2571\t\t\t\t\t       \u2572");
		System.out.println("  \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \t\t\u2501 \u2501 \u2501 \u2501 \u2501 \u2501 " + "\t\t\t\t     \u2501 \u2501 \u2501 \u2501 \u2501 \u2501  \t\t   \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 ");
	}
	
	public static void shipTail(){ //drawing the tail of the ship using unicode
		System.out.println("\t\t\u2502\t\t\u2502" + "\t\t\t\t\t\t\t\t   \u2502\t\t  \u2502");
		System.out.println("\t\t\u2502\t\t\u2502" + "\t\t\t\t\t\t\t\t   \u2502\t\t  \u2502");
		System.out.println("\t\t\u2502\t\t\u2502" + "\t\t\t\t\t\t\t\t   \u2502\t\t  \u2502");
		System.out.println("\t\t\u2514 \u2501 \u2501      \u2501 \u2501" + "\t\t\t\t\t\t\t\t   \u2502\t\t  \u2502");
	}
	
	public static void shipThrusters(){ //drawing the thrusters of the ship using unicode
		System.out.println("\t\t     \u2571\t    \u2572" + "\t\t\t\t\t\t\t\t\t  \u2571\t\t  \u2572" );
		System.out.println("\t\t   \u2571\t      \u2572" + "\t\t\t\t\t\t\t\t\t\u2571\t\t    \u2572");
		System.out.println("\t\t\u2501\u2501\t\t\u2501\u2501" + "\t\t\t\t\t\t\t      \u2571\t\t\t      \u2572");
		System.out.println("\t     \u2571\t\t\t    \u2572" + "\t\t\t\t\t\t\t     \u2502\t\t\t        \u2502");
		System.out.println("\t    \u2502\t\t\t      \u2502" + "\t\t\t\t\t\t\t     \u2502\t\t\t        \u2502");
		System.out.println("\t    \u2502\t\t\t      \u2502" + "\t\t\t\t\t\t\t     \u2502\t\t\t        \u2502");
		System.out.println("\t     \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501" + "\t\t\t\t\t\t\t      \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501 \u2501  \u2501 \u2501 ");
	}
	
	public static void shipFlame(){ //drawing the flames coming out of the ships thrusters
		System.out.println("\t    /////////////\\\\\\\\\\\\\\\\\\\\\\\\\\" + "\t\t\t\t\t\t\t      /////////////\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\t      ///////////\\\\\\\\\\\\\\\\\\\\\\" + "\t\t\t\t\t\t\t        ///////////\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\t        /////////\\\\\\\\\\\\\\\\\\" + "\t\t\t\t\t\t\t          /////////\\\\\\\\\\\\\\\\\\");
		System.out.println("\t          ///////\\\\\\\\\\\\\\" + "\t\t\t\t\t\t\t            ///////\\\\\\\\\\\\\\");
		System.out.println("\t             ////\\\\\\\\" + "\t\t\t\t\t\t\t\t               ////\\\\\\\\");
		System.out.println("\t              ///\\\\\\" + "\t\t\t\t\t\t\t\t                ///\\\\\\");
		System.out.println("\t               //\\\\" + "\t\t\t\t\t\t\t\t                 //\\\\");
		System.out.println("\t                /\\" + "\t\t\t\t\t\t\t\t                  /\\");
		System.out.println("\t                \\/" + "\t\t\t\t\t\t\t\t                  \\/");
	}
	
	public static void spaceDate(){ //writing the dates at the bottom of the ship picture
		System.out.println("\n\n\t\tJanuary 31, 1958." + "\t\t\t\t\t\t\t\t    April 12, 1961.");
		
	}
	
	public static void rpsGame(){ //creating a rock paper scissors game at the bottom of the picture
		Scanner userInput = new Scanner(System.in); //creating a variable that will receive input from user
		System.out.println("Hello and welcome to Space RPS Game");
		System.out.print("Please enter your name:");
		String name = userInput.next(); //setting variable "name" to be the same as the variable that has the user input stored
		System.out.println("Hello " + name + "," + "\nIn this game you will assume the role of either the United States or the Soviet Union.");
		System.out.println("Type \"US\" for the United States or type \"USSR\" for the Soviet Union:");
		String team  = userInput.next(); //user input into the variable team
		int userScore = 0; // variable
		int compScore = 0;
		
			if (team.equalsIgnoreCase("US")){
				System.out.println("You are now incharge of directing the US through the Space Race!");
				System.out.println("You will score points by winning battles! First to 3 wins!");
				System.out.println("You will fight battle using rock, paper, or scissors.");
				System.out.println("Lets Get Started!");
				while (userScore < 3 && compScore < 3){
				System.out.println("Place your move by typing either: rock, paper, or scissors.");
				String userChoice = userInput.next();	
				Random randoNum = new Random();
				int rpsNumber = randoNum.nextInt(4); //random#
					if (userChoice.equalsIgnoreCase("rock")){ //rock = 1, paper = 2, and scissors = 3
						if (rpsNumber == 1){
							System.out.println("Tie!");
							System.out.println("The computer choice was rock aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("You lose!");
							System.out.println("The computer choice was paper.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("You win!");
							System.out.println("The computers choice was scissors.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
					}
					if (userChoice.equalsIgnoreCase("paper")){
						if (rpsNumber == 1){
							System.out.println("You Win!");
							System.out.println("The computer choice was rock.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("Tie!");
							System.out.println("The computer choice was paper aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("You Lose!");
							System.out.println("The computers choice was scissors.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
					}
					if (userChoice.equalsIgnoreCase("scissors")){
						if (rpsNumber == 1){
							System.out.println("You lose!");
							System.out.println("The computer choice was rock.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("You win!");
							System.out.println("The computer choice was paper aswell.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("Tie!");
							System.out.println("The computers choice was scissors aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("USSR score is: " + compScore);
						}
					}
					}
				if (compScore == 3 || userScore == 3) {  //not exactly sure how to tell comp to do this after while loop
					if (compScore == 3){
						System.out.println("You led the " + team + " to defeat. :(");
					}
					if (userScore == 3) {
						System.out.println("You led the " + team + " to victory! :)");
					}
			}
			}
			
			if (team.equalsIgnoreCase("USSR")){
				System.out.println("You are now incharge of directing the USSR through the Space Race!");
				System.out.println("You will score points by winning battles! First to 3 wins!");
				System.out.println("You will fight battle using rock, paper, or scissors.");
				System.out.println("Lets Get Started!");
				while (userScore < 3 && compScore < 3){
					System.out.println("Place your move by typing either: rock, paper, or scissors.");
					String userChoice = userInput.next();	
					Random randoNum = new Random();
					int rpsNumber = randoNum.nextInt(4);
					if (userChoice.equalsIgnoreCase("rock")){ //rock = 1, paper = 2, and scissors = 3
						if (rpsNumber == 1){
							System.out.println("Tie!");
							System.out.println("The computer choice was rock aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("You lose!");
							System.out.println("The computer choice was paper.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("You win!");
							System.out.println("The computers choice was scissors.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
					}
					if (userChoice.equalsIgnoreCase("paper")){
						if (rpsNumber == 1){
							System.out.println("You Win!");
							System.out.println("The computer choice was rock.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("Tie!");
							System.out.println("The computer choice was paper aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("You Lose!");
							System.out.println("The computers choice was scissors.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
					}
					if (userChoice.equalsIgnoreCase("scissors")){
						if (rpsNumber == 1){
							System.out.println("You lose!");
							System.out.println("The computer choice was rock.");
							compScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 2){
							System.out.println("You win!");
							System.out.println("The computer choice was paper aswell.");
							userScore++;
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
						if (rpsNumber == 3){
							System.out.println("Tie!");
							System.out.println("The computers choice was scissors aswell.");
							System.out.println("Your Score is: " + userScore);
							System.out.println("US score is: " + compScore);
						}
					}	
				}
			if (compScore == 3 || userScore == 3) {  //not exactly sure how to tell comp to do this after while loop
					if (compScore == 3){
						System.out.println("You led the " + team + " to defeat. :(");
					}
					if (userScore == 3) {
						System.out.println("You led the " + team + " to victory! :)");
					}
			}
			}
		}	
	}	
	
	

