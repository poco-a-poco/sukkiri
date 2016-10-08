package tryeProject.MissionTwo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TryOne {
	public static void main (String[] args){
//		Date d = new Date();
		Calendar c = Calendar.getInstance();
//		c.setTime(d);
		c.set(Calendar.DATE,c.get(Calendar.DATE) + 10);
//		d = c.getTime();
		DateFormat df = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(df.format(c.getTime()));
	}
}
