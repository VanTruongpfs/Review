package Review2;

public class Exercise5 {
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
	
	public static int[] nPrimeNumber(int a, int b) {
		int[] result = new int[b];
		int index = 0;
		int i = a+1;
		while(b>0) {
			if (isPrimeNumber(i)) {
				result[index++]=i;
				b--;
			}
			i++;
		}
		return result;
	}
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a = 15;
		int b = 5;
		display(nPrimeNumber(a, b));
	}
}
