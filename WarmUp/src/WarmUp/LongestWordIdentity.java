package WarmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestWordIdentity {
	public static void main (String [] args){
		String myString = "The is the easiest warm up ever!";
		longestWord(myString);
	}

	private static void longestWord(String myString) {
		String[] splitSentence = myString.split(" ");
		
		int counter = 1;
		String longest = splitSentence[0];
		for(int i = 1; i < splitSentence.length; i++){
			if(splitSentence[i].length() > longest.length()){
				longest = splitSentence[i];
				counter = i + 1;
			}
		}
		System.out.println(longest + " is the longest word and it is the " + counter + "th word in the sentence");
	}
}
