package Review2;

public class Exercise1 {
	public static int roundNumber(float number) {
		int result =  (int) number;
		return number%1>=0.5? ++result : result;
	}

	public static void main(String[] args) {
		float number = 3.6f;
		System.out.println(roundNumber(number));
	}
}
