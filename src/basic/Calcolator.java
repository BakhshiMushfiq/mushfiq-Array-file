package basic;

import java.util.Scanner;

public class Calcolator {

	public static void main(String[] args) {
		// Calculatore Assignment
		Scanner cal = new Scanner(System.in);
		int num1, num2, option;
		option = 0;
		while (option != 5) {
			System.out.print("Enter 1st Number");
			num1 = cal.nextInt();
			System.out.print("Enter 2th Numer");
			num2 = cal.nextInt();
			System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n 5. Exit");
			System.out.println("Enter you Option");
			option = cal.nextInt();
			switch (option) {
			case 1:
				System.out.println("Addition: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtruction: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Division: " + (num1 / num2));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("invalid Input..!");
			}
		}
	}

}
