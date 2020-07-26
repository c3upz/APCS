
public class RecursionWarmUp2 {
	public static void main(String[]args){
		int n = 4;
		//twoToThePowerOf(n);
		System.out.println(twoToThePowerOf(n));
		
	}

	private static int twoToThePowerOf(int n) {
		if(n == 0){
			n = 1;
			return n;
		}else{
			return 2 * twoToThePowerOf(n - 1);
		}
	}
}
