package NewPrectice;

public class ConPractice {
	String name;
	int id;
	String adress;
	

	ConPractice (){
		System.out.println("no notice with this Con");
	}
	ConPractice (String empName, int empId, String empAdress){
		name = empName;
		id = empId;
		adress = empAdress;
		
	}
	public String respons1 () {
	return "1. empoloyee is responsible to fix the customer appoint";
	}
	public String respons2 () {
		return "2. empoloyee is responsible to register the customer";
	}
	public String respons3 () {
		return "3. empoloyee is responsible to fix the customer appoint";
	}
	public static void main(String[] args) {
		ConPractice info = new ConPractice ("Ahmad", 2, "Sacramento");
		System.out.println("Empoloyee ID:: " + info.id );
		System.out.println("Empoloyee Name:: " + info.name );
		System.out.println("Empoloyee Adress:: " + info.adress );
		System.out.println("Empoloyee Responsibility  " + info.respons1() );
		System.out.println("Empoloyee Responsibility  " + info.respons2() );
		System.out.println("Empoloyee Responsibility  " + info.respons3() );

	}
}
