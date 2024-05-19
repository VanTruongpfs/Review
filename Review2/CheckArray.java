package Review2;


public class CheckArray {
	public static boolean chuoiDanDau(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>=0 && array[i+1]>=0 ||  array[i] <0 && array[i+1] <0) {
				return false;
			}
		}
		return true;
	}
	public static boolean cheoChinhLaSoChanTangDan(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i].length!=matrix.length) {
				return false;
			}
		}
		for (int i = 0; i < matrix.length-1; i++) {
			if(matrix[i][i]%2!=0 || matrix[i+1][i+1]%2!=0 || matrix[i][i]>matrix[i+1][i+1]) {
				return false;
			}
			
		}
		return true;
	}
	public static int tongDuongCheoChinh(int[][] matrix) {
		int sum=0;
		for (int i = 0; i < matrix.length; i++) {
			sum+=matrix[i][i];
		}
		return sum;
	}
	public static int tongDuongCheoPhu(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum+=matrix[i][matrix[i].length-1-i];
		}
		return sum;
	}
	public static int[][] test(int[] array1D){
		int[][] result = new int[array1D.length][array1D.length];
		for (int i = 0; i < result.length; i++) {
			result[i][i] = array1D[i];
			int temp = result[i][i];
			if(i>0) {
				for (int j = 1; j <= i && i+j<result.length; j++) {
				result[i+j][i-j]= result[i-j][i+j] = --temp;
				}
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
		int[] array = {1,2,5,6};
		int[][] matrix = {{2,2,3},
				  	      {3,4,6},
				  		  {2,3,9}
				  	      };
		System.out.println(chuoiDanDau(array));
		System.out.println(cheoChinhLaSoChanTangDan(matrix));
		System.out.println(tongDuongCheoChinh(matrix));
		System.out.println(tongDuongCheoPhu(matrix));
		display(test(array));
	}
}
