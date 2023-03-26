package SuperClass;

public abstract class KeySuper {
	String car_name = "Toyoya";
	
	abstract void start ();
	abstract void stop ();
	 public void method1 () {
		 System.out.println("any vicle has tire");
		 
	 }
	public String vehicle_name (String name) {
		car_name = name;
		return car_name;
		
	
	}
}
