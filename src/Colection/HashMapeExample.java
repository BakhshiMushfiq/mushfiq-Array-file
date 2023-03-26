package Colection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hm = new HashMap <Integer, String> ();
		System.out.println("Display HashMap Index"+hm);
		System.out.println("hashmap size: " +hm.size());
		
		hm.put(4, "Ahmad");
		hm.put(2, "Jamshid");
		hm.put(3, "Sabor");
		hm.put(6, "Shahir");
		hm.put(5, "Zalim");
		System.out.println(" Print name:"+hm);
		
		hm.put(null, null);
		System.out.println(" Print name:"+hm);
		
		System.out.println(" Print name:"+hm.remove(1, "Jamshid"));
		
		System.out.println("\nAdvace Loop");
		Set h = hm.entrySet();
		Iterator i = h.iterator();
		while (i.hasNext()) {
			Entry mentry = (Map.Entry)i.next();
			System.out.println(mentry.getKey()+ "=");
			System.out.println(mentry.getValue());
			
			
		}
	}

}
