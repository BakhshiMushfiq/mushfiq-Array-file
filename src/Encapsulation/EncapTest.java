package Encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnFirstExample En = new EnFirstExample ();
		En.setSsn(123456789);
		En.setAge(25);
		En.setName("Ahmad");
		System.out.println("SSN : " + En.getSsn());
		System.out.println("Age : " + En.getAge());
		System.out.println("Name : " + En.getName());

		}

}
