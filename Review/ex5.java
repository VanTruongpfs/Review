package Review;

public class ex5 {
    public static boolean isPrimeNumber(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static int[] nPrimeNext(int a, int b){
        int[] result = new int[b];
        int count = 0;
        int i = a+1;
        while (b>0) {
            if (isPrimeNumber(i)) {
                result[count++]=i;
                b--;
            }
            i++;
        }
        return result;
    }

    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        display(nPrimeNext(a, b));
    }
}
