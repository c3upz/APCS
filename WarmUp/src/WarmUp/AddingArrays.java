package WarmUp;

public class AddingArrays {
	public static void main(String [] args){
		int [] a = {1, 2, 3, 4};
		int [] b = {1, 2, 3, 4};
		int aVal = productOf(a);
		int bVal = productOf(b);
		signOf(a);
		signOf(b);

	}

	public static int productOf(int[] c){
		int [] temp1 = c;
		int tempVal = 1;
		for(int i = 0; i < temp1.length; i++){
			tempVal *= temp1[i];
		}
		return tempVal;
	}
	
	public static boolean signOf(int[] c){
		boolean sign = true;
		
		for(int i : c){
			
		}
		return false;
		
	}
}
