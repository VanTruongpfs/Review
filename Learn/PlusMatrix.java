package Learn;

public class PlusMatrix {
    public static int[][] plusMatrix(int[][] arr1, int[][] arr2){
// 2 matrix same size
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return arr1;
    }
    public static int[][] multiplicationMatrix(int[][] arr3, int[][] arr4){
        int[] array = new int[arr3.length*arr4[0].length];
        int[][] arr5 = new int[arr3.length][arr4[0].length];
        int index=0;
        int sum = 0;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                sum += arr3[i][j]*arr4[j][i];
            }
            arr5[i][index++] = sum;
        }
        return arr5;
    }
    public static void display(int[][] array){
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4,5},
                        {2,4,3,2,1}};
        int[][] arr2 = {{1,2,3,4,5},
                        {2,4,3,2,1}};
        display(plusMatrix(arr1, arr2));
    }

}
