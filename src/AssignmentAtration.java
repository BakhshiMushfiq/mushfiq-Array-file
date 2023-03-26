
public class AssignmentAtration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "December";
		System.out.println("Month of the year: " + month);
		System.out.println("length of the month: " + month.length());
		System.out.println("Chracter at position 0: " + month.charAt(0));
		System.out.println();
		
		for (int i = 0; i < month.length() - 1; i++) {
			char character = month.charAt(i);
			System.out.println("character at   " + i + "  position  " + character);
			System.out.println("\n Next");
		}
		String mon = "october";
		System.out.println("Month of the year: " + mon);
		System.out.println("Length of the month " + mon.length());
		System.out.println("chara at postion 0 " + mon.charAt(0));
		System.out.println();
		for (int i = 0; i < mon.length() - 1; i++) {
			char charac = mon.charAt(i);
			System.out.println(" charac at  "  +  i + " position  " +  charac);
		}
	}

}
