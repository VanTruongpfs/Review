package Learn;

public class Matrix {
    public static int[][] matrix(int[] array1D){
        int[][] array2D = new int[array1D.length][array1D.length];
        for (int i = 0; i < array2D.length; i++) {
            array2D[i][i]=array1D[i];
          if(i>0){
            for (int j = 1; j<=i && i+j<array1D.length; j++) {
                array2D[i+j][i-j] = array2D[i-j][i+j] = array2D[i-j+1][i+j-1]-1;
            }
          }

    }
    return array2D;
    }
    public static void display(int[][] array2D){
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array1D = {1,5,3,4,5};
        display(matrix(array1D));
    }
}
