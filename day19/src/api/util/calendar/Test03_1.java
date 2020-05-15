package api.util.calendar;

import java.util.*;


public class Test03_1 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.println("년을 입력하세요.");
		int y = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int m = sc.nextInt();
		System.out.println("일을 입력하세요.");
		int d = sc.nextInt();
		System.out.println("D-day를 입력하세요.");
		int d_day = sc.nextInt();
		
		

//		c.set(Calendar.YEAR, 2000);
		c.set(y, m-1, d - d_day); // 월 조심!

//	정보 확인.get()
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		int month = c.get(Calendar.MONTH); // 0 ~ 11
		System.out.println(month + 1);

		// int day = c.get(Calendar.DAY_OF_MONTH);
		int day2 = c.get(Calendar.DATE);
		// System.out.println(day);
		System.out.println(day2);

		int hour = c.get(Calendar.HOUR);
//		System.out.println(hour);

		int minute = c.get(Calendar.MINUTE);
		// System.out.println(minute);

		int second = c.get(Calendar.SECOND);
		// System.out.println(second);

		int week = c.get(Calendar.DAY_OF_WEEK);
		// System.out.println(week);// 일월화수목금토(1~7)

	}
}
