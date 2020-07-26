import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[]args){
		String[][] tables = new String[3][4];
		tables[0][0] = "Aaron";
		tables[0][1] = "Chris";
		tables[0][2] = "James";
		tables[0][3] = "Anna";
		tables[1][0] = "Ian";
		tables[1][1] = "Brain";
		tables[1][2] = "Jade";
		tables[1][3] = "Kirk";
		tables[2][0] = "Kyle";
		tables[2][1] = "Connor";
		tables[2][2] = "Liam";
		tables[2][3] = "Dylan";
		
		
		//System.out.println(Arrays.deepToString(tables));
		twoDArray();
	}

	private static void twoDArray() {
		String[][] sample;
		sample = new String[4][];
		
		sample[0] = new String[4];
		sample[0][0] = "Chris";
		sample[0][1] = "James";
		sample[0][2] = "Mark";
		sample[0][3] = "Lucas";
		
		sample[1] = new String[2];
		
	}
}
