import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
	public static void main (String[]args){
		System.out.print("Please enter the number of rows you want to have in 'Pascals Triangle'?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pTriangle[][] = new int [n][];
		createTriangle(pTriangle);
		printOut(pTriangle);
	}

	public static void printOut(int[][] finalTri) {
		for(int i = 0; i < finalTri.length; i++){
			for(int j = 0; j < finalTri[i].length; j++){
				System.out.print(finalTri[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] createTriangle(int[][] tri) {
		for(int i = 0; i < tri.length; i++){
			tri[i] = new int [i + 1];
		}
		for(int i = 0; i < tri.length; i++){
			tri[i][0] = 1;
			tri[i][i] = 1;
			for(int j = 1; j < i; j++){
				tri[i][j] = (tri[i-1][j-1] + tri[i-1][j]);
			}
		}
		return tri;
	}
}
