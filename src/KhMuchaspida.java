import java.util.Scanner;

public class KhMuchaspida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operators;
		double number1;
		double number2;
		double result;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Select an Operator to count:  +, -, /, *");
		operators = s.next().charAt(0);
		System.out.println("you can enter your first number:" );
		number1 = s.nextDouble();
		
		
		
		System.out.println("you can enter your second number:" );
		number2 = s.nextDouble();
		 switch (operators) {
		 case '+':
			 result = number1 + number2;
			 System.out.println(number1 + "+" + number2 + ":" + result);
			 break;
		 case '*':
			 result = number1 * number2;
			 System.out.println(number1 + "-" + number2 + ":" + result);
			 break;
		 case '/':
			 result = number1 * number2;
			 System.out.println(number1 + "/" + number2 + ":" + result);
			 break;
			 default:
				 System.out.println("the operator you've enterd is invailed!");
		 }
		 
		 
		 
		
	}

}
