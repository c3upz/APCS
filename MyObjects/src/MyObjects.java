
public class MyObjects {
	public static void main(String[]args){
		BankAccount Chris = new BankAccount("Chris", 10000, "abc", false);
		
		System.out.println(Chris);
		System.out.println(Chris.getBalance());
		BankAccount James = new BankAccount("James", 10000, "abcd", false);
		
		System.out.println(BankAccount.getTotalAccountBalance());
		
		
	}
}
