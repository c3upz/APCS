import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

	String name;
	private String userName;
	private String password;
	private double balance;
	private boolean isLocked;
	public static double totalAccountBalance;
	private int accountNumber;

	public BankAccount(String name, String userName, String password, double balance, boolean isLocked, int accountNumber){
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this. isLocked = isLocked;
		this.accountNumber = accountNumber;
		totalAccountBalance += balance;
	}

	public String toString(){
		String str = "";	
		str += "Name: " + name + "\n";
		str += "Balance: " + balance;
		return str;
	}

	public boolean unlockAccount(){
		String userPW;
		String userUN;
		Scanner userInput =  new Scanner(System.in);
		System.out.print("Username: ");
		userUN = userInput.nextLine();
		System.out.println();
		System.out.print("Password: ");
		userPW = userInput.nextLine();
		return userPW.equals(password)  || userUN.equals(userName);
	}
}