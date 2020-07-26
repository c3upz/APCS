import java.util.Arrays;

public class BubbleSort {
	public static void main(String[]args){
		int[] myList = {3, 38, 88 ,2 ,5 ,50};
		bubbleSort(myList);
		System.out.println(Arrays.toString(myList));
	}

	private static void bubbleSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}