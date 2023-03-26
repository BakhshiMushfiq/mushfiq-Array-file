package basic;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vowel English Elphabet");
		char ch = 'A';
		while (ch <= 'Z') {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println("\n Int Exemple");
		int in = 4;
		while (in <= 12) {
			System.out.print(in + " ");
			in++;
		}
		System.out.println("\n String Exemple");
		String st = "Hellow world";
		while (st == "Hellow world") {
			System.out.println(st + " ");
			st--;
		}
	}

}
