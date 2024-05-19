package Learn;

public class ZicZac {
// sap xep mang 1 chieu tu be den lon
    public static int[] sortArray1D(int[] array){
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int[][] sortZicZac(int[][] array2D){
        int m = array2D.length, n=array2D[0].length, index = 0;
        int[] array1D = new int[m*n];
// chuyen mang 2 chieu thanh mang 1 chieu
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array1D[index++] = array2D[i][j];
            }
        }
// sap xep tu be den lon
       sortArray1D(array1D);
// sap xep ziczac
        int index2 = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if(i%2==0){
                    array2D[i][j] = array1D[index2];
                    index2++;
                }else{
                    array2D[i][n-j-1]= array1D[index2];
                    index2++;
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
        int[][] array2D = {{1,1,3,5},
                          {1,2,6,5},
                          {8,2,3,9}};
        display(sortZicZac(array2D));
    }
}
