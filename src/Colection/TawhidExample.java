package Colection;

import java.util.ArrayList;
import java.util.Collections;

public class TawhidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack <String> Toyota = new ArrayList <String> ();
		System.out.println("Display ArrayList" +Toyota);
		Toyota.add("Corola");
		Toyota.add("Camerry");
		Toyota.add("4Runner");
		Toyota.add("hghtlax");
		Toyota.add("Lancruser");
		Toyota.add(2, "saboor");
		Toyota.set(0, "Lexes");
		System.out.println("Toyota: "+Toyota);
		Toyota.add("Prius");
		System.out.println("Toyota: "+Toyota);
		Collections.sort(Toyota, Collections.reverseOrder());
		System.out.println("Display the Sorted ArrayList: "+Toyota);
	
		System.out.println("\nAdvanced Arraylist Loop\n ");
	for (String z: Toyota) {
		System.out.println(" TOYOTA  "+ z);
	}
	
		
	}

}
