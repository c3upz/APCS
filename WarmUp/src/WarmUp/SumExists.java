package WarmUp;

public class SumExists {
	//write a method 'sumExists(int[] list, int sum)' wwhich retruns whether or not sum exists between 
	//two elemnts of list
	public static void main(String[]args){
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 8;
	}
	
	public boolean SumExists(int[] list, int sum){
		for(int i : list){
			for(int j : list){
				if(list[i] + list[i] == sum){
					return true;
				}
			}
		}
		return false;
	}
}
