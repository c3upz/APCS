package WarmUp;

import java.util.Arrays;
import java.util.Random;

public class BooleanArray {
	public static void main(String[] args){
		System.out.println(Arrays.toString(randomBooleanArray(10)));
	}
	
	public static boolean[] randomBooleanArray(int max){
		Random rand = new Random();
		int x = rand.nextInt(max) + 1;
		boolean[] booleanArray = new boolean[x];
		for(int i = 0; i < x; i++){
			int c = rand.nextInt(2);
			boolean booVal = false;
			if(c == 0){
				booVal = true;
			}else{
				booVal = false;
			}
			booleanArray[i] = booVal;
			
		}
		return booleanArray;
	}
}
