package basic;

public class MoltiplicationLoop {

	public static void main(String[] args) {
		/*
		 Question4: Create a program to generate the Multiplication Table using for loop and print 
		 the result as below.
                    Hint: Create an int data type with value 9, use for loop to loop on that
                     number with the number of count 10 and printf to format your table.

		 */
			int a = 9;
			for (int b = 1; b <= a; b++) {
				System.out.printf("%d * %d = %d \n", a, b, a * b );
			}
	}

}
