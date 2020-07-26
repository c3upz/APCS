import java.util.Arrays;

public class MyArrays {
	public static void main(String[] args){
		String friend1 = "jake";
		String friend2 = "alex";
		String friend3 = "maddie";
		String friend4 = "thomas";
		
		String[] myFriends = new String[4];
		//Here is a String array called myFrineds
		//and it will consist of 4 items. The 
		//indexes will be 0, 1, 2, 3.
		
		myFriends[0] = friend1;
		myFriends[1] = friend2;
		myFriends[2] = friend3;
		myFriends[3] = friend4;
		
		 
		 String friend5 = "oats";
		 myFriends[5] = friend5;
		
		//System.out.println(Arrays.toString(myFriends));
		
		
		//here is another way to make an array
		
		int[] friendsAges = {3, 4, 5, 6};
		//System.out.println(friendsAges[2]);
		
		//write a four loop that will print a list of friends and there ages
		//so that the output looks like...
		//Jake is 32 years old 
		//etc
		
		for(int i = 0; i < myFriends.length; i++){
			System.out.println(myFriends[i] + " is " + friendsAges[i] + " years old.");
		}
		
		myFriends[4] = "loser";
		System.out.println(myFriends[4]);
	}
}	
