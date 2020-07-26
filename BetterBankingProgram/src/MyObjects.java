import java.util.ArrayList;
import java.util.Scanner;

public class MyObjects {
	static ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>(); //creating array to store accounts in

	public static void main(String[]args){
		//creating bank accounts
		BankAccount Chris = new BankAccount("Chris Gerbino", "cGerbino", "chris", 5800, true, 1); //Name, username, password, money, accountLock, accountnumber
		BankAccount Alex = new BankAccount("Alex Farish", "AlexF", "alex", 5600, true, 2);
		BankAccount James = new BankAccount("James Qui", "JamesQ", "james", 3000, true, 3);
		BankAccount Maddie = new BankAccount("Maddie Petit", "Amazzie", "maddie", 40000, true, 4);
		BankAccount Adam = new BankAccount("Adam Haler-Gamin", "AdamHG", "adam", 5000, true, 5);

		//adding accounts to the array
		allAccounts.add(Chris);
		allAccounts.add(Alex);
		allAccounts.add(James);
		allAccounts.add(Maddie);
		allAccounts.add(Adam);

		bankAccList(allAccounts); //this method prints out the list of 
		identifyAccount(allAccounts); //identify which account is trying to be accessed
	}

	public static void bankAccList(ArrayList<BankAccount> allAccounts){
		int i = 1; 
		for(BankAccount account : allAccounts){
			System.out.print("Account " + i + ": ");
			System.out.println(account.name);
			i++; 
		}
	}

	public static void identifyAccount(ArrayList<BankAccount> allAccounts){
		System.out.print("Please the number next to your account: ");
		Scanner s = new Scanner(System.in);
		int accountNum = s.nextInt();
		if(accountNum <= allAccounts.size()){
			if(allAccounts.get(accountNum - 1).unlockAccount()){
				//System.out.println("Hello, " + allAccounts.get(accountNum - 1).name);
				appMenu(accountNum);
			}
		}else{
			System.out.println("Invalid account number");
		}
	}

	private static void appMenu(int accountNum) {
//		for(int i = 0; i < 1000; i++){  //this is an attempt to clear the console
//		    System.out.println("\b");   //probably not a good idea 
//		}
		ArrayList<String> userOptions = new ArrayList<String>();
		userOptions.add("View balance");
		userOptions.add("Withdraw");
		userOptions.add("Deposit");
		userOptions.add("");
		
		System.out.println("Hello, " + allAccounts.get(accountNum - 1).name);
			System.out.println();
		
	}


} //class ending bracket



