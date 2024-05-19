package Review2;

public class Exercise3 {
	public static int countDigit(int number) {
		int result = number==0?1:0;
		while(Math.abs(number)!=0) {
			number/=10;
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int number = 0;
		System.out.println(countDigit(number));
	}
}
