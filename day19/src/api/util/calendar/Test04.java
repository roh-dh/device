package api.util.calendar;

import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
//	준비
		int year = 2020;
		int month = 5;

//	계산
//	1. 처음 출력되어야 하는 날짜를 계산
//	-year년  month월 1일의 요일을 구하여 전달을 몇개 출력하는지 계산	
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);// 요일 일요일
		System.out.println(week);
		int minus = week - 1;
		c.add(Calendar.DATE, -minus);//날짜 조정
		
		System.out.println(c.getTime());

//		2.계산된 날짜부터 42번(7번씩 6줄) 출력
		for(int i =0; i<42; i++) {
//			System.out.print(c.get(Calendar.DATE)+"\t");
			
			if(i%7==6) {
//				System.out.println();
			}
//			c.add(Calendar.DATE,1); //1일 증가
		}
		
	}
}
