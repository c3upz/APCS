import java.util.Scanner;

//@Chris Gerbino
// need to add alg math section. Ex. Q:  3x + 7 = 19 ---- A: (Solve for x) x = 4
// equation for x = c-b/a

public class MathTestLab { 

	public final static String test = testType();
	public final static int numQuestions = promptNumOfQuestions();
	static int numOfCorrectAnwsers = 0;
	static int numOfWrongAnwsers = 0;



	public static String testType() {
		Scanner s = new Scanner (System.in);
		System.out.println("Type \"Algebra\" for algebraic math test or type \"Basic\" for basic math test.");
		String test =s.nextLine();
		return test;
	}

	public static int promptNumOfQuestions() { //this is asking user for number of question s they want in the quiz and 
		Scanner s = new Scanner (System.in);	  //returning the value to the variable 'promptNumOfQuestions'
		System.out.println("How many questions?");
		int numQuestions = s.nextInt();
		s.nextLine();
		return numQuestions;
	}

	public static void main(String[] args){
		if (test.equalsIgnoreCase("Basic")){
			questions();
			results();
		}else if (test.equalsIgnoreCase("Algebra")){
			algQuestions();
			results();
		}
	}


	private static void questions(){
		Scanner s = new Scanner (System.in);
		for(int i = 0; i < numQuestions; i++){
			int a = (int)(20 * Math.random());
			int b = (int)(20 * Math.random());
			int c = (int)(4 * Math.random());

			if (c == 1){ // +
				System.out.println(a + "+" + b + "=");
				int anw = s.nextInt();
				s.nextLine();
				if (anw == a + b){
					System.out.println("You are correct!");
					numOfCorrectAnwsers ++;
				}else{
					System.out.println("You are incorrect!");
					numOfWrongAnwsers ++;
				}
			}

			else if (c == 2){ // -
				System.out.println(a + "-" + b + "=");
				int anw = s.nextInt();
				s.nextLine();
				if (anw == a - b){
					System.out.println("You are correct!");
					numOfCorrectAnwsers ++;
				}else{
					System.out.println("You are incorrect!");
					numOfWrongAnwsers ++;
				}
			}

			else if (c == 3){ // *
				System.out.println(a + "*" + b + "=");
				int anw = s.nextInt();
				s.nextLine();
				if (anw == a * b){
					System.out.println("You are correct!");
					numOfCorrectAnwsers ++;
				}else{
					System.out.println("You are incorrect!");
					numOfWrongAnwsers ++;
				}
			}else{ 
				for(int j = 0; j < 1; j++){
					a = (int)(20 * Math.random());
					b = (int)(20 * Math.random());
					if(a % b == 0){
						System.out.println(a + "/" + b + "=");
						int anw = s.nextInt();
						s.nextLine();
						if (anw == a / b){
							System.out.println("You are correct!");
							numOfCorrectAnwsers ++;
						}else{
							System.out.println("You are incorrect!");
							numOfWrongAnwsers ++;
						}
					}else{
						j--;
					}
				}
			}
		} // for numquestions loop closed
	}//method "questions" closer

	public static void algQuestions(){ //alg test questions
		Scanner s = new Scanner (System.in);
		for(int i = 0; i < numQuestions; i++){
			int a = (int)(19 * Math.random()) + 1;
			int b = (int)(20 * Math.random());
			int c = (int)(20 * Math.random());

			if((b - c) % a == 0){
				System.out.println(a + "x " + "+ " + b + "=" + c);
				System.out.print("x = ");
				int anw = s.nextInt();
				s.nextLine();
				int realAnw = (c - b) / (a);
				if(anw == realAnw){
					System.out.println("You are correct");
					numOfCorrectAnwsers++;
				}else{
					System.out.println("You are wrong");
					numOfWrongAnwsers++;
				}
			}else {
				i--;
			}
		} //for loop closer
	} //algQuestions method closer
	public static void results(){
		System.out.println();
		System.out.println("Results: ");
		System.out.println("You got " + numOfCorrectAnwsers + " correct!");
		System.out.println("You got " + numOfWrongAnwsers + " incorrect!");
	}//results method closer
} //public class closer
