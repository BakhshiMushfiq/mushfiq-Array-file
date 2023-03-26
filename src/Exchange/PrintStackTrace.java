package Exchange;

public class PrintStackTrace {

	public static void main(String[] args) {
		// PrintStackTrace
		int x = 3;
		int y = 0;
		
		try {
			int resulth = x/y;
			System.out.println(resulth);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
