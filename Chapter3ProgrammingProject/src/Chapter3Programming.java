import java.util.Scanner;


public class Chapter3Programming {
	
	
	public static void main(String[] args){
		Exercise1();
	}

	
	
	public static void Exercise1(){ //this method will calculate the distance between 2 coordinates
		Scanner s = new Scanner (System.in);
		System.out.print("Please enter your first coordinate(seperated by a space): ");
		double xValOne = s.nextDouble();
		double yValOne = s.nextDouble();
		s.nextLine();
		System.out.print("Please enter your second coordinate(seperated by a space): ");
		double xValTwo = s.nextDouble();
 		double yValTwo = s.nextDouble();
 		s.nextLine();
 		double xFinal = xValTwo - xValOne;
 		double yFinal = yValTwo - yValTwo;
 		double anwser = Math.hypot(xFinal, yFinal);
 		System.out.println("The distance between your 2 coordinates = " + anwser);
		}
		


}
