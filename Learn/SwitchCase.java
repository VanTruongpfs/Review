package Learn;

import java.util.Scanner;

/**
 * switch(variable){
 * 	  case valua1:
 * 		 lam gi do....
 * 		break;
 * 	  case valua2:
 * 		 lam gi do....
 * 		break;
 * 	  case valua3:
 * 		 lam gi do....
 * 		break;
 * 	  default:
 * 		 lam gi do....
 * }
 * 
 */
public class SwitchCase {
	public static void main(String[] args) {
		System.out.print("Input month is number: ");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		
		switch(month){
			case 1:
				System.out.println("January");
			break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December8");
				break;
			
			default:
				System.out.println("NO Valua!");
		}
	}
}
