package basic;

public class SwitchChar {

	public static void main(String[] args) {
		/*
		 Create a program to check whether an alphabet character
		  is vowel or consonant using switch statement
            Hint: Create a variable with char data type, 
             use switch statement with the cases if they 
             are vowel, else break it and print the default statement. 

		 */
			char group = 'A';
			switch (group) {
			case 'A':
				System.out.println("Student Assigned in Medical Department");
				 break;
			case 'B':
				System.out.println("Assigned in Engineering Department");
				break;
			case 'C':
				System.out.println("Assigned in Jornalist faculty");
				break;
			case 'D':
				System.out.println("Student Assigned in computer since");
				break;
				default:
					System.out.println("Sorry, You are not pass in this Concor,"
							+ " please attend afther one year");
			}
	}

}
