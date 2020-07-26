package WarmUp;

import java.util.Scanner;

public class monthApart {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[]args){
		System.out.println("Please enter your first date in integers:");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Please enter your second date in integers:");
		int c = s.nextInt();
		int d = s.nextInt();
		monthApart(a, b, c, d);
		System.out.println(monthApart(a,b,c,d));
	}

	private static boolean monthApart(int month, int day, int month2, int day2) {
		if(Math.abs(month - month2) >= 2){
			return true;
		}

		if(Math.abs(month - month2) < 1){
			return false;
		}

		if(Math.abs(month - month2) == 1){
			if(day > day2){
				return false;
			}
			if(day <= day2){
				return true;
			}
		}
		return false;
	}
}
