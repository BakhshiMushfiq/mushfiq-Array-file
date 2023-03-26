package basic;

import java.util.Scanner;

public class forswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner (System.in);
		System.out.println( "Gusse a Number to win the prize");
		int number = t.nextInt();
		switch (number) {
		case 50:
			System.out.println("you did not win a prize");
			break;
		case 70:
			System.out.println("You win a $70");
			break;
		case 100:
			System.out.println("You win a coputer");
			break;
		default:
			System.out.println("you did not win a prize");
		}
		
		
				
		}
	}


