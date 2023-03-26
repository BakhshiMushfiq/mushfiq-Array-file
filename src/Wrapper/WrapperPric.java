package Wrapper;

public class WrapperPric {
	
	public static void method1 (int number) {
		System.out.println(number);
	}
	
	static void method2 (double d) {
		System.out.println(d);
		
		
	}
	public static void main(String[] args) {
		Integer obj = new Integer (12);
		 method1(obj);
		 
		 
		 
		 Double dobj = new Double (5.4);
		 method2(dobj);
	}
}
