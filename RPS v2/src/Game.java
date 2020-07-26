import java.util.Scanner;

public class Game {

	private static String name;
	
	public static void main(String[] args){
		userInfo();
		gameFunc();
	
	}

	public static String userInfo(){
		Scanner s = new Scanner (System.in);
		System.out.println("Hello and welcome to RPS!");
		System.out.print("Please enter your name: ");
		name = s.next();
		return name; 
	}
	
	public static void gameFunc() {
	
	}
}
