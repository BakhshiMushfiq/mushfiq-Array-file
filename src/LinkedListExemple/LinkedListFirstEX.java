package LinkedListExemple;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFirstEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> fruits = new LinkedList <String> ();
		System.out.println("linkedList Exemple" + fruits);
		System.out.println("linkedList size" + fruits.size());
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("pea");
		System.out.println("Fruits Name: "+ fruits);
		fruits.add("banana");
		System.out.println("Fruits Name: "+ fruits);
		fruits.remove(0);
		System.out.println("Fruits Name: "+ fruits);
		System.out.println("peek list:" +fruits.peekFirst());
		System.out.println("peek list:" +fruits.peekLast());
		fruits.pop();
		System.out.println("Fruits Name: "+ fruits);
		fruits.push("straberry");
		System.out.println("Fruits Name: "+ fruits);
		System.out.println("GetOption:" +fruits.getLast());
		Iterator g = fruits.descendingIterator();
		while (g.hasNext()) {
			System.out.println("  " + g.next());
		}
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("Friuts Name : " + fruits.get(i));
			
			System.out.println("\nAdvance loop");
		}
		for (String f: fruits) {
			System.out.println("Name:" + f);
		}
	}
}
