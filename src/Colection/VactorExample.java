package Colection;

import java.util.*;

public class VactorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<String> ();
		System.out.println("Display Vector index"+v);
		System.out.println("Displa Vector size"+v);
		System.out.println("Vector Capacity:"+v.capacity());
		v.add("Java");
		v.add("Java Scripts");
		v.add("Golang");
		v.add("Language");
		
		v.add("Language");
		v.add("Java");
		v.add(null);
		System.out.println("Print the Vector Value:"+v);
		//accept duplicate-->List interface
		System.out.println("Vector Capacity"+v.capacity());
		
		System.out.println("\nEnumeration");
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(" " + en.nextElement()+" ");
		}
		
	}

}
