package fracCalc;

import java.util.Scanner;

public class FracCalc {

	public static Scanner s = new Scanner (System.in);
	private static String userProblem;
	private static String firstFrac, secondFrac, operator;
	private static int firstFracnum, firstFracdem;
	private static int secondFracnum, secondFracdem;
	private static int num, dem;

	//-----------------------------------------------------
	public static void main(String[] args){
		System.out.println(produceAnswer(promptProblem()));	
	}

	public static String produceAnswer(String userProb) {

		breakUp(userProb);
		intVal(firstFrac);
		firstFracnum = num;
		firstFracdem = dem;

		intVal(secondFrac);
		secondFracnum = num;
		secondFracdem = dem;

		findOperator(operator);

		calculateAnswer();		


		return reducingFraction(num, dem);
	}
	//-----------------------------------------------------	

	private static String reducingFraction(int n, int d) {	
		String val;
		if(d == 1){
			return String.valueOf(n);
		}else if(d == 0){
			return "Divide by 0 error";
		}else if(n == 0){
			return "0";
		}
		//using euclids alg to find lcd and then reduce fractions
		int n1 = Math.abs(n);
		int d1 = Math.abs(d);
		if(n1 < 0){
			d1 = 0 - n1;
		}
		if(d1 < 0){
			d1 = 0 - n1;
		}
		while(n1 != d1){
			if(n1 > d1){
				n1 -= d1;
			}else{ 
				d1 -= n1;
			}
		}

		//n is = to the lcd
		int fn = num/n1; 
		int fd = dem/n1;

		if(Math.abs(fn) > Math.abs(fd)){ //if the reduced fraction should be a mixed number  
			int whole = fn / fd; //whole number of mixed fraction
			int num1 = Math.abs(fn) % Math.abs(fd); //numerator of mixed fraction
			if(num1 > 0){
				return (whole + "_" + num1 + "/" + fd); //if fraction reads y_x/1 and x is greater the 0
			}else if(num1 == 0){ //if the fraction reads x_0/1 we just want to return x
				return(String.valueOf(whole));
			}
		}else if(fd == 1){  //if the fraction is x/1 it should only return x
			return (String.valueOf(fn));
		}else{
			return (num/n1 + "/" + dem/n1); //if it should return a regular fraction 
		}
		return null;
	}
	//-----------------------------------------------------	
	private static String calculateAnswer(){
		int a = firstFracnum;
		int b = firstFracdem;
		int c = secondFracnum;
		int d = secondFracdem;

		if(operator.equals("+")){
			num = (a * d) + (c * b);
			dem = (b * d);
		}else if(operator.equals("-")){
			num = (a * d) - (c * b);
			dem = (b * d);
		}else if(operator.equals("*")){
			num = (a * c);
			dem = (b * d);
		}else if(operator.equals("/")){
			num = (a * d);
			dem = (b * c);
		}

		else return null;
		return null;
	}	
	//-----------------------------------------------------
	private static String findOperator(String operator){
		if(operator.contains("+")) return "+";
		else if(operator.contains("-")) return "-";
		else if(operator.contains("/")) return "/";
		else if(operator.contains("*")) return "*";
		else return null;
	}
	//----------------------------------------------------
	private static void intVal(String frac){
		String n = "0";
		String d = "1";


		if(frac.contains("_") || frac.contains("/")){ //if 'frac' it is a mixed number or it is a regular fraction
			//spliting the fraction into 2 parts
			Scanner split = new Scanner(frac).useDelimiter("/"); 
			n = split.next();
			d = split.next();

			if(frac.contains("_")){ //if 'frac' is a mixed number
				Scanner split2 = new Scanner(n).useDelimiter("_");
				String numP1 = split2.next();
				String numP2 = split2.next();	

				if(!numP1.contains("-")){
					dem = Integer.parseInt(d);
					num = (Integer.parseInt(numP2) + (Integer.parseInt(numP1) * dem));	
				}else{ //if the fraction is negative
					dem = Integer.parseInt(d);
					num = (Integer.parseInt(numP2) + (Math.abs(Integer.parseInt(numP1) * dem))) * (-1);//taking abs val of (numP1 * dem) then adding numP1.
				}																					   //then mulitply by -1 because numP1 is negative
			}else if(frac.contains("/")){ //if 'frac' is a regular number
				num = Integer.parseInt(n);
				dem = Integer.parseInt(d);
			}
		}else if(!frac.contains("/")){ // if 'frac' it is a whole number
			Scanner split3 = new Scanner(frac);
			String numP1 = split3.next();

			dem = Integer.parseInt(d);
			num = Integer.parseInt(numP1);
		}
	}

	//----------------------------------------------------
	private static String promptProblem(){
		System.out.print("Enter a problem: ");
		return s.nextLine();
	}
	//----------------------------------------------------

	public static void breakUp(String userProb){ 
		//breaking up the String
		userProblem = userProb;
		Scanner breakUp = new Scanner(userProblem);

		firstFrac = breakUp.next();
		operator = breakUp.next();
		secondFrac = breakUp.next();

	}
	//----------------------------------------------------
}
