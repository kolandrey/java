package contactlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeHelper {
	private static final String DATAFORMAT = "dd.MM.yyyy";
	public static Date formatDate(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		Date d = c.getTime();
		return d;

	}

	public static Date formatDate(String date) {
		SimpleDateFormat format = new SimpleDateFormat(DATAFORMAT);
		try {
			return format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
	
	public static String formatDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat(DATAFORMAT);
		return format.format(date);
	}
}
