package Abstraction;

public class StringBir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		;
			String str2 = "hello";
			if (str1 == str2) {
				System.out.println("Str1 and str2 is equale");
			}else {
			System.out.println("str1 and str2 is not equal");
			}
			String str3 = new String ("Hello");
			String str4 = new String ("Hello");
			if (str3.equals(str4)) {
				System.out.println("str3 and str4 is equl");
			}else {
				System.out.println("str3 and str4 is not equl");
			}
			String name = new String ("Ahmad");
			System.out.println(name);
			System.out.println(name.length());
			System.out.println(name.toUpperCase());
			
			String instance_variable = "object";
			String object = new String ("objact");
			if (instance_variable.equals(object)) {
				System.out.println("Equal");
			}else {
				System.out.println("not Equal");
			}
			String s = "Ahmad";
			String j = new String ("Ahmad");
			if (s.equals(j)) {
				System.out.println("Equal");
			}else {
				System.out.println("it is not equal");
			}
			StringBuffer str = new StringBuffer ("hello  ");
			System.out.println("String: " +str);
			
			int capacity = str.capacity();
			System.out.println("String capacity -->: " + capacity);
			
			str.append("Rainbo");
			System.out.println("String with append: " + str);
			
			System.out.println("String size: "+ str.length());
			
			str.insert(0, "Hi how are you  ");
			System.out.println(str);
			
			str.deleteCharAt(5);
			System.out.println(str);
			
			str.replace(4, 5, "w");
			System.out.println(str);
			str.insert(4, "o");
			System.out.println(str);
			
			StringBuffer t = new StringBuffer ("Java");
			System.out.println("java character: " + t.length());
			
			t.replace(1, 2, "e");
			System.out.println(t);
			
			
			}
	
		
}
