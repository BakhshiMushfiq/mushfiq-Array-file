package FlooCondations;

import java.util.Arrays;

public class ArrayClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = {0, 1, 2, 3};
		System.out.println("num :" + Arrays.toString(num));
		num [0] = 45;
		num [1] = 33;
		num [2] = 34;
		num [3] = 76;
		System.out.println("new num: " + Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("sorted arrays:" + Arrays.toString(num));
		char [] myChar = {'a', 'c', 'd', 'A', 'C', 'D'};
		System.out.println("print myChar:" + Arrays.toString(myChar));
		Arrays.sort(myChar);
		System.out.println("Sorted Cahr" + Arrays.toString(myChar));
		String [] mySt = {"ahmad", "zaby", "Qodos"};
		for (String ad: mySt) {
			System.out.println(" "+ ad);
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
}
}