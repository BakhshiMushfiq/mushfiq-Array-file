package NewPrectice;

public class Cat {
	String breed;
	int age;
	String color;
0
	public static void eat() {

		System.out.println("\nCat is eating");
	}

	public static void sleep() {
		System.out.println("Cat is sleeping");
	}

	public static void playing() {
		System.out.println("Cat is playing");
	}

	public String getInfo() {
		return ("\nBreed is : " + breed + "\nAge is : " + age + "\ncolor is : " + color);

	}

	public static void main(String[] args) {
		System.out.println("Information about my cat");

		Cat maltes = new Cat();
		maltes.breed = "maltes";
		maltes.age = 4;
		maltes.color = "black";
		System.out.println(maltes.getInfo());
		eat();
		sleep();
		playing();

	}
}
