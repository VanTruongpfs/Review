package Review2;

public class Exercise14 {
	public static double totalA(int n, double x) {
		double T = 1;
		double result = 1;
		if(x>0) {
			if(n==0) {
				return result;
			}
			for (int i = 1; i <= n ; i++) {
				T*=x;
				result+=T;
			}
		}else {
			return -1;
		}
		
		return result;
	}
	public static double totalB(int n , double x) {
		double result = 1;
		double T = 1;
		if(x>0) {
			if(n==0) {
				return result;
			}
			for (int i = 1; i <= n; i++) {
			T*=x*(-1);
			result+=T;
			}
			
		}else {
			return -1;
		}	
			return result;
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static double totalC(int n, double x) {
		double result=1;
		double T = 1;
		if(x>0) {
			if(n==0) {
				return result;
			}else {
				for (int i = 1; i <= n; i++) {
					T*=x;
					result+=T/factorial(i);
				}
			}
		}else {
			return -1;
		}
		return result;
	}
	public static void main(String[] args) {
		int n = 5;
		double x = 2;
		System.out.println(totalA(n, x));
		System.out.println(totalB(n, x));
		System.out.println(totalC(n, x));
	}
}