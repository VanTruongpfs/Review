package Review2;


public class Exercise17 {
	public static int[][] plusMatrix(int[][] matrix1, int[][] matrix2){
		int[][] matrixUndefined = {{-1}};
		for (int i = 0; i < matrix1.length; i++) {
			if(matrix1[i].length!=matrix2[i].length || matrix1.length!=matrix2.length) {
				return matrixUndefined;
			}
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j]+=matrix2[i][j];
			}
		}
		
		return matrix1;
	}
	
	public static int[][] mutiMatrix(int[][] matrix1, int[][] matrix2){
		int[][] result = new int[matrix1.length][matrix2[0].length];
		int[][] matrixUndefined = {{-1}};
		if(matrix1[0].length!=matrix2.length) {
			return matrixUndefined;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		return result;

	}
	
	public static void displaMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},
						   {2,3,4}
						   };
				int[][] matrix2 = { {2,2,4},
						   			{2,3,4},
						   			{1,2,4}};
		displaMatrix(plusMatrix(matrix1, matrix2));
		System.out.println();
		displaMatrix(mutiMatrix(matrix1, matrix2));
	}
}
