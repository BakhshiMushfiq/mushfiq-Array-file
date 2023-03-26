package Methods;

public class SwepInMethod {
	
	static void swapValues (int x, int y) {
		int temp = x;
				x = y;
				y = x;
				System.out.println("m: " + x + "\t n: " + y);
				}
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		 int m =5;
		 int n = 10;
		 System.out.println("After swapping values using third variables in a method");
	}
	
}
