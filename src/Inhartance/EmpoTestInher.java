package Inhartance;

public class EmpoTestInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpoloyeeIn e = new EmpoloyeeIn ();
		e.age = 2;
		e.name = "Zaby";
		e.Salary = 300;
		
		System.out.println("Empoloyee Age: " + e.age);
		System.out.println("Empoloyee Name: " + e.name);
		System.out.println("Empoloyee Salary: " + e.Salary);
		e.eating();
		e.working();
	}

}
