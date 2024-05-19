package Review2;

public class Exercise13 {
	public static String encode(String str, int col) {
		String result = "";
		int index = 0;
		int row = str.length()%col==0?str.length()/col:(str.length()/col)+1;
		
		while(str.length()<row*col) {
		str+="-";
		}
		str = str.replace(' ', '-');
		char[][] matrix = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=str.charAt(index++);
			}
		}
		display(matrix);
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				result+=matrix[j][i];
			}
		}
		return result;
	}
	
	public static String decrypt(String str1, int col) {
		String result = "";
		int index = 0;
		int row = str1.length()/col;
		char[][] matrix = new char[row][col];
		for (int j = 0; j < col; j++) {
			for (int i = 0; i < row; i++) {
				matrix[i][j]=str1.charAt(index++);
			}
		}
		display(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result+=matrix[i][j];
			}
		}
		result = result.replace('-',' ').trim();
		
		return result;
	}
	
	public static void display(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String str = "I am student";
		int col = 5;
		String str1 = encode(str, col);
		System.out.println(encode(str, col));
		System.out.println(decrypt(str1, col));
		
	}

}
