import java.util.Scanner;
public class Loops {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		for (int i = 0; i < 10; i++){ //1.this for loop outputs every number from 0-9
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++){ //2.this for loop outputs every even number from 0-20
			System.out.println(i * 2);
		}
		for(int i = 1; i <= 21; i = i + 2){ //3.this for loop outputs every odd number from 1 - 21
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--){ //4.this for loop outputs every number from 100 - 0 
			System.out.println(i);
		}
		for (int i = 100; i > 0; i = i - 2){ //5.this for loop counts down from 100 with only even numbers
			System.out.println(i);
		}
		System.out.print("how many times do you want me to print hi? ");//6.this for loop prints the number of the word "hi" that the user wants 
		int num = s.nextInt();
		for(int i = 1; i <= num; i++){
			System.out.println("Hi#" + i);
		}
		System.out.print("Please enter a number: ");//
		int number = 0;
		int num2  = s.nextInt();
		for(int i = 1; i <= num2; i++){
			number += i;
		}
		System.out.println("The anwser is: " + number);
	
	
	
	
	
	
	
	
	
	}
}
