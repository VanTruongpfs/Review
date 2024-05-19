package Review2;

import java.util.Iterator;

public class Exercise6 {
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] createTrianglePascal(int size){
		int[][] triangle = new int[size][];
		for (int i = 0; i < triangle.length; i++) {
			int index = 1;
			triangle[i] = new int[i+1];
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j]=index++;
			}
		}
		return triangle;
	}
//cach 1
	public static int[][] createTrianglePascal(int[] array){
		int[][] triangle = new int[array.length][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i+1];
			triangle[i][i]=array[i];
			int col = triangle[i].length-1;
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j]=array[i]-col--;
			}
		}
		return triangle;
	}
//cach 2
	public static int[][] trianglePascal(int[] array){
		int[][] triangle =  new int[array.length][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i+1];
//			triangle[i][i] = array[i];
			for (int j = i; j >= 0; j--) {
				triangle[i][j] =  array[i]--;			
		}
	}
		return triangle;
	}

	public static void main(String[] args) {
		int size = 5;
		int[] array = {1, 5, 2, 0};
		printMatrix(createTrianglePascal(size));
		printMatrix(createTrianglePascal(array));
		printMatrix(trianglePascal(array));
	}
}
