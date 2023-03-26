package StringBuffer;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
		double result;
		char operator;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("<<<< Enter Your Numbers>>>>");
		operator = sc.next().charAt(0);
		System.out.println("Enter the first Number");
		number1 = sc.nextDouble();
		System.out.println("Enter the Second Number");
		number2 = sc.nextDouble();
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + ": " + result );
			break;
		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + ": " + result );
			break;
		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + ": " + result );
			break;
		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 + ": " + result );
			break;
		default:
			System.out.println("the operator You have entered is invailed");
			
		}
		System.out.println();
	}

}
