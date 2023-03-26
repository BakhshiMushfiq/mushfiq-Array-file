package NewPrectice;

import java.util.Scanner;

public class ScanPublicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Import the scanner");
		int n = scan.nextInt();
		reverseMethod (n);
		
	}

	public static void reverseMethod(int number) {
		int reverseNumber = 0;
		while (number != 0){
			int digit = number % 10;
			reverseNumber = (reverseNumber * 10) + digit;
			number = number / 10;
		}
		System.out.println("Your reversed Number : " + reverseNumber);

	}

}
