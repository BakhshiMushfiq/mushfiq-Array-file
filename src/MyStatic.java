import java.util.Arrays;

public class MyStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myInt = new int [5];
		System.out.println("Printing my int" + Arrays.toString(myInt));
		for (int i = 0; i < myInt.length; i++) {
	}
		String [] myString = new String [5];
		System.out.println("Printing my int" + Arrays.toString(myString));
		for (int i = 0; i < myString.length; i++) {
}
		double [] mydouble = new double [5];
		System.out.print("Printing mydouble" + Arrays.toString(mydouble));
		for (int i = 0; i < mydouble.length; i++) {
	}
		
		char [] myChar = new char [5];
		myChar [0] = 'a';
		System.out.print("Printing myChar" + Arrays.toString(myChar));
		for (int i = 0; i < myChar.length; i++) {
	}
		int [] mySort = {50, 45, 32, 23};
		System.out.print("Unsorted" + Arrays.toString(mySort));
		Arrays.sort(mySort);
		System.out.println("sorted Arrays: " + Arrays.toString(mySort));
	
		String [] sortString = {"Ahmad", "Zaby", "zakir"};
		System.out.println("sorted" + Arrays.toString(sortString));
		Arrays.sort(sortString);
		System.out.println("sorted: " + Arrays.toString(sortString));
		

}
}
