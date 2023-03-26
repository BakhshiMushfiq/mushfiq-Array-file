package NewPrectice;

public class ConstructorEmpoloyee {
	int id;
	String name;
	String position;
	String employer;
	String location;
	double salary;
	
	ConstructorEmpoloyee (){
		
		System.out.println("No args in this Construct");
	}
	ConstructorEmpoloyee (int empoloyeeId, String empoloyeeName, String empoloyeePosition, String empoloyerName,
			String empoloyeeLocation, double empoloyeeSalary){
		id = empoloyeeId;
		name = empoloyeeName;
		position = empoloyeePosition;
		location = empoloyeeLocation;
		salary = empoloyeeSalary;
	
	}
	public String rsp1 () {
		return "1. Overseeing daily business operations";
	}
	public String rsp2 () {
		return "2. Improving the revenue and hiring new employees";
		
	}
	public String rsp3 () {
		return "3. Developing and implementing busin ess strategies";
	}
	public String rsp4 () {
		return "evaluating performances and productivity, indeed anlyzing the financial data";
	}
	public static void main(String[] args) {
		ConstructorEmpoloyee employee = new ConstructorEmpoloyee (101, "Ahmad", "Manager",
				"WellsForgo", "Stafford CA", 67000);
		System.out.println("Employee Information");
		System.out.println("_____________________");
		System.out.println("ID: " + employee.id);
		System.out.println("Name: " + employee.name);
		System.out.println("Position: " + employee.position);
		System.out.println("Location: " + employee.location);
		System.out.println("salary: " + employee.salary);
		System.out.println("\nemempoloyee resp1" + employee.rsp1());
		System.out.println("emempoloyee resp1" + employee.rsp2());
		System.out.println("emempoloyee resp1" + employee.rsp3());
		System.out.println("emempoloyee resp1" + employee.rsp4());


		ConstructorEmpoloyee employee1 = new ConstructorEmpoloyee (455, "rafi", "officer",
				"WellsForgo", "Stafford CA", 67000);
		System.out.println("\nEmployee1 Responsibilityeis");
		System.out.println("_____________________");
		System.out.println("ID: " + employee1.id);
		System.out.println("Name: " + employee1.name);
		System.out.println("Position: " + employee1.position);
		System.out.println("Location: " + employee1.location);
		System.out.println("salary: " + employee1.salary);
		System.out.println("\nemempoloyee resp1" + employee.rsp1());
		System.out.println("emempoloyee resp1" + employee.rsp2());
		System.out.println("emempoloyee resp1" + employee.rsp3());
		System.out.println("emempoloyee resp1" + employee.rsp4());
	}
	}
	

