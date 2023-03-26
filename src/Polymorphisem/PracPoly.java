package Polymorphisem;

public class PracPoly {
	public static int car (int a, int b) {
		return a + b;
		
	}
	public static double car (double a, double b) {
		return a * b;
	}
	static int car (int x, int y, int z) {
		return x - y- z;
		
	}
	public static void main(String[] args) {
		System.out.println(PracPoly.car(5, 13));
		System.out.println(PracPoly.car(5, 4));
		System.out.println(PracPoly.car(123, 34, 23));

	}
	
}
