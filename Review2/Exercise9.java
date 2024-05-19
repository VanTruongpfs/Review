package Review2;

import java.util.Iterator;

public class Exercise9 {
	public static String insertComma(int n) {
		String nToString = String.valueOf(n);
		String result = "";
		int count = 0;
		for(int i=nToString.length()-1; i>=0; i--) {
			char s = nToString.charAt(i);
			if(count%3==0 && count!=0) {
				result = s + "," + result;
			}else {
			result = s + result;
			}
			count++;
		}
		return result;
	}
	public static void main(String[] args) {
		int n = 1234556;
		System.out.println(insertComma(n));
	}
}
