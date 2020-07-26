package WarmUp;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.print("Please enter something: ");
		String phrase = s.nextLine();
		System.out.print(ascending(phrase));

	}

	public static boolean ascending(String str){
		str = str.toLowerCase();
			
			for(int i = 1; i < str.length(); i++){
				if(str.charAt(i) < str.charAt(i-1)){
					return false;
				}
				if(str.equals("-1")){
					break;
				}
			}
		return true;
	}
}
