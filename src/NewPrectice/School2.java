package NewPrectice;

public class School2 {

	public static void main(String[] args) {
		
		School1 obj1 = new School1();
		obj1.school_name = "Natomas high school";
		obj1.student_name = "Ahmad";
		obj1.student_id = 101;
		obj1.student_g = 1120;
		obj1.address = "400 N street";
		obj1.method1();
		System.out.println("school name: " + obj1.school_name);
		System.out.println("student name: " + obj1.student_name);
		System.out.println("student Id : " + obj1.student_id);
		System.out.println("student grade: " + obj1.student_g);
		System.out.println("student address: " + obj1.address);
	}

}
