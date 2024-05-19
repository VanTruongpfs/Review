package Review;

public class Exercise9 {
    public static String insertComma(int n){
        String result = "";
        String str = String.valueOf(n);
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            char s = str.charAt(i);
            if(count%3==0 && count!=0){
                result = s + "," + result;
            }else{
                result = s + result;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 12345678;
        System.out.println(insertComma(n));
    }
}
