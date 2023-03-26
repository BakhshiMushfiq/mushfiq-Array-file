package NewPrectice;

public class Method1 {
	int id;
	String name;
	int age;
	double fee;
	
	public String resp () {
		return ("1. the empeloyee must scort the customer inside");
	}
	public String resp2 () {
		return ("2. the empoloyee is resposible to hold the meeting");
		
	}
	public static void main(String[] args) {
		Method1 obj = new Method1 ();
		obj.id = 32;
		obj.name = "Ahmad";
		obj.age = 45;
		obj.fee = 345;
		System.out.println("ID: " + obj.id + "\nName: " + obj.name + "\nAge: " + obj.age + obj.fee);
	}
	}
	
