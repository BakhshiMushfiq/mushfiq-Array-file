package Inhartance;

public class InTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InherNew w = new InherNew ("breed");
		w.age = 2;
		w.name = "GermanShiper";
		
		System.out.println("Wolf Age is : " + w.age);
		System.out.println("Wolf Name is : " + w.name);
		w.eat();

	}

}
