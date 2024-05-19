package Review;

public class ex8 {
    public static String encode(String str, byte pass){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char work = str.charAt(i);
            char en = (char) (work^pass);
            result+=en;
        }
        return result;
    }
    public static String descript(String de, byte pass){
        String result = "";
        for (int i = 0; i < de.length(); i++) {
            char work = de.charAt(i);
            char en = (char) (work^pass);
            result+=en;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Le Van Truong";
        byte pass = 1;
        String de = encode(str, pass);
        System.out.println(encode(str, pass));
        System.out.println(descript(de, pass));
    }
}
