package LoopProject;

public class PowerOnLoop {

	public static void main(String[] args) {
		/*
		 * Question 1 : Write a program to calculate power of a number using loop
		 * condition.
		 * 
		 * Hint: The program that you are creating should calculate the power of a given
		 * number.
		 * 
		 * The number should be base and p variable should be the power (exponent).
		 * Example: 2^5 = 32 which means (2 * 2 * 2 * 2 * 2)
		 */
		
		
		int basName = 5;
		int powName = 2;
		int result = 1;
		for (int i = 0; i < basName ; i++) {
			result = result * powName;
			System.out.println("Power Result : " + result );
			
			
		}
		int [][] adition = {
				{1, 2, 3},
				{4 ,5 , 6},
				{7 ,8 ,9},
				{0}
				
		};
	
				
		
		for (int i = 0; i < adition.length; i++) {
			for (int j = 0; j < adition[i].length; j++) {
				
				System.out.print(adition[i][j]);
			}
			System.out.println();
		}
		
	}

}
