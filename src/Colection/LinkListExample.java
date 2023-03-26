package Colection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		System.out.println("Display brakets:" +ll);
		System.out.println("Display LiknList size: " +ll.size());
		
		ll.add(6);
		ll.add(4);
		ll.add(5);
		ll.add(2);
		ll.add(3);
		ll.add(1);
		System.out.println("Display Numbers: " + ll);
		boolean b = ll.contains(3);
		System.out.println("is 3 including Numbers:"+b);
		
		ll.push(3);;
		System.out.println(" Push :" +ll);
		ll.set(0, 1);
		System.out.println("set: "+ll);
		
		ll.removeLast();
		System.out.println("Remove Last: "+ll);
		
		System.out.println("\n Display Loop");
		for (Integer loop : ll) {
			System.out.println("  "+loop);
			
					}
		System.out.println("\n Display Iterator Loop");
		Iterator i = ll.iterator();
		while (i.hasNext()) {
			System.out.println("   " + i.next());
		}
		System.out.println("\nDisplay For Loop: ");
		for (int j = 0; j < ll.size(); j++) {
			System.out.println("   " + ll.get(j));
		}



	}

}
