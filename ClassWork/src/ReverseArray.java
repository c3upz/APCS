import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("How long would you like the array to be? ");
		int arrayLength = s.nextInt();
		Random r = new Random();
		char[] rev = new char[arrayLength];
		char holder;
		for(int i = 0; i < arrayLength; i++){
			char c = (char)(r.nextInt(arrayLength) + 'a');
			rev[i] = c;
		}
		System.out.println("the original char array is: " + Arrays.toString(rev));
		revArray((rev));
	}

	public static void revArray(char[] rev) {
		System.out.print("the revearse array is: ");
		System.out.print("[");
		for (int i = rev.length-1; i >= 0 ; i--){
			if(i == rev.length-1) System.out.print(rev[i]);
			else System.out.print(", " + rev[i]);
		}
		System.out.println("]");
	}
}
