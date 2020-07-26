public class PlayAround {
	public static void main(String[] args){
		int myAge = 17;
		int favNum = 3;
		int combinedNum = myAge + favNum;
		System.out.println("My age is " + myAge + combinedNum);
		System.out.println(myAge + favNum);
		System.out.println("My age plus my favorite number = " + (myAge + favNum)); 
		//java looks at the inner () first and can do "myAge + favNum" mathematically, so it adds them. 
		//then looks outside the the inner () and finds the string literal and then tries to mathematically add the 
		//string literal to the "myAge + favNum" but since it is a string literal it cant do that so
		//it makes the "+" sign a concatenation and then prints the string literal and then the the sum
		//of "myAge + favNum"
	}
}
