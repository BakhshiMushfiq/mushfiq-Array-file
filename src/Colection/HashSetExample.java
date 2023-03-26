package Colection;

import java.util.HashSet;
import java.util.Iterator;




public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hsc = new HashSet <String> ();
		System.out.println("Display Braket indes: " + hsc);
		System.out.println("Display size: " + hsc.size());
		
		hsc.add("Jorg");
		hsc.add("Crist");
		hsc.add("Soshy");
		hsc.add("Hasim");
		System.out.println("Desplay name: " + hsc);
		
		hsc.add("Sorag");
		System.out.println("Desplay name: " + hsc);
		boolean s = hsc.contains("Jorg");
		System.out.println("is Jorg in the list:" + s);
		
		hsc.add(null);
		System.out.println("Display null:" + hsc);
		hsc.add("Hasim");
		System.out.println("Display Dublicate:" + hsc);
		hsc.remove(null);
		System.out.println("Display Remove null:" + hsc);
		System.out.println(" \nFor Loop Example: ");
		hsc.
		
		System.out.println("\n Advance Loop: ");
		for (String i : hsc) {
			System.out.println("  " + i);
		}
		System.out.println("\nIteration Loop: ");
		
		Iterator iter = hsc.iterator();
			while (iter.hasNext()) {
				System.out.println("  " + iter.next());
			
		}


	}

}
