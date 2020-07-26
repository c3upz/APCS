import java.util.Scanner;


public class SpaceNeedle {

	public static final int size = spaceNeedleSize();

	public static void main(String[] args){
		//creating a program that takes user input and outputs
		//a space needle that size depends on the user input
		smallShaft();
		topBall();
		bottomBall();
		smallShaft();
		largeShaft();
		topBall();

	}

	public static int spaceNeedleSize(){
		System.out.print("What size would you like the Space Needle to be? (1 - \u221e) ");
		Scanner s = new Scanner (System.in);
		return s.nextInt();
	}

	public static void smallShaft(){ //i = height. j = spaces.
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size * 3; j++){
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}


	public static void topBall(){
		for(int height = 0; height < size; height++){ //i = height. j = spaces.
			for(int spaces = 0; spaces < (-3 * (height + 1) + (3 * size)); spaces++){
				System.out.print(" ");
			}

			System.out.print("__/");
			for(int i = 0; i < height * 3; i++){
				System.out.print(":");
			}

			System.out.print("||");
			for(int i = 0; i < height * 3; i++){
				System.out.print(":");
			}

			System.out.print("\\__");
			System.out.println();
		}

		System.out.print("|");
		for(int i = 0; i < size * 6; i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}

	public static void bottomBall(){
		for(int height = 0; height < size; height++){
			for(int space = 0; space < height * 2; space++){
				System.out.print(" ");
			}

			System.out.print("\\_/");
			for(int i = 0; i < (-2 * height) + ((size * 3) - 2); i++){
				System.out.print("\\/");
			}
			System.out.println("\\_/");
		}
	}

	public static void largeShaft(){
		for(int height = 0; height < size * 4; height ++){
			for(int space = 0; space <  (2 * size) + 1; space ++){
				System.out.print(" ");
			}

			System.out.print("|");
			for(int i = 0; i < size - 2; i ++){
				System.out.print("%");
			}
			System.out.print("||");


			for(int i = 0; i < size - 2; i ++){
				System.out.print("%");
			}

			System.out.println("|");
		}
	}

}
