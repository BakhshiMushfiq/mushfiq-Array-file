package basic;

import java.util.Date;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d);
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Student Grad");
		int grade = scan.nextInt();
		
		scan.close();
		
		String fre = "Apple";
		switch (fre) {
		case "a":
			System.out.println("A equal to Apple");
			break;
		case "b":
			System.out.println("B equal to banana");
			break;
		case "c":
			System.out.println("C equal to Orang");
			break;
			default:
				System.out.println("faild");
			
			
		}
				
		
			
		
	}

}
