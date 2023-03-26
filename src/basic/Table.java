package basic;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Print 10 to 1");
		for (int i = 10; i >= 1; i--) {
			System.out.println("i: " +i);
			
		int sum = 0;
		int number = 5;
		 for (int j = 1; j <= number; j++) {
			 sum += i; 
			 System.out.println("sum: " +sum);
		 }
		 String text = "hellow";
		 for (int x = 1; i <= 5; i++) {
			 System.out.println("text: " + text);
			 System.out.println("\n\n Another example");
		 }
		 String str = "Hellow";
		 System.out.println(str.toUpperCase());
		 System.out.println("str lenght: " + str.length());
		 System.out.println("H: " + str.charAt(0));
		
		 System.out.println("\n");
		 for (int v = 0 ; v < str.length(); v++){
			 System.out.println("Str: " +str);
			 System.out.println("Character: " + str.charAt(i));
		 }
		}
	}

}
