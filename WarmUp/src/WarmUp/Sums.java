package WarmUp;

import java.lang.reflect.Array;

public class Sums {
	public static void main(String[]args){
		int n = 10;
		int[] arr = {1, 3, 5, 6, 7, 10, 11};

		sumPairExists(arr, n);
		System.out.println(sumPairExists(arr, n));
	}


	private static boolean sumPairExists(int[] arr, int n) {
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(j == i){
					continue;
				}
				if(arr[i] + arr[j] == n){
					return true; 
				}
			}
		}
		return false;
	}
}
