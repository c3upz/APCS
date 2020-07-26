package WarmUp;

import java.util.Arrays;

public class RecursionPractice {
	public static void main(String[]args){
		int lengthOfArr = 20;
		int index = 0;
		int[] arr = randomArray(lengthOfArr);
		System.out.println(Arrays.toString(arr));
		numberOfEvens(arr, index);
		System.out.println(numberOfEvens(arr, index));
	}

	static int numberOfEvens(int[] arr, int index) {
		//basecase
		if(index == arr.length){
			return 0;
		}
		//everyoneelse
		if(arr[index] % 2 == 0){
			return 1 + numberOfEvens(arr, index + 1);
		}else if(arr[index] % 2 != 0){
			return 0 + numberOfEvens(arr, index + 1);
		}
		return 0;
		
	}

	static int[] randomArray(int lengthOfArr) {
		int[] tempArr = new int[lengthOfArr];
		for(int i = 0; i < tempArr.length; i++){
			int tempVar = (int)(Math.random() * 10) + 1;
			tempArr[i] = tempVar;
		}
		
		return tempArr;
	}
}
