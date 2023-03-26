package basic;

import java.util.Date;

public class grade {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		// TODO Auto-generated method stub
		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedsday");
			break;
		case 4:
			System.out.println("Tursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
			default:
				System.out.println("Weekend");
		}
		
		char grade = 'W';
		switch (grade) {
		case 'A':
		System.out.println("excellent");
		break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("fair");
			break;
		case 'D':
			System.out.println("not eligible");
			break;
			default:
				System.out.println("unknown");
				
		
		}
		
		int grad1 = 50;
		switch (grad1) {
		case 50:
		System.out.println("grad C");
		break;
		case 70:
			System.out.println("grad B");
			break;
		case 100:
			System.out.println("A");
			break;
		case 40:
			System.out.println("fail");
			break;
			default:
				System.out.println("unknown");
				
		
		}	
	}

}
