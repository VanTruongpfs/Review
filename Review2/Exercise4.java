package Review2;

public class Exercise4 {
	public static int[] plusArray(int[] arr1, int[] arr2) {
		if(arr1.length>arr2.length){
			for (int i = 0; i < arr2.length; i++) {
				arr1[i]+=arr2[i];
			}
			return arr1;
		}else {
			for (int i = 0; i < arr1.length; i++) {
				arr2[i]+=arr1[i];
			}
			return arr2;
		}
	}
	
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5,6,4};
		int[] arr2 = {1,2,3,4,5,6};
		display(plusArray(arr1, arr2));
	
	}
}
