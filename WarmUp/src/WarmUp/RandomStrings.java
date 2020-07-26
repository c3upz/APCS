package WarmUp;

public class RandomStrings {
	public static void main(String[]args){
		int length = 5;
		String str = "asdfghasda";
		System.out.println(randomString(length));
		System.out.println(numberOfAs(str));
	}

	static String randomString(int length) {
		String word = "";
		for(int i = 0; i < length; i++){
			char randChar = (char)(int)(Math.random() * (122 - 97) + 97);
			word += randChar;
		}
		return word;
	}
	
	
	static int numberOfAs(String str){
		//base case(last index of string)
		if(str.length() == 1){
			if(str.charAt(0)== 'a'){
				return 1;
			}else{
				return 0 ;
			}
		}
		//everyother case
		if(str.charAt(0) == 'a'){
			return 1 + numberOfAs(str.substring(1));
		}else{
			return 0 + numberOfAs(str.substring(1));
		}
	}
	
}
