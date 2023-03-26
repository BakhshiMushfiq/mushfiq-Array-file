package basic;

import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char n = 'B';
		switch (n) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Fair");
			break;
		default:
			System.out.println("Faild");
		}
			Scanner num = new Scanner (System.in);
			System.out.println("Gus a Number From 1 to 100");
			int number = num.nextInt();
			switch (number) {
			case 56:
				System.out.println("You have Won a Prize of $300");
				break;
			case 84:
				System.out.println("You have Won a Prize of $500");
				System.out.println("You have Won a Prize of $300");
				break;
			case 99:
				System.out.println("You have Won a Prize of $700");
			break;
		default:
			System.out.println("Sorry! You did not guss a right Number");
			num.close();
			}
			for (int x = 1; x <= 5; x++) {
				System.out.println("I love football");
			}
		}
	}


