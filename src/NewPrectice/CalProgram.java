package NewPrectice;

import java.io.InputStream;
import java.util.Scanner;

public class CalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operators ; 
		double num1 ;
		double num2 ;
		double result ;
		Scanner sc = Scanner (System.in);
		System.out.println("Select Your Operators");
		operators = sc.next().charAt(0);
		System.out.println("Select Your first Number");
		num1 = sc.nextDouble();
		System.out.println("Select Your Second Number");
		num2 = sc.nextDouble();
		switch (operators) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + ":" + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + ":" + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + ":" + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + ":" + result);
			break;
		default:
		System.out.println("you enter the invailed operator");
		
		
		}
		}

	}

		


