package struts.Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DateCal {
	
	private String todaytime;
	private String todaydate;
	private String overtime;
	private String totaltime;
	
	
	public String getTodaytime() {
		
		long systime = System.currentTimeMillis();
		SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
		todaytime = simple.format(new Date(systime));
		
		return todaytime;
	}
	
	public String getTodaydate() {
		
		long systime = System.currentTimeMillis();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd");
		todaydate = simple.format(new Date(systime));
		
		return todaydate;
	}
	
	public String getOvertime(String intime, String outtime) {
		
		
		
		return overtime;
	}
	
	public String getTotaltime(List list) {
		
		
		
		return totaltime;
	}
	

}
