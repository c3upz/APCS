package fracCalc;

import java.util.Scanner;

public class FracCalcChkP2 {

		public static Scanner s = new Scanner (System.in);
		private static String userProblem;
		private static String firstFrac, secondFrac, operator;
		private static int numVal, denomVal;
		private static int firstFracNumVal, firstFracDenomVal;
		private static int secondFracNumVal, secondFracDenomVal;
	//-----------------------------------------------------
		public static void main(String[] args){
			userProblem = promptProblem();
			produceAnswer(userProblem);

			intVal(firstFrac);
			firstFracNumVal = numVal;
			firstFracDenomVal = denomVal;

			intVal(secondFrac);
			secondFracNumVal = numVal;
			secondFracDenomVal = denomVal;
			
			findOperator(operator);
		

		}
	//-----------------------------------------------------	
		
	//-----------------------------------------------------
		private static String findOperator(String operator){
			if(userProblem.contains("+")) return "+";
			else if(userProblem.contains("-")) return "-";
			else if(userProblem.contains("/")) return "/";
			else if(userProblem.contains("*")) return "*";
			else return null;
		}
	//----------------------------------------------------
		private static String intVal(String frac){
			String num = "0";
			String denom = "1";
			if(frac.contains("/")){
			Scanner split = new Scanner(frac).useDelimiter("/");
			 num = split.next();
			 denom = split.next();
			}

			if(frac.contains("_")){
				Scanner split2 = new Scanner(num).useDelimiter("_");
				String numP1 = split2.next();
				String numP2 = split2.next();	

				return("whole:" + numP1 + " numerator:" + numP2 + " denominator:" + denom);	

			}
			else if(!frac.contains("/")){
					Scanner split3 = new Scanner(frac);
					String numP1 = split3.next();
					
					return("whole:" + numP1 + " numerator:" + 0 + " denominator:" + 1);	
				}else{
				return ("whole:" + 0 + " numerator:" + num + " denominator:" + denom);	
				}
			}
		
	//----------------------------------------------------
		private static String promptProblem(){
			System.out.print("Enter a problem: ");
			return s.nextLine();
		}
	//----------------------------------------------------
		
		public static String produceAnswer(String userProblem){ 
			//breaking up the String
			Scanner breakUp = new Scanner(userProblem);

			firstFrac = breakUp.next();
			operator = breakUp.next();
			secondFrac = breakUp.next();

			System.out.println(intVal(secondFrac));
			return intVal(secondFrac);
			
		}
	//----------------------------------------------------
	}


