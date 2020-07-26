package WarmUp;

public class WarmUp3 {
	static double years = 32;
	static double months = 80;
	
	public static void main(String[]args){
		a(years, months);
		years = years;
		months = months;
		System.out.printf("%d%d", (int)(years) + (int)(months));
	}
	
	public static void a(double years, double months){
		double c = (months % 12);
		int b = (int) (months / 12);
		WarmUp3.years = (int)(years += b);
		WarmUp3.months = (int)c;
		
	}
}
