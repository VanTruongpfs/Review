package Learn;
public class Test {
	
	public static int[] sort(int[] array1D) {
		for (int i = 0; i < array1D.length-1; i++) {
			for (int j = i+1; j < array1D.length; j++) {
				if(array1D[i]>array1D[j] ){
				int temp = array1D[i];
				array1D[i] = array1D[j];
				array1D[j] = temp;
				}
			}
		}
		return array1D;
	}
	public static int[][] sortIncreseCol(int[][] matrix){
		for (int j = 0; j < matrix[0].length; j++) {
			int[] array =  new int[matrix.length];
			int index=0;
			for (int i = 0; i < matrix.length; i++) {
				array[index++] = matrix[i][j];
			}
			sort(array);
			for (int k = 0; k < array.length; k++) {
				matrix[k][j] = array[k];
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
	
	public static void display(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,4,2,6},
						 {2,3,1,7},
						 {4,6,2,9}};
		display(sortIncreseCol(matrix));
		System.out.println();
}
	}
