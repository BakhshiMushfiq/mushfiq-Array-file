package Methods;

public class NoSwap {
	public void mySwap (int a, int b) {
		int semp = a;
		a = b;
		b = semp;
		System.out.println("A: " + a + "B: " + b);
	}
	public static void main(String[] args) {
		int a = 34;
		int b = 33;
		System.out.println("a: " + a + "\tb: " + b);
		 int d = 35;
		 int j = 234;
		 System.out.println("D: " + d + "\tJ: " + j);
	}
}
