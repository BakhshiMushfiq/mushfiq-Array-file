package Colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> in = new ArrayList <Integer>();
		System.out.println("Display ArrayIndex" + in);
		System.out.println("ArrayList size: "+in.size());
		
		in.add(3);
		in.add(4);
		in.add(2);
		in.add(1);
		in.add(5);
		System.out.println("Display Numbers: "+in);
		
		Collections.sort(in);in.containsAll(in);
		System.out.println("Sorted ArrayList: "+in);
		in.add(null);
		
		System.out.println("Adding Null value: "+in);

		in.remove(5);
		System.out.println("Remove Array:"+in);
		
		
		System.out.println("\nDisplay Advace Loop:");
		for (Integer s : in) {
		System.out.println("   "+s);
		}
		System.out.println("Display Iterator");
		Iterator i = in.iterator();
		while (i.hasNext()) {
		System.out.println("   " + i.next());
	}
	
	System.out.println("\nDisplay for loop");
	for (int j = 0; j < in.size(); j++) {
		System.out.println("   "+ j);
	}

	}

}
		

