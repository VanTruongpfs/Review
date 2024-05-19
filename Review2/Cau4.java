package Review2;

public class Cau4 {
	public static String encode(String str, int pass) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if(s>='a' && s<='z' || s>='A' && s<='Z' || s>='0' && s<='9') {
				char en = (char) (s-pass);
				result+= en;
			}else {
			result+= s;
		}
		}
		return result;
	}
	public static String decript(String str1, int pass) {
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			char s = str1.charAt(i);
			if(s!=' ') {
			char en = (char) (s+pass);
			result+= en;
			}else {
			result+= s;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "Le Van Truong";
		int pass = 2;
		System.out.println(encode(str, pass));
		String str1 = encode(str, pass);
		System.out.println(decript(str1, pass));
	}
}
