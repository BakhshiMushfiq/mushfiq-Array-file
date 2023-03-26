package StringBuilder;

public class StrinBuild {

	public static void main(String[] args) {
		// String Builder
		StringBuffer sbf = new StringBuffer ();
		StringBuilder sb = new StringBuilder ("Tony");
		sb.reverse();
		System.out.println("Reverse Tony: " + sb);
		
		System.out.println("Size: " + sb.length());
		
		sb.setCharAt(0, 'S');
		System.out.println("Replace T to S: " + sb);
		
		sb.replace(2, 3, "o");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println("Reverse Tony; " + sb);
		
		sb.replace(2, 3, "n");
		System.out.println(sb);
		
		sb.replace(3, 4, "y");
		System.out.println("Replace:" + sb);
	}

}
