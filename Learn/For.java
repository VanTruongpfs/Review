package Learn;

import java.util.Scanner;

public class For {
public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
	System.out.print("input n: ");
	int n = input.nextInt();
	int s = 0;
	for(int i = 1; i<=n; i++) {
		s = s + i;
	}
	System.out.println("Total chain: " + s);
}
}
