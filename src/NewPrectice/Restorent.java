package NewPrectice;

public class Restorent {
	String neme;
	String menue;
	int price;
	public void disply(){
		System.out.println("Name of the Item: = " + neme);
		System.out.println("Kinds of food: =" + menue);
		System.out.println("Price for each item: = " + price);
	}
	
		public static void main (String[]args) {
			Restorent kfc = new Restorent();
			kfc.neme = " KFC ContinHotle";
			kfc.menue = " Berger, FrenchFrize, Sandwich";
			kfc.price =  10;
			
			kfc.disply();
			
			
}
}
