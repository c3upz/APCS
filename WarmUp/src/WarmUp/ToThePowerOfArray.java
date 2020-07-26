package WarmUp;

import java.util.Arrays;

public class ToThePowerOfArray {
	
	public static void main(String[] args) { 
		int[] powerOf = {1 , 2, 3, 4, 5};
		toThePowerOf(powerOf);
		for(int i = 0; i < powerOf.length; i++){
		}
		System.out.println(Arrays.toString(powerOf));
	}

	public static int[] toThePowerOf(int[] powerOf) {
		for(int i = 0; i < powerOf.length; i++){
			powerOf[i] = (int) Math.pow(2, powerOf[i]);
		}
		return powerOf;
	}
}
