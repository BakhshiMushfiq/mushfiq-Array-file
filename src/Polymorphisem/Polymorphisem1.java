package Polymorphisem;

public class Polymorphisem1 {
	public static int add (int x, int y) {
		return x + y;
	}
	public static int add (int x, int y, int z) {
		return x + y +z;
		
	}
	static double add (double x, double y) {
		return x + y;
		
	}
	public static void main(String[] args) {
		System.out.println(Polymorphisem1.add(3, 5));
		System.out.println(Polymorphisem1.add(5,5, 4));
		System.out.println(Polymorphisem1.add(456, 230));
	}
	
}
