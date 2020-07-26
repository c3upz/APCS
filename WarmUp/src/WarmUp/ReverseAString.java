package WarmUp;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[]args){
		String s = "kcus my kcoc";
		reverseEveryOtherWord(s);
	}

	private static void reverseEveryOtherWord(String s) {
		int counter = 0;
		for (char c : s.toCharArray()) {
		    if (c == ' ') {
		         counter++;
		    }
		}
		
		Scanner scan = new Scanner(s);
		String words[] = new String[counter + 1];
		
		for(int i = 0; i < counter; i ++){ 
			words[i] = scan.next();	
		}
		
		for(int j = 0; j < words.length; j+=2){
			for(int c = words[j].length(); c > 0; c--){
				String temp = "";
				
			}
			//temp = words[j];
		}
		
		System.out.println(words);
	}
	
	
}
