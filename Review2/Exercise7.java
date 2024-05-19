package Review2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int count = 0;
		int randomNumber = rd.nextInt(1, 100);
		int min = 0;
		int max = 100;
		while(true) {
			System.out.print("input guess number of you: ");
			int guessNumber =  sc.nextInt();
			if(guessNumber<randomNumber) {
				min = guessNumber;
				System.out.printf("input again guessNumber in range %d-%d",min, max);
				count++;
			}else if(guessNumber>randomNumber){
				max = guessNumber;
				System.out.printf("\ninput again guessNumber in range %d-%d",min, max);
				count++;
			}else {
				count++;
				System.out.printf("\nCorrect! congralulation" +"\n number of guess is %d"+"\n ramdom number is %d", count, randomNumber);
				break;
			}
		}
	}

}
