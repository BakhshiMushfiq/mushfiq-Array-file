package Abstraction;

public abstract class StopAndStart {
	
	String car_name = "Corola";

	abstract void start ();
	abstract void stop ();
 

	public void method () {
	System.out.println("any vehicle has tire");
	
}
	public String vehicle_name (String name) {
	car_name = name;
	return car_name;
}

}
