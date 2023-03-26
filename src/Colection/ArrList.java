package Colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arr = new ArrayList <Integer> ();
		System.out.println("Emty arr" + arr);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(5);
		System.out.println("ArrayList Print: " + arr);
		
		arr.add(7);
		System.out.println("ArrayList Print: " + arr);
		System.out.println("size: " +arr.size());
		System.out.println("size: " +arr.remove(2));
		System.out.println("ArrayList Print: " + arr);
		arr.add(3);
		System.out.println("ArrayList Print: " + arr);
		arr.add(4);
		System.out.println("ArrayList Print: " + arr);
		arr.set(2, 3);
		System.out.println("ArrayList Print: " + arr);
		Collections.sort(arr);
		System.out.println("ArrayList Print: " + arr);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("  " + arr.get(i));
			
		}
		System.err.println("\nItrationList loop");
		Iterator i = arr.iterator ();
	
		while (i.hasNext()) {
			System.out.println("  " + i.next());
			//this arry line is just a Test
		}
	}

}
