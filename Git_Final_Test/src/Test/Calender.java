package Test;

import java.util.Calendar;

public class Calender {
	//현재 날짜 가져오기
		Calendar calendar = Calendar.getInstance();
	    int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	    
	    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	

}
