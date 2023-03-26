package basic;

import java.util.Scanner;

public class IntederNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int n3;
		Scanner zarb = new Scanner (System.in);
		System.out.println("Moltipilication Result");
		n1 = zarb.nextInt();
		
		System.out.println("Moltipilication Result 2");
		n2 = zarb.nextInt();
		n3 = n1 * n2;
		System.out.println(" Totle Result = " + n3);
	}

}
