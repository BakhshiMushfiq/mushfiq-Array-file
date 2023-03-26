package Exchange;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int number = Integer.parseInt("String Value");
			System.out.println(number);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("this is format exception: because Example can not parse to integer");
		}
	}

}
