package FlooCondations;

public class HolyLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chari = 'A';
		while (chari <= 'Z') {
			System.out.print(chari + " ");
			chari++;
		}
		System.out.println("\n another exemple");
		char c = 'z';
		do {
		System.out.print(c + " ");
		c--;
		}while (c >= 'a');
		
		System.out.println("\n Newt ");
		char y = 'z';
		do {
			System.out.print(y + " ");
			y--;
		}while (y >= 'a');
		System.out.println("\n next topic");
		int e = 1;
		while (e <= 10) {
			
			System.out.print(e + " ");
			e++;
			
		}
		System.out.println("\n Grade");
		for (int p = 0; p <= 8; p++) {
		for (int r = 0; r <= 8; r++) {
		if (p >= r) {
			System.out.print("  *   " + "  " + " ");}
		}
			System.out.println("\n");
		}
			
			for (int m = 8; m >= 0; m--) {
			for (int n = 8; n >= 0; n--) {
			if (m >= n) {
				System.out.printf("  *   " + "  ");}
			}
				System.out.println("  \n");
		}
		
		}
		}
	


