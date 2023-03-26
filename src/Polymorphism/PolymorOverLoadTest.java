package Polymorphism;

public class PolymorOverLoadTest {
	public static int sum (int a ,int b) {
		return a + b;
		
	}
	public static int sum (int a, int b, int c) {
		return a + b + c;
	}
	public static double sum (double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println(PolymorOverLoadTest.sum(23, 24));
		System.out.println(PolymorOverLoadTest.sum(43, 54, 32))
;		System.out.println(PolymorOverLoadTest.sum(56433, 34435));

	}
}
