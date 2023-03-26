package Colection;

import java.util.ArrayList;

public class ListCollec {

	public static void main(String[] args) {
		// Collection
		ArrayList <String> arrayList = new ArrayList <String> ();
		System.out.println("Array List: " + arrayList);
		
		arrayList.add("Ahmad");
		arrayList.add("Samad");
		arrayList.add("zaby");
		arrayList.add("Ahmad");
		System.out.println("Array List: " + arrayList);
		arrayList.add(0, "Shokor");
		System.out.println("Array List: " + arrayList);
		arrayList.set(2, "sajid");
		System.out.println("Array List: " + arrayList);

	}

}
