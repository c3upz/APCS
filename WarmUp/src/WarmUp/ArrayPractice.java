package WarmUp;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args){
		String [] arr = {"a", "b" , "c"};
		String str = "d";
		int index = 1;
		System.out.println(Arrays.toString((ahhhhhhhh(arr, str, index))));
	}

	public static String[] ahhhhhhhh(String[] arr, String str, int index) {
		String[] aa = new String[arr.length + 1];
		for(int i = 0; i < index; i++){
			aa[i] = arr[i];
		}
		aa[index] = str;
		for(int c = index + 1; c < aa.length; c++){
			aa[c] = arr[c - 1];
		}
		return aa;
	}
}
