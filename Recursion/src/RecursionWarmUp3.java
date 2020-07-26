
public class RecursionWarmUp3 {
	public static void main(String[]args){
		String str = "Ayy LMAO mark is hacker";
		replaceSpaces(str);
	}

	private static String replaceSpaces(String str) { 
		if(str.length() == 0){
			return "";
		}
			
		if(str.charAt(0) != ' '){
			return str.charAt(0) + replaceSpaces(str.substring(1));
		}else{
			return str;		
		}	
	}
}
