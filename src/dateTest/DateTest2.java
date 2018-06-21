package dateTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1994, 3, 7);
		System.out.println(date.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")));
		
		
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.get(Calendar.MONTH)+1);
		
		DateFormat format = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
		System.out.println(format.format(cal.getTime()));
		
		cal.add(Calendar.MONTH, -1);
		
		Calendar cal2 = Calendar.getInstance();
		
		if (!(cal2 == cal)) {
			for (int i = 0; i <=200; i++) {
				
				cal.add(Calendar.DATE, -30);
				cal2.add(Calendar.MONTH, -1);
				
				System.out.println("J "+format.format(cal.getTime()));
				System.out.println("A "+format.format(cal2.getTime()));
			}
		}
	}

}
