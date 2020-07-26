package WarmUp;

public class consecitiveChars {
	public static void main(String[] args){
		String string = "12345";
		System.out.println(concecChars(string));
	}
	
	public static int concecChars(String string){
		int counter = 1;
		int greatestCounter = 0;
		for(int i = 1; i < string.length(); i++){
			if(string.charAt(i-1) == string.charAt(i)){
				counter++;
			}else{
				counter = 1;
			}
			greatestCounter = Math.max(counter, greatestCounter);
		}

		greatestCounter = Math.max(counter, greatestCounter);
		
		if(greatestCounter > 1) return greatestCounter;
		
		if(greatestCounter == 1) return -1;
		
		else return 0;
	}
}
