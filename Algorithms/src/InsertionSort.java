import java.util.Arrays;

public class InsertionSort {
	public static void main(String[]args){
		int[] myList = {3, 38, 88 ,2 ,5 ,50};
		selectedSort(myList);
		System.out.println(Arrays.toString(myList));
	}

	private static void selectedSort(int[] arr) {
		int temp;
		for(int i = 1; i < arr.length;i++){
			while(i > 0 && arr[i] < arr[i - 1]){
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
				i--;
			}
		}
		
	}
}
