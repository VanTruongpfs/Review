package Review;

public class ex3 {
    public static int countNumber(int n){
        int count = 0;
        while (Math.abs(n)>0) {
            n/=10;
            count ++;
        }
        return count;
    }

    public static int reverse(int n){
        int result = 0;
        while (Math.sqrt(n)>0) {
            result = result*10 + n%10;
            n/=10;
        }
        return result;
    }

    public static int totalENumber(int n){
        int result = 0;
        while (Math.sqrt(n)>0) {
            result = result + n%10;
            n/=10;
        }
        return result;
    }
    public static int mutilENumber(int n){
        int result = 1;
        if (n==0) {
            return 0;
        }
        while (Math.sqrt(n)>0) {
            int T = n%10;
            if (T==0) {
                result*=1;
                n/=10;
            }else{
                result*=T;
                n/=10;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        int n = 120340;
        System.out.println(countNumber(n));
        System.out.println(reverse(n));
        System.out.println(totalENumber(n));
        System.out.println(mutilENumber(n));
    }
}
