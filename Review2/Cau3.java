package Review2;

public class Cau3 {
	public static int dongCoTongLonNhat(int[][] matrix) {
		int[] array = new int[matrix.length];
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum+= matrix[i][j];
			}
			array[i] = sum;
		}
		display(array);
		int result = 0;
		int temp =  array[0];
		for (int i = 1; i < array.length; i++) {
			if(temp < array[i]) {
				temp = array[i];
				result = i;
			}
		}
		return result+1;
	}
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,9,3},
				 			{3,4,6},
				 			{2,3,4}};
		
		System.out.println("dong co tong lon nhat la dong thu "+dongCoTongLonNhat(matrix));
	}
}
