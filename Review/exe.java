package Review;

public class exe {
    public static int UCNL(int a, int b){
        if (b==0) {
            return a;
        }else{
            return UCNL(b, a%b);
        }
    }

    // public static long BCLN(int a, int b){
    //     return (a*b)/BCLN(a, b);
    // }

    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        System.out.println(UCNL(a,b));
        // System.out.println(BCLN(a, b));
    }
}
