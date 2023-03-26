package NewPrectice;

public class LasConstructAr {
	int id;
	String name;
	int age;
	String position;
	LasConstructAr (){
		System.out.println("Empoloyer Information");
	}
	LasConstructAr (int num, String myName, int myage, String myPosition){
		id = num;
		name = myName;
		age = myage;
		position = myPosition;
		
		
	}
	public String rsp1() {
		return "1. Gethring of the requirment from customers";
	}
		public String rsp2 () {
			return "2. fixing appointment with the new empoloyee";
		}
		public String rsp3 () {
			return "3. providing the order sheet to the customer";
			
		}
		public static void main(String[] args) {
			LasConstructAr obj = new LasConstructAr (12, "Ahmad", 54, "teacher");
			System.out.println("New Empoloyee Information");
			System.out.println("____________________________");
			System.out.println("ID : " + obj.id);
			System.out.println("Name : " + obj.name);
			System.out.println("Age : " + obj.age);
			System.out.println("Position : " + obj.position);
			System.out.println("Resposibility 1:" + obj.rsp1());
			System.out.println("Resposibility 2:" + obj.rsp2());
			System.out.println("Resposibility 3:" + obj.rsp3());

			
		}
	}
	

