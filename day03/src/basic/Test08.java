package basic;

import java.lang.*;

public class Test08 {

	public static void main(String[] args) {
		/*
		 * Test08.java 어제는 3시간 20분 공부하고, 오늘은 2시간 50분 공부했습니다. 다음을 계산하여 출력하세요.
		 * 
		 * 1. 어제 공부한 시간과 오늘 공부한 시간의 합계 시간 2. 어제 공부한 시간과 오늘 공부한 시간의 차이
		 

//입력

		int yesterday = 3 * 60 + 20;
		int today = 2 * 60 + 50;

//계산
		int hour = ((yesterday + today)) / 60;
		int minute = (yesterday + today) % 60;
		int hour2 = ((yesterday - today) / 60);
		int minute2 = (yesterday - today) % 60;

//출력
		System.out.println(hour + "시간 " + minute + "분");
		System.out.println(hour2 + "시간 " + minute2 + "분");
*/
//입력
		int yesHour = 3 , yesMin = 20;
		int todayHour = 2 ,  todayMin = 50;

//계산
//어제 공부한 시간(분) 오늘 공부한 시간(분), 합계, 차이
		int yesTime = yesHour * 60 +yesMin;
//		System.out.println(yesTime);		
		
		int todayTime = todayHour * 60 + todayMin;

		int total = yesTime + todayTime;
		int gap = yesTime - todayTime;
//출력
	System.out.println("합계");
	System.out.println(total / 60+"시간");
	System.out.println(total % 60+"분");

	System.out.println("차이");
	System.out.println(gap / 60+"시간");
	System.out.println(gap % 60+"분");
	}

}
