package WarmUp;

public class WarmUp { 
	
	public static void main(String[] args){
		System.out.println((splitUp("Brian")));
	}
	
	public static String splitUp(String str){
		if(str.length() == 0) return "[]";
		String a = "[" + str.charAt(0);
		String str2 = "";
		for(int i = 1; i < str.length(); i++){
			str2 += "," + str.charAt(i);
		}
		return a + str2 + "]";
	}
}

