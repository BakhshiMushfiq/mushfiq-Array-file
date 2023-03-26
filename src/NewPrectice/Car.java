package NewPrectice;

public class Car {
	String name;
	String color;
	double price;
	
	public void display() {
		System.out.println("Model of Car: " + name);
		System.out.println("Color of the Car: " + color);
		System.out.println("Price of the Car: 0" + price);
		 
		
		
		
	}
	public static void main(String[] args) {
		Car cr = new Car ();
		cr.name = "Toyota Prius";
		cr.color = "Black";
		cr.price = 1234.43;
		
		cr.display();
		
	}
}
