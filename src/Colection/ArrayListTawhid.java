package Colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTawhid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> t = new ArrayList <Integer> ();
		System.out.println("Display" + t);
		System.out.println("Display size:"+ t.size());
		
		t.add(4);
		t.add(5);
		t.add(3);
		t.add(2);
		t.add(1);
		System.out.println("Display Number" + t);
		t.add(6);
		System.out.println("Display Number" + t);
		Collections.sort(t);
		System.out.println("Sort:"+ t);
		t.remove(5);
		System.out.println("Display Number" + t);
		
		System.out.println("\nDisplay Advance Loop");
		
		for (Integer l : t) {
			System.out.println("   " +l);
		}
		System.out.println("\nDisplay Iteration");
		Iterator x = t.iterator();
		while (x.hasNext()) {
			System.out.println("   "+ x.next());
		}
		System.out.println("Display for Loop");
		for (int i = 0; i < t.size(); i++) {
			System.out.println("   "+ t.get(i));
		}
		t.clear();
		System.out.println("Clear: " + t);

		
		
	}

}
