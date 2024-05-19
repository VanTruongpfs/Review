package Review;

import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randomNumber = rd.nextInt(1, 100);
        int min = 1;
        int max = 100;
        int count = 0;
        while (true) {
            System.out.print("input number that you want to guess: ");
            int guessNumber = sc.nextInt();
            if(guessNumber == randomNumber){
                count++;
                System.out.println("Congraluration, you were correct!");
                System.out.printf("you used to guess %d time",count);
                break;
            }
            if(guessNumber > randomNumber ){
                max = guessNumber;
                System.out.printf("input number in range %d to %d", min, max);
                count++;
            }else{
                min = guessNumber;
                System.out.printf("input number in range %d to %d", min, max);
                count++;
            }
        }
        }
}
