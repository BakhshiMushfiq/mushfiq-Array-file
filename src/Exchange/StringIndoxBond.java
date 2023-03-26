package Exchange;

public class StringIndoxBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name_school = "HoberBankraft";
			System.out.println("String lenght: " + name_school.length());
			char c = name_school.charAt(16);
			System.out.println("char: " + c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("String index that you are fetching is out of the range!");
		}
	}

}
