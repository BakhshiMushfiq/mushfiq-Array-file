package FlooCondations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewArray {

	private static final String[][] Array = null;

	public static void main(String[] args) {
		//
		String [][] myString = {  {"ahmad", "zaby", "nadim"} , {"raby", "sajed", "razaq"}   };
		System.out.println("myString: " + Arrays.toString(myString));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
		System.out.print(myString[i][j]);
			}
			System.out.println();
	}
	}
}