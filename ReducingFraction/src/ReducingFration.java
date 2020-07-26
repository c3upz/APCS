
public class ReducingFration { //euclid alg
	public static void main(String[]args){
		int num = 90;
		int dem = 120;
		System.out.println(reduceFraction(num,dem));		
		//		if(num < 0){
		//			num = 0 - num;
		//		}
		//			dem = 0 - num;
		//		}
		//		
		//		while(num != dem){
		//			if(num > dem){
		//				num -= dem;
		//			}else
		//				dem -= num;
		//		}
	}

	private static int reduceFraction(int num, int dem) {
		if(num < 0) num = 0 - num;
		if(dem < 0) dem = 0 - num;

		while(num != dem){
			if(num > dem) num -= dem;
			else dem -= num;
		}
		return num;
	}	
}
