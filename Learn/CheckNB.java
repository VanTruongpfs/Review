package Learn;

public class CheckNB {
// mang dan dau
    public static boolean check(int[] array){
        if(array.length<=2){
            return false;
        }for(int i = 0; i < array.length-1;i++){
            if(array[i] >= 0  && array[i+1]>=0 || array[i] <0 && array[i+1]<0 ){
                return false;
            }
        }
        return true;
    }
//
    public static boolean cheoChinhChanTangDan(int[][] array2D){
        for (int i = 0; i < array2D.length-1; i++) {
                if(array2D.length!=array2D[i].length){
                    return false;
                } else if (array2D.length<=1 || array2D[i].length != array2D[i+1].length ) {
                    return false;
                }else if (array2D[i][i]%2!=0 || array2D[i+1][i+1]%2!=0 || array2D[i][i]>array2D[i+1][i+1]) {
                    return false;
                }
            }
            return true;
    }
//
    public static int[] sort(int[] array1D){
        int temp = 0;
        for (int i = 0; i < array1D.length; i++) {
            for (int j = i+1; j < array1D.length; j++) {
                if(array1D[j]<=array1D[i]){
                    temp = array1D[i];
                    array1D[i] = array1D[j];
                    array1D[j] = temp;
            }
            }
    }
    return array1D;
    }
//
    public static int[] reverse(int[] array1D){
        for (int i = 0; i < array1D.length / 2; i++) {
            int temp = 0 ;
            temp = array1D[i];
            array1D[i]=array1D[array1D.length-i-1];
            array1D[array1D.length-i-1] = temp;
        }
        return array1D;
    }
//
    public static int[][] sortArray2D(int[][] array2D){
        
        return array2D;
    }
//
    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
//
    public static void display(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    // array2D.length =  number row, array2D[0].length = number columb row 0.
    public static void main(String[] args) {
        int[] array = {-1,-2,3,-4, 0};
        int[] array1D = {6, 2, 5, 1};
        int[][] array2D ={{2,3,3}, 
                          {7,6, 5}, 
                          {9,3,8}};
        System.out.println(check(array));
        System.out.println(cheoChinhChanTangDan(array2D));
       display(sort(array1D));
       display(reverse(array1D));
       System.out.println(array2D[0].length);
    }
}
