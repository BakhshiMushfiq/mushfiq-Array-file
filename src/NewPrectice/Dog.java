package NewPrectice;

public class Dog {
	String breed;
	int age;
	String color;
	public static void eat () {
		System.out.println("Dog is eat:");
	}
			public static void sleep () {
				System.out.println("Dog is Sleep");
				
			}
			public static void playing() {
				System.out.println("Dog is playing");
			}
			public String getInfo () {
				return ("\n breed is: " + breed + "Age is:" + "color is:" + color);
			
			}
			public static void main(String[] args) {
				Dog maltese = new Dog ();
				maltese.breed = "Maltese";
				maltese.age = 2;
				maltese.color = "Black";
				System.out.println(maltese.getInfo());
				eat();
				sleep();
				playing();
				
				}
	}

