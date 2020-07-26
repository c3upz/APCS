public class DoubleForLoops {
	public static void main (String[] args){
//		for(int i = 0; i < 20; i++) {
//			for(int j = 0; j < 40; j++){
//				System.out.print("0");
//			}
//			
//			System.out.println();
//		}
		
//		for(int i = 6; i > 0; i--) {
//			for(int j = 0; j < i; j++){
//				System.out.print("0");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 6; i++){
//			for(int j = 0; j < i * 2 + 1 ; j++){
//				System.out.print("0");
//			}
//			System.out.println();
//		}
		
//		for(int row = 0; row < 6; row ++){
//			for(int space = 0; space < 5 - row; space++){
//				System.out.print(" ");
//			}
//			
//			for(int col = 0; col < row * 2 + 1; col++){
//					System.out.print("0");
//				}
//			System.out.println();
//		}
	
//		for(int row = 0; row < 7; row ++){
//			for(int num = 0; num < 6 - row; num++){
//				System.out.print(" ");
//			}
//			
//			for(int col = 0; col < row * 2 + 1; col++){
//					System.out.print(row + 1);
//				}
//			System.out.println();
//		}
		
		for(int row = 5; row > 0; row--){
			for(int space = 0; space < 5 - row; space++){
				System.out.print(" ");
			}
			
			for(int digit = 0; digit < 13 - (2 * row); digit++){
					System.out.print((2 * row + 1) % 10);
				}
			System.out.println();
		}
	
	
	
	}
}
