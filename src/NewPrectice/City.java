package NewPrectice;

public class City {
	String name;
	long population;
	int size;
	double area;

	public void display() {
		System.out.println("city Name: " + name);
		System.out.println("Population : " + population);
		System.out.println("size :"  + size);
		System.out.println("area: " + area);
	
	}
	public static void main (String[]args) {
		City sacramento = new City ();
		sacramento.name = "Sacramento";
		sacramento.population = 23444;
		sacramento.size = 3322;
		sacramento.area = 232.32;
		 sacramento.display();
		
	}
	}

