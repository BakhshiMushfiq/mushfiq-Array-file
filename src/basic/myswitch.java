package basic;

import java.util.Date;

public class myswitch {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		// TODO Auto-generated method stub
	
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break ;
		case 3:
			System.out.println("Today is Wednsday");
			break ;
		case 4:
			System.out.println("Today is Tursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			
			break;
			default:
				System.out.println("it is Weekend!");
		}	
		
		char grade = 'c';
		switch (grade) {
		case 'A':
			System.out.println("Marks:  Excellent");
			break;
		case 'B':
			System.out.println("Marks: good ");
			break;
		case 'c':
			System.out.println("Marks: Fair");
			break;
		default:
			
			System.out.println("Marks needs improvment");
		}
	
		}
		
	}


