package tryeProject.MissionTwo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TryTwo {
	public static void main (String[] args){
			LocalDateTime ld = LocalDateTime.now();
			ld = ld.plusDays(100);
			DateTimeFormatter df = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
			System.out.println(ld.format(df));
	}
}
