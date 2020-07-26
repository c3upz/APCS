import java.util.Scanner;

public class ForLoopsAreCool {
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);
		System.out.print("How many [] do you want to print: ");
		int numTangles = userInput.nextInt();
		
		for(int i = 1; i <= numTangles; i++){
			System.out.println("For [] #" + i);
			System.out.print("What do you want the height to be? ");
			int height = userInput.nextInt();
			System.out.println();
			System.out.print("What do you want the width to be? ");
			int width = userInput.nextInt();
			System.out.println();
			for(int h = 0; h < height; h++){
				for(int w = 0; w < width; w++){
					System.out.print("[]");
				}
				System.out.println();
			}
		}
		
	}
}
