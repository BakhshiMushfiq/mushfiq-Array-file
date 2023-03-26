import java.time.LocalDate;
import java.util.Date;

public class DateTim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date ();
		System.out.println("Date and Time" + d);
		// Local DAte
		LocalDate ld = LocalDate.now();
		System.out.println("Locat Date: " + ld);
	}

}
