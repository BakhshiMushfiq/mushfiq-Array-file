package NewPrectice;

public class AfghanTire {
	public int sum (int a , int b) {
		int result = a + b;
		return result;
	}
	public static void main (String [] args ) {
	int chinesTir = 50;
	int price = 10;
	AfghanTire sale = new AfghanTire ();
	int outcome = sale.sum(chinesTir, price);
	System.out.println("outcome : " + outcome);
	}
	
		int usTir = 56;
		int price = 20;
		AfghanTire sale = new AfghanTire ();
		int outcome = sale.sum(usTir, price);
		System.out.println("outcome : " + outcome);
	}
}
