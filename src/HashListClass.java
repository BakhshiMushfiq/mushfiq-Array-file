import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class HashListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hs = new HashSet <String> ();
		System.out.println("Desplay Index" + hs);
		System.out.println("Desplay Size: " + hs);
		
		hs.add("Ahmad");
		hs.add("Zaby");
		hs.add("Qodos");
		hs.add("Zakir");
		
		System.out.println("Display" + hs);
		hs.add("Zaby");
		System.out.println("Display" + hs);
		boolean h = hs.contains("Zaby");
		System.out.println("is Zaby contain list:" + h);
		hs.remove("Zaby");
		System.out.println("Remove zaby:" + hs);
		
		for (String s : hs) {
			System.out.println("	 "+ s);
			
		}
		System.out.println("\nIterator: ");
		Iterator g = hs.iterator();
		 while (g.hasNext()) {
		 System.out.println("	 " + g.next());
		 }
		 
	
			 
		 }
		}
		
	
	

	

	


