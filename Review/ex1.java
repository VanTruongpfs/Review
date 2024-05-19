package Review;

public class ex1 {
    public static int roundNumber (float number){
        int result = (int) number;
        if(number%1>0.5){
            return ++result;
        }
        return result;
    }
    public static void main(String[] args) {
        float number = 3.6f;
        System.out.println(roundNumber(number));
    }
}
