package Review;

public class MutilMatrix {
    public static int[][] mutilMatrix(int[][] arr1, int[][] arr2){
        int[][] result = new int[arr1.length][arr2[0].length];
        if (arr1[0].length==arr2.length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    for (int k = 0; k < arr1[0].length; k++) {
                        result[i][j]= result[i][j]+(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
        }
        return result;
    }
    
    public static void display(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},
                        {1,2,3}};

        int[][] arr2 = {{1,4,5},
                        {1,2,4},
                        {1,2,4}};
        display(mutilMatrix(arr1, arr2));
    }
}