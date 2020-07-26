package WarmUp;

import java.util.Arrays;

public class Recursion {
	public static void main(String[]args){
		int length = 9;
		int index = 0;
		//System.out.println(Arrays.toString(randomBoolArray(length)));
		boolean[] randArray = randomBoolArray(8);
		System.out.println(Arrays.toString(randArray));
		System.out.println((numberOfTrues(randArray)));
		System.out.println((numberOfFalse(randArray, index)));
	}

	static int numberOfFalse(boolean[] arr, int index) {
		//basecase
		if(index == arr.length){
			return 0;
		}
		//everyone else
		if(arr[index] == false){
			return 1 + numberOfFalse(arr, index+ 1);
		}else{
			return 0 + numberOfFalse(arr, index+ 1);
		}
	}

	static int numberOfTrues(boolean[] arr) {
		int counter = 0;
		for(boolean b : arr){
			if(b == true){
				counter++;
			}
		}
		return counter;
	}
	
	

	static boolean[] randomBoolArray(int length) {
		boolean[] arr = new boolean[length];
		for(int i = 0; i < length; i ++){
			arr[i] = (Math.random() >= .5);
		}
		return arr;
	}
	
	
}
