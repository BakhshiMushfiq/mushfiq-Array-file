package Colection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> q = new LinkedList <String> ();
		System.out.println("Deisplay the queue index:"+q);
		
		System.out.println("Display queue size: "+q.size());
		
		q.add("Ahmad");
		q.add("shohib");
		q.add("zarif");
		System.out.println("Display queue Values: " + q);
		
		System.out.println("Head: " + q.element());
		q.remove();
		System.out.println("print remove:" +q);
		System.out.println("Poling queue ; " + q.poll());
		
		System.out.println("Poling queue ; " + q.poll());
		
		System.out.println("adding object ; " + q.add("qudous"));
		System.out.println("Addin ; " + q.add("shokor"));
		System.out.println("Print Adding:" +q);
		
		if (q.contains("shokor")) {
			System.out.println("he is in the list");
		}else
			System.out.println("he is not in the list");
		
		System.out.println("Iterator");
		Iterator <String> i = q.iterator();
		while (i.hasNext()){
		System.out.println(" "+ i.next());
		}
		
		for (int j = 1; j < q.size(); j++) {
		System.out.println("  "+ q);
		
		}
	}

}
