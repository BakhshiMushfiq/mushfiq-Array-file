package basic;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner od = new Scanner (System.in);
		System.out.println("Finding the odd and Even No");
		num = od.nextInt();
		if (num % 2 == 0){
			System.out.println("this is an odd No");
		}else {
			System.out.println("this is an Even No10");
		}
	}

}
