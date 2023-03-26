package basic;

import java.util.Date;

public class dmvTest {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		// TODO Auto-generated method stub
		int score = 50;
		if (score >= 50 && score <= 70) {
			System.out.println("Good");
		}else if (score >= 71 && score <= 80 ) {
			System.out.println("very Good");
		} else if (score >= 81 && score <= 100) {
			System.out.println("Excellent");
			
		}else {
			System.out.println("faild");
		}
	}

}
