package OopsTest;

public class OopsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopsulationEx obj = new CopsulationEx ();
		obj.setSSN(13456787);
		obj.setAge(34);
		obj.setName("Zabi Karimi");
		System.out.println("\n<<<New Aplicant General Information>>>");
		System.out.println("\nAplicant SSN : " + obj.getSSN());
		System.out.println("Aplicant Age : " + obj.getAge());
		System.out.println("Aplicant Name : " + obj.getName());

	}

}
