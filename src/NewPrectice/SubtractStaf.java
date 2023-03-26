package NewPrectice;

public class SubtractStaf {
	public int subNumbers (int x, int y) {
		int subtract = x + y;
		return subtract;
	}
	public static void main (String [] args) {
		int Iphonepro = 57;
		int sale = 35;
		SubtractStaf obj = new SubtractStaf ();
		int outcome = obj.subNumbers(Iphonepro, sale);
		System.out.println("outcome is: " + outcome);
	}
	
}
