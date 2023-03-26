package Colection;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> st = new Vector <String> ();
		System.out.println("Display the vector index" +st);
		System.out.println("Display The Vector size: "+st.size());
		
		st.add("Stave");
		st.add("Crist");
		st.add("dave");
		st.add("faver");
		st.add("Stave");
		st.add("Stave");
		st.add("Crist");
		st.add("dave");
		st.add("faver");
		st.add("Stave");
		st.add("dave");
		st.add("faver");
		st.add("Stave");
		System.out.println("Vector Names: "+st);
		
		System.out.println("Capacity: "+st.capacity());
		st.remove("faver");
	System.out.println("print the remove:"+st);
	st.remove("faver");
	System.out.println("print the remove:"+st);
	st.remove("faver");
	System.out.println("print the remove:"+st);
	
	for (String s : st) {
		System.out.println("   "+s);
		
		
		
	}
	System.out.println("Print the for Loop");
	for (int j = 0; j < st.size(); j++) {
		System.out.println("   "+ st.indexOf(j));
	}
	
	}

}
