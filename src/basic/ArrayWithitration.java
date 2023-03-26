package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayWithitration {

	public static void main(String[] args) {
		/*
		 Question 3 : Create a program to reverse the array elements
Hint : Follow the below steps
•	
o	Initialize variable to count, start the count from zero with a different variable and then store it in a temp variable
o	Use scanner class to enter N number of array elements
o	Ask the system How many elements you want to enter
o	Save them to the counter
o	Loop through all the elements that you enter. First element is at number [0], second at number [1] and so on
o	Then create another logic to swap first element with last element, second last element with second element and so on.
o	On the first iteration of the loop using a while loop, i is the index of first element and j is the index of the last.
o	On the second iteration i is the index of second and j is the index of second last
o	At the end print “Reversed array”
o	Array Example should be like this:
 
Output: 
How many elements do you want to enter?  3
Array Element1: 1
Array Element2: 2
Array Element3: 3
Reversed array: 3 2 1

		 */
		
		int num [] = new int [4];
		num [0] = 1;
		num [1] = 2;
		num [2] = 3;
		
		
		System.out.print("Array Element1: " + Array.getInt(num, 0));
		System.out.print("\nArray Element2: " + Array.getInt(num, 1));
		System.out.print("\nArray Element3: " + Array.getInt(num, 2));
	System.out.println("\n\nArray Element: ");
	
		for (int i = 1; i > 0; i--) {
			
			System.out.println("1 2 3");
		}
	
}
}