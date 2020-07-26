
public class RecursionWarmUp {
	public static void main(String[]args){
		int n = 4;
		//timesFive(n);
		System.out.println(timesFive(n));
	}

	private static int timesFive(int n) {
		if(n == 0){
			n = 0;
			return n;
		}else{
			return 5 + timesFive(n - 1);
		}	
	}
}
