package NewPrectice;

public class ArgsConstruct {
	String name;
	int id;
	ArgsConstruct (String name, int id){
		this.name = name;
		this.id = id;
		
	}
	public static void main(String[] args) {
		ArgsConstruct student = new ArgsConstruct ("Jon duo", 123);
		System.out.println("Name: " + student.name + "\nId: " + student.id);
	
	}
}
