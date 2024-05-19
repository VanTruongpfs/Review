package Review2;


public class Exercise18 {
	public static int[] sortAscending(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static int[][] sortZicZac(int[][] matrix){
		int index = 0;
		int[] array = new int[matrix.length*matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				array[index++] = matrix[i][j];
			}
		}
		sortAscending(array);
		index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = array[index++];
			}
		}
		return matrix;
	}
	public static void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {	{1,2,3},
				  			{3,4,6},
				  			{2,3,5}};
		display(sortZicZac(matrix));
	}
}
