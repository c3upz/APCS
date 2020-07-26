import java.util.Scanner;
import java.util.Random;


public class BattleShip {
	public static void main(String[] args) { 
		board();
		gamePlay();
	}
	
	
	
	public static void board() {
		System.out.println("  Battle Ship");
		for (int i = 0; i < 8; i++) { 
			for (int j = 0; j < 8; j++){
				System.out.print("[]");
			}
			
			System.out.println();
		}
	}
	
	public static void gamePlay() {
		System.out.println("Hello and welcome to BattleShip!");
		System.out.println();
	}
	
}