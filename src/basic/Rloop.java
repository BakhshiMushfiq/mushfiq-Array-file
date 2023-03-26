package basic;

public class Rloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i ++) {
			for (int j = 1; j <= 10; j++) {
			System.out.print("*");
				
		}
		System.out.println();
		}
		
		System.out.println("\n Pattrans ");
		for (int a = 1; a <= 6; a++) {
			for (int b = 6; b >= a; b--) {
				System.out.print("b");
			}
				System.out.println("");
			}
		for (int a = 0; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(""
						+ "*");
			}
				System.out.println();
			
		}
		for (int line = 1; line <= 5; line++) {
		System.out.print(3 * line + 1 + " ");
		System.out.println();
		 System.out.println();
		 
		}
		String worder = "worder ";
		System.out.println("length of word: " + worder.length()  );
		for (int i = 0; i > worder.length(); i++) {
			System.out.println(worder.charAt(i));
		}
			int number1 = 0;
			int number2 = 1;
			int count = 10;
			
			for (int v = 1; v <= count; v++) {
				System.out.print(number1 + " ");
				
				int sum = number1 + number2;
				number1 = number2;
				number2 = sum;
			}
		}
		}
	



