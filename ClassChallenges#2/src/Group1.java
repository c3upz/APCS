import java.util.Scanner;

public class Group1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		System.out.println("Enter 3 numbers ");
		double d = s.nextDouble();
		double e = s.nextDouble();
		double f = s.nextDouble();

		double [] one = {a,b,c};
		double [] two = {d,e,f};
		
		System.out.println(equal(one,two));
	}
	
	public static boolean equal(double[] one, double [] two){
		if(one.equals(two)) return true;
		else return false;
		 
	}
}
