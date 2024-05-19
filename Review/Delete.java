package Review;

public class Delete {
    public static int duplicate(int[] array, int x){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                count++;
            }
        }
        return count;
    }
    public static int[] deleteLocate(int[] array, int locate){
        int[] result = new int[array.length-1];
        if (locate>=0 && locate < array.length) {
            for (int i = locate; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            for (int i = 0; i < result.length; i++) {
                result[i]=array[i];
            }
        }
        return result;
    }

    public static int[] deleteX(int[] array, int x){
        int[] result = new int[array.length-duplicate(array, x)];
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
             deleteLocate(array, i);
            }
        }
        for (int j = 0; j < result.length; j++) {
           result[j] = array[j];
        }
        return result;
    }

    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,5,4,2,5,6,5};
        display(deleteX(array, 9));
    }
}
