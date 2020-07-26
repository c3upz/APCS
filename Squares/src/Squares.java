
public class Squares {
	public static void main(String[]args){
		int n = 5;
		int[][] first = squareOne(n);
		print(first);
	}

	private static void print(int[][] array) {
		for(int[] rows : array){
			for(int num : rows){
				System.out.print(num + "");
			}
			System.out.println();
		}
	}

	private static int[][] squareOne(int n) {
		int[][] array = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				array[i][j] = i;
			}
		}
		return array;		
	}
} 
