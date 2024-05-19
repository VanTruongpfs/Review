package Review2;

import java.util.Iterator;

public class Cau2 {
	public static int[] deleteIndex(int[] array, int index) {
		int[] result =  new int[array.length-1];
		for (int i = index; i < array.length-1; i++) {
				array[i] = array[i+1];
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
	public static int duplicate(int[] array, int x) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==x) {
				count++;
			}
		}
		return count;
	}
	public static int[] deleteX(int[] array, int x) {
		display(array);
		int[] result = new int[array.length-duplicate(array, x)];
		for (int i = 0; i < array.length; i++) {
			if(array[i]==x) {
				deleteIndex(array, i);
			}
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
	 public static void display(int[] array) {
		 for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		 System.out.println();
	 }
	 public static void main(String[] args) {
		int[] array = {1,5,3,5,3};
		int x = 5;
		
		System.out.println(duplicate(array, x));
		display(deleteX(array, x));
		System.out.println();
	}
	
}
