package Learn;

import java.util.Scanner;

public class Triangle {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("input length a: ");
	int a = input.nextInt();
	System.out.print("input length b: ");
	int b = input.nextInt();
	System.out.print("input length c: ");
	int c = input.nextInt();
	if(a+b>c && b+c>a && a+c>b) {
		if(a==b && b!=c || a==c && c!=b|| b==c && c!=a) {
			System.out.println("a,b,c create triangle cân");
		}else if(a==b && b==c) {
			System.out.println("a,b,c create triangle đều");
		}else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b ) {
			System.out.println("a,b,c create triangle vuông");
		}else {
			System.out.println("a,b,c create triangle normal");
		}
	}else {
		System.out.println("a,b,c don't create triangle");
	}
}
}
