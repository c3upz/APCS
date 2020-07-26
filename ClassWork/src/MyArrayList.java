import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		for(int i = al.size(); i > 0; i--){
			al.remove(i - 1);
		}
		System.out.println(al);
	}
}

