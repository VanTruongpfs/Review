package Review;

public class ArrayReverse {
    public static int[] reverse(int[] array){
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }

    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        display(reverse(array));
    }
}
