package WarmUp;

import java.util.Arrays;

public class WarmUpppppppp {
		public static void main(String[] args){
			String [] arr = {"a", "b" , "c"};
			String str = "d";
			System.out.println(Arrays.toString((concatArray(arr, str))));
		}
		
		
		public static String[] concatArray(String[] a, String b){
			String [] aa = new String[a.length + 1];
			for(int i = 0; i < a.length; i++){
				aa[i] = a[i];
			}
			aa[a.length] = b;
			
			return aa;
		}
	}
