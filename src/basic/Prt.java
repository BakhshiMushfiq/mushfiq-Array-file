package basic;

import java.util.Scanner;

public class Prt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p;
		double r;
		double t;
		double simpleInterestRate;
		Scanner sc = new Scanner (System.in);
		System.out.println("pleae enter principle amount");
		p = sc.nextDouble();
		System.out.println("pleae enter rate");
		r = sc.nextDouble();
		System.out.println("pleae enter time perioud");
		t = sc.nextDouble();
		simpleInterestRate = (p* r * t) / 100;
		System.out.println("Simpe Interest Rate: " +simpleInterestRate);
	}

}
