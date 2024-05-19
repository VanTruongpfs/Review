package Review;

public class ex2 {
    public static boolean isEvenNumber(int n){
        return n%2==0? true : false;
    }

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

    public static void main(String[] args) {
        int n = 8;
        System.out.println(isEvenNumber(n));
        System.out.println(isPrimeNumber(n));
    }
}
