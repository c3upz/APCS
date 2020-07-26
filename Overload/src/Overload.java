import java.util.Scanner;

public class Overload {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a value for the first number: ");
		int firstNum = s.nextInt();
		System.out.println("Enter a value for the second number: ");
		int secondNum = s.nextInt();
		System.out.println("Enter a value for the third number: ");
		int thirdNum = s.nextInt();
		System.out.println("Enter a value for the forth number: ");
		int forthNum = s.nextInt();
		System.out.println("The greatest of the 4 numbers is: " + biggestOf(firstNum, secondNum, thirdNum, forthNum));
	}
	
	public static int biggestOf(int a, int b, int c, int d){
		int biggestSoFar = Math.max(a, b);
		int finalBiggest = Math.max(c, biggestSoFar);
		return finalBiggest;
	}
}
