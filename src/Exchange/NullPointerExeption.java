package Exchange;

public class NullPointerExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name = null;
			System.out.println("Display Name: " + name);
			System.out.println("Name lenght: " + name.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("cna not call the lenght of a strin wich is null (missing)");
		}
	}

}
