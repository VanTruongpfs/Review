package Review2;

public class Exercise16 {
	public static int getIndexMax(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if(result<array[i]) {
				result=array[i];
			}
		}
		return result;
	}
	public static int getLocateIndexMax(int[] array) {
		int max = getIndexMax(array);
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==max) {
				result = i;
			}
		}
		return result;
	}
	
	public static int[] getNValuaMax(int[] array, int n) {
		int[] result = new int[n];
		sortIncrease(array);
		for (int i = 0; i < result.length; i++) {
			result[i]=array[i];
		}
		
		return result;
	}
	 public static int[] sortIncrease(int[] array) {
		 for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]<array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		 return array;
	 }
	 public static void display(int[] array) {
		 for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	 }
	
	public static void main(String[] args) {
		int[] array = {1,2,9,5,3};
		int n = 3;
		System.out.println(getIndexMax(array));
		System.out.println(getLocateIndexMax(array));
		display(getNValuaMax(array, n));
		
	}
}
