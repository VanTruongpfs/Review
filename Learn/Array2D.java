package Learn;

public class Array2D {
// int array[][]= new int[][];
// int[][] array = new int[][];
	public static void main(String[] args) {
		int array[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//in ra phan tu dong 3 cot 3(vi tri dau tien la 00 01 02
//												10 11 12
//												20 21 22
		System.out.println(array[2][2]);
// in ma tran 
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array.length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
}
