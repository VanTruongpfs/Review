package Review2;

import java.util.Iterator;

public class Exercise2 {
	public static boolean isEven(int number) {
		return number%2==0?true:false;
	}
	public static boolean isPrimeNumber(int number) {
		if(number<=1) {
			return false;
		}
		for (int i = 2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number = 17;
		System.out.println(isEven(number));
		System.out.println(isPrimeNumber(number));
	}
}
