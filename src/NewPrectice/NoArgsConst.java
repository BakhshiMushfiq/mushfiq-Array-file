package NewPrectice;

public class NoArgsConst {
	int x;
	NoArgsConst (){
		x = 3;
		x *= x;
		System.out.println("No Arg Constructor is called");
	}
	public static void main(String[] args) {
		NoArgsConst obj = new NoArgsConst ();
		System.out.println("x: " + obj.x);
		
		new NoArgsConst ();
		new  NoArgsConst ();
		NoArgsConst obj1 = new NoArgsConst ();
		NoArgsConst obj2 = new NoArgsConst ();
		
	}
}
