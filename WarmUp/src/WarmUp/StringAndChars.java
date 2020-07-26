package WarmUp;

public class StringAndChars{
	public static void main(String[]args){
		splitUp("ayyyyy lmao");
	}

	private static String splitUp(String string) {
		int a = string.length();

		if(a == 0){
			return "[]";
		}else{
			System.out.print("[" + string.charAt(0));
			for(int i = 1; i < a; i++){
				System.out.print( "," +string.charAt(i));	
			}

			System.out.print("]");
			System.out.println();

			for(int i = 0; i < a; i++){
				System.out.print( " " + i % 10);
			}
		}
		return null;
	}
}
