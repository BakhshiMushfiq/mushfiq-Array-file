package Methods;

public class MyConstructorR {
	int id;
	String modle;
	int madeIn;
	String color;
	double price;
	
	MyConstructorR (){
		System.out.println(" >>> Information about the Car<<<");
	}
	MyConstructorR (int id, String modle, int madeIn, double price){
		this.id = id;
		this.modle = modle;
		this.madeIn = madeIn;
		this.price = price;
	}
		public String CarFeatures1() {
			return "1. Gass saving new feature tha save 5Galon then previous modle";
		}
		public String CarFeatures2 () {
			return "2. a very strong sinsor at the bumper that control all the situations;";
			
					
		}
		public static void main(String[] args) {
			MyConstructorR obj = new MyConstructorR ();
			obj.id = 12;
			obj.modle = "Toyota";
			obj.madeIn = 2022;
			obj.price = 345667;
			
			System.out.println("ID : " + obj.id);
			System.out.println("Modle : " + obj.modle);
			System.out.println("Made IN : " + obj.madeIn);
			System.out.println("Price : " + obj.price);
			System.out.println("\nCar Feauture Information");
			System.out.println("Feature 1:" + obj.CarFeatures1());
			System.out.println("Feature 2:" + obj.CarFeatures2());
			
			System.out.println("\n another type of car:");
			MyConstructorR obj2 = new MyConstructorR();
			obj2.id = 132435;
			obj2.modle = "lexus";
			obj2.madeIn = 2010;
			obj2.price = 123000;
			System.out.println("ID : " + obj2.id);
			System.out.println("Modle : " + obj2.modle);
			System.out.println("Made IN : " + obj2.madeIn);
			System.out.println("Price : " + obj2.price);
			System.out.println("Feature 1:" + obj.CarFeatures1());
			System.out.println("Feature 2:" + obj.CarFeatures2());
			}
		}
	
	
	

