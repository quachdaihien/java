import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Example {
	public static void main(String[] args) {
//		date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getTime());
		
//  simpleDateFormat
		DateFormat dateFm = new SimpleDateFormat("yyyy/dd/yy hh:mm");
		System.out.println(dateFm.format(d));
//	calendar
		
	Locale lc = new Locale("vi", "VI");
	TimeZone tz = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
	Calendar cl = Calendar.getInstance(tz, lc);
	cl.add(Calendar.HOUR, 25);
	System.out.println(cl.get(Calendar.DAY_OF_MONTH));
//	TimeUnit
	long tu = TimeUnit.MINUTES.toSeconds(3);
	System.out.println(tu);
	}
}
