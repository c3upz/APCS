import java.util.Scanner;


public class Stairs {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("How many stairs do you want? ");
		int numStairs = s.nextInt();
		
		for(int i = 0; i > numStairs; i++){
			
			
			for(int j = 0; j > (numStairs + 1) * 5; j++){
				System.out.println(" ");
			}
		}
	}
}
