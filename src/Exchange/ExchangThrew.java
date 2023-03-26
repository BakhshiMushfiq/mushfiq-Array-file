package Exchange;

public class ExchangThrew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1 (12, 60 );
		System.out.println("Here inside of the main method!");
		
	}

	private static void method1(int age, int wight) {
		// TODO Auto-generated method stub
		if (age <= 13 && wight <= 50) {
			throw new ArithmeticException ("He/she is not Eligible for licence");
			
		} else {
			System.out.println("he/she is eligible for license");
		}
		
	}

	}
	


