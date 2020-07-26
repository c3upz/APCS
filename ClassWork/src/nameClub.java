import java.util.ArrayList;
import java.util.Scanner;

public class nameClub {
	public static void main(String[]args){
		String[] candidates = new String[10];
		Scanner s = new Scanner(System.in);
		ArrayList<String> clubMembers = new ArrayList<String>();
		for(int i = 0; i < 10; i++){
			System.out.print("please enter a name: ");
			candidates[i] = s.next();
		}
		System.out.println("How big can the names of the club members be?");
		int maxSize = s.nextInt();
		for(String name: candidates){
			if(name.length() < maxSize){
				clubMembers.add(name);
			}
			System.out.print("How big can the names of the club members be?");
			int minSize = s.nextInt();
			for(String name1: clubMembers){
				if(name1.length() > minSize){
					clubMembers.remove(minSize);
				}
			}
		}
		System.out.println(clubMembers);
	}
}
