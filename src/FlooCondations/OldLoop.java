package FlooCondations;

public class OldLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {1.9, 2.9, 3.4, 3.5};
		System.out.println("length Size" + list.length);
		for (int i = 0; i <= 3; i++) {
			System.out.println(list[i]);
			
		}
		double total =  0;
		for (int i = 0 ; i < list.length; i++) {
			total += list[i];
	
			}
		System.out.println("list totale: " + total);
		System.out.println("\n");
	}
		
	
	}


