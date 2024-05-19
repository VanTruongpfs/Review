package Review2;

import java.util.Iterator;

public class Exercise8 {
	public static String encode(String str, byte pass) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			char encode = (char) (s^pass);
			result+= encode;
		}
		return result;
	}
	public static String decrypt(String ec, byte pass) {
		String result = "";
		for (int i = 0; i < ec.length(); i++) {
			char s = ec.charAt(i);
			char decript = (char) (s^pass);
			result+= decript;
		}
		return result;
	}
	public static void main(String[] args) {
		String str =  "Le Van Truong";
		byte pass = 2;
		String ec = encode(str, pass);
		System.out.println(encode(str, pass));
		System.out.println(decrypt(ec, pass));
	}

}
