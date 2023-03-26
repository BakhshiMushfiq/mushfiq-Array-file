package Exchange;

public class ArrayOutOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 try {
				int array [] = new int [5];
				array [0] = 1;
				array [1] = 2;
				array [4] = 5;
				 System.out.println(array [5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBondsExcption: you can retreive the index out of lenght");
		}
	}

}
