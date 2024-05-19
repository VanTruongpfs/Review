package Review;

public class ex6 {
    public static void display(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] triangle(int[] array){
        int[][] result = new int[array.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
        for (int j = result[i].length-1; j >= 0; j--) {
            result[i][j] = array[i]--;
        }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        display(triangle(array));
}
}
        