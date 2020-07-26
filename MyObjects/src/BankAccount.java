import java.util.Scanner;

public class BankAccount {
	String name;
	private double balance;
	private String password;
	private boolean isLocked;
	static double totalAccountBalance;

	public BankAccount(String name, double balance, String password, boolean isLocked){
		this.name = name;
		this.balance = balance;
		this.password = password;
		this.isLocked = isLocked;
		totalAccountBalance += balance;
	}

	public String toString(){
		if(isLocked == false){
			String accountInfo = "";
			accountInfo += "Name: " + name + "\n";
			accountInfo += "Balance: " + balance + "\n";
			return accountInfo;
		}
		return "This account is locked";
	}

	public double getBalance(){
		if(passwordCheck()){
			return balance;
		}else{
			lockAccount();
			System.out.println("This Account is now Locked");
			return -1;
		}
	}

	private void lockAccount(){
		isLocked = true;
	}

	private void unlockAccount(){
		isLocked = !passwordCheck();
	}

	public static double getTotalAccountBalance(){
		return totalAccountBalance;
	}


	public boolean passwordCheck(){
		System.out.println("Password: ");
		Scanner s = new Scanner(System.in);
		String pwTry = s.nextLine();
		return pwTry.equals(password);
	}

	public void withDrawl(int withDrawlAmount){
		if(passwordCheck()){
			if(withDrawlAmount > 0){
				balance -= withDrawlAmount;
			}else{
				System.out.println("Invalid amount");
			}
		}else{
			System.out.println("This account is locked");
		}
	}
	
	public void deposit(int depositAmount){
		if(passwordCheck()){
			if(depositAmount > 0){
				balance += depositAmount;
			}else{
				System.out.println("Invalid amount");
			}
		}else{
			System.out.println("This account is locked");
		}
	}


}
