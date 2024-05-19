package Review;

public class ex4 {
    public static int[] arrayPlus(int[] arr1, int[] arr2){
        if(arr1.length>arr2.length){
            for (int i = 0; i < arr2.length; i++) {
                arr1[i]+=arr2[i];
            }
            return arr1;
        }else{
            for (int i = 0; i < arr1.length; i++) {
                arr2[i]+=arr1[i];
            }
            return arr2;
        }
    }
    
    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2,3};
        int[] arr2 = {1,2,3,4,2};
        display(arrayPlus(arr1,arr2));
    }
}
