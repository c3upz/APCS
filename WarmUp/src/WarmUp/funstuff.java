package WarmUp;

public class funstuff {
	public static void main(String[] args){
		int length = 4;
		for(int i = 0; i < 4; i++){
			for (int j = length; j > 0; j--){
				System.out.print("*");
			}
			System.out.println("");
			length--;
		}
	}
}
