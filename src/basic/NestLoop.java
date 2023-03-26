package basic;

import javax.annotation.processing.SupportedSourceVersion;

public class NestLoop {

	public static void main(String[] args) {
		/*
		 Question1: Create a program to check whether an alphabet 
		 character is vowel or consonant using if. . . else statement
         Hint: Create a variable with char data type, use 
         if.. else statement with the condition of == and || operators 

		 */
		char grade = 'D';
		
		if (grade == 'A' || grade == 'B') {
			System.out.println("Excellent");
		}else if (grade == 'C' || grade == 'D') {
			System.out.println("Good");
			
		}else {
			System.out.println("Student Needs improvment");
		}
	}
}

