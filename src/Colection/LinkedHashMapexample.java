package Colection;

import java.util.*;

public class LinkedHashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer, String> lhm = new LinkedHashMap <Integer, String>();
		System.out.println("Display LinkedHashMap index"+lhm);
		System.out.println("Display LinkedHashmap Size:" +lhm.size());
		
		lhm.put(3, "Saboor");
		lhm.put(1, "safe");
		lhm.put(4, "gfdr");
		lhm.put(2, "qaader");
		lhm.put(5, "Sooabr");
		
		System.out.println("Print LHM Values:" +lhm);
		lhm.put(null, null);
		System.out.println("Print LHM Values:" +lhm);
		lhm.remove(3, "Saboor");
		System.out.println("Print Remove Values:" +lhm);
		
		boolean b = lhm.containsKey(2);
		System.out.println("Print search Values:" +b);
		 
		System.out.println("\nIterator");
		Set s = lhm.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			//System.out.println("Print Iterator: " + me.getKey());
			System.out.println("Print Iterator: " + me.getValue());
		}


	}

}
