package Exchange;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
