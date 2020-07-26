package WarmUp;

import java.util.ArrayList;

public class SwappingArrayLists {
	public static void main(String[]args){
		ArrayList<String> one = new ArrayList<>();
		one.add("lol");
		one.add("lol");
		one.add("lol");

		ArrayList<String> two = new ArrayList<>();
		two.add("xD");
		two.add("xD");
		two.add("xD");
		
		swap(one, two);
		System.out.println(two);
	}

	private static void swap(ArrayList<String> one, ArrayList<String> two) {
		String replace;
		
		for(int i = 0; i < two.size(); i++){
			one.add(two.get(0));
			two.add(one.get(0));
			one.remove(0);
			two.remove(0);
		}
		
		
	}
}
