
public class biMulti {
	public static void main(String[]args){
		String answer = biMultiplier("101010101", "10101010101010");
		System.out.println(answer);
	}

	private static String biMultiplier(String num1, String num2) {
		int finalNum1 = converter(num1);
		int finalNum2 = converter(num2);
		
		return Integer.toBinaryString(finalNum1 * finalNum2);
	}

	private static int converter(String temp) {
		if(temp.length()==0){
			return 0;
		}
		
		return converter(temp.substring(1)) + (int)(Integer.parseInt(temp.substring(0,1)) * (Math.pow(2, temp.length()-1)));
	}
}
