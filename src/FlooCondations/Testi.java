package FlooCondations;

public class Testi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] myNum = {
				{1, 2, 3},
				{4, 5, 6}, 
				{7, 8, 9},
				{0}
		};
		

		for (int i = 1; i < myNum.length; i++) {
			for (int j = 0; j < myNum[i].length; j++) {
				System.out.print("" + myNum [i ] [j] );
			}
			System.out.println();
		
			}
			String [][] myString = {
					{"ahmad", "Zaby", "Qodos"},
					{"zakir", "Najib", "goher"},
					{"Dadullah", "najm", "rafi"},
					{"Khalid"}
					
		};
			for (int l = 0; l < myString.length; l++) {
				for (int m = 0; m < myString[l].length; l++) {
					System.out.print(myString[l][m] );
				}
				System.out.println();
			}
			
	}

}
