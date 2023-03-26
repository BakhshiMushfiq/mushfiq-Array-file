package Inhartance;

public class TestInherAni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animails an = new Animails ();
		an.age = 2;
	
		an.name = "GermanShiper";
		System.out.println( "Animail Age: " + an.age);
			System.out.println("Animal Name:" + an.name);
			an.eat();
			an.sleep();
			
		}
	}


