package Colection;

import java.util.ArrayList;

public class ArrayListExapmle4 {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> st = new ArrayList <String> ();
		System.out.println("Display ArrayList Index"+st);
		
		System.out.println("ArrayList Size: "+st.size());
		
		st.add("Wahid");
		st.add("Zaby");
		st.add("Shaker");
		st.add("samy");
		st.add("bashir");
		System.out.println("Display Names:" +st);
		
		st.add(null);
		System.out.println("Display null Names:" +st);
		
		st.remove(5);
		System.out.println("Remove Null:" +st);
		
	



	}

}
