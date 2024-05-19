package Review2;

public class Exercise19 {
	public static int reverse(int n) {
		int result = 0;
		while(n!=0) {
			result = result*10 + n%10;
			n/=10;
		}
		return result;
	}
	public static int countOfNumber(int n) {
		int count = 0;
		if(n==0) {
			return 1;
		}
		while(Math.abs(n)!=0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int totalOfNumber(int n) {
		int sum = 0;
		while(n!=0) {
			sum+= n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 1234;
		System.out.println(reverse(n));
		System.out.println(countOfNumber(n));
		System.out.println(totalOfNumber(n));
	}
}
