package NewPrectice;
	
public class Reconstructor {
int id;
String name;
String lName;
double salary;

Reconstructor (){
	System.out.println("First constructor is Empty");
}
Reconstructor (int myid, String myName, String myLastName, double mysalary){
	id = myid;
	name = myName;
	lName = myLastName;
	salary = mysalary;
	
}
public String rspons1 () {
return "1 . the candidate responsible to scort the empoloyee inside the compound";

}
public String respons2 () {
	return "2 . the candidate is responsible to interviwe the new empoloyee";
	
}
public static void main(String[] args) {
	Reconstructor info = new Reconstructor (123, "Zabi", "qabizan", 49945);
	System.out.println("ID : " + info.id );
	System.out.println("Name : " + info.name );
	System.out.println("Last Name : " + info.lName );
	System.out.println("Salary : " + info.salary );
	
	System.out.println("Responsibility : " + info.rspons1() );
	System.out.println("Responsibility : " + info.respons2() );


}
}
