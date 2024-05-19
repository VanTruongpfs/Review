package Review2;

import java.util.Random;

public class Exercise11 {
	public static int[] getRandomIndexInArray(int[] array, int qty) {
		int[] result = new int[qty];
		swap(array);
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
	
	public static int[] swap(int[] array) {
		Random rd = new Random();
		int count = array.length/2;
		while(count > 0) {
			int rd1 = rd.nextInt(0, array.length);
			int rd2 = rd.nextInt(0, array.length);
			if(rd1 != rd2) {
				int temp = array[rd1];
				array[rd1] = array[rd2];
				array[rd2] = temp;
				count--;
			}else {
				continue;
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
		int[] array = {2,4,5,2,6,7,9};
		int qty = 5;
//		System.out.println();
		display(getRandomIndexInArray(array, qty));
	}
}
