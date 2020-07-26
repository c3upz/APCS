import java.util.Arrays;
import java.util.Scanner;

public class SquareSize { 
	public static void main (String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("What size of square would you like?");
		int sqSize = s.nextInt();
		int[][] square = new int[sqSize][sqSize];
		
		ends(sqSize);
		
		//firstHalf(sqSize, square);
		secondHalf(sqSize, square);

		ends(sqSize);
	}
 
	public static void secondHalf(int size, int[][] sq) {
		for(int i = 1; i < size - 1; i++){
			for(int c = 0; c < size; c++){
				sq[i][c] = c;
			}
		}
		System.out.println(Arrays.deepToString(sq));
	}

//	public static void firstHalf(int sqSize, int[][] square) {
//		
//	}

	public static void ends(int sqSize1) {
		for(int c = 0; c < sqSize1; c++){
			System.out.print("0");
		}
		System.out.println();
	}
}
