package api.util.calendar;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
//	Calendar 클래스
//	Calendar c = new Calendar();  보여주기보다는 계산
	Calendar c = Calendar.getInstance();	
	System.out.println(c);


	
	
	
//	정보 확인.get()
	int year = c.get(Calendar.YEAR);
	System.out.println(year);
	
	int month =c.get(Calendar.MONTH); // 0 ~ 11
	System.out.println(month+1);
	
	int day = c.get(Calendar.DAY_OF_MONTH);
	int day2 = c.get(Calendar.DATE);
	System.out.println(day);
	System.out.println(day2);
	
	int hour = c.get(Calendar.HOUR);
	System.out.println(hour);
	
	int minute = c.get(Calendar.MINUTE);
	System.out.println(minute);
	
	int second = c.get(Calendar.SECOND);
	System.out.println(second);
	
	int week = c.get(Calendar.DAY_OF_WEEK);
	System.out.println(week);//일월화수목금토(1~7)
	
	}
}
