package LoopProject;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<= 10; i++){
			if (i == 4) {
				break;
			
			}
		
			System.out.println("continue "+i);
		}
		System.out.println("\nContinue loops");
		for (int j = 1; j <= 6; j++) {
			if (j == 5) {
				continue;
			}
			System.out.println("count: "+j);
		}
		for (int x = 1; x < 10; x++){
			if (x == 6) {
				break;
			}
			System.out.println("Display Breaked : "+x);
		}
		for (int d = 1; d < 10; d++) {
			if (d == 7) {
				continue; 
			}
			System.out.println("Display Continue:  "+d);
		}
	}

}
