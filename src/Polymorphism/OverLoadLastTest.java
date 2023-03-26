package Polymorphism;

public class OverLoadLastTest {
	public static int jam (int d, int g) {
	return d + g;
	}
	public static int jam (int d, int g, int v) {
		return d + g + v;
	}
	public static double jam (double x, double y) {
		return x + y;
		
	}
	public static void main(String[] args) {
		System.out.println(OverLoadLastTest.jam(3, 5));
		System.out.println(OverLoadLastTest.jam(23, 3, 23));
		System.out.println(OverLoadLastTest.jam(9786, 3442));
	}
}
