package FlooCondations;

public class NasstedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table of " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.print(" " + i * j);
				
			}
			System.out.println();
		}
			System.out.println(" \n My Exemple");
			for (int t = 10; t <= 20; t++) {
				System.out.println(" Tabe of loop" + t);
				for (int w = 10; w <= 20; w++) {
					System.out.print(" " + t * w);
				}
				System.out.println();
			}
			for (int i = 1; i <= 10; i++) {
				if (i == 7) {
					continue;
				}
				System.out.println("count: " + i);
				}
			for (int j = 1; j <= 10; j++) {
				if (j == 7) {
					break;
				}
				System.out.println("count: " + j);
			}
			System.out.println(" \n End this session");
			for (int k = 1; k <= 10; k++) {
				System.out.println("Table of :" + k);
				for (int r = 1; r <= 10; r++) {
					System.out.print(" " + (k * r));
					
				}
				System.out.println();
			}
		}
}


