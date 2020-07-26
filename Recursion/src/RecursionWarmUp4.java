
public class RecursionWarmUp4 {
	public static void main(String[]args){
		int n = 789;
		//howManyDigitsIn(n);
		System.out.println(howManyDigitsIn(n));
	}

	private static int howManyDigitsIn(int n) {
		if(n == 0){
			return 0;
		}else{
			return 1 + howManyDigitsIn(n/10);
		}
	}
}
