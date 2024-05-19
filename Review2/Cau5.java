package Review2;

public class Cau5 {
	public static String analysPrimeNumber(int n) {
		String result = "";
		while(n%2==0) {
			result = result + 2+" ";
			n/=2;
		}
		for(int i = 3; i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				result = result+ i+" ";
				n/=i;
			}
		}
		if(n>2) {
			result+= String.valueOf(n);
		}
		result = result.trim().replace(' ', '*');
		return result;
	}
	public static void main(String[] args) {
		int n = 300;
		System.out.println(analysPrimeNumber(n));
	}
}
