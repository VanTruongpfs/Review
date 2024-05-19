package Review2;


public class MatrixChuyenVi {
	public static int[][] chuyenVi(int[][] matrix){
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = matrix[j][i];
			}
		}
		
		return result;
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
		int[][] matrix = {{1,2,3},
						  {3,4,6},
						  {2,3,4}};
		display(chuyenVi(matrix));
	}
}
